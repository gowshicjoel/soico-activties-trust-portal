package com.iim.socioactivities.Controller;
import java.awt.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iim.socioactivities.DAO.Login;
import com.iim.socioactivities.DAO.UserDAO;
import com.iim.socioactivities.Model.User;

@SuppressWarnings("unused")
@Controller
public class MainController {
	@Autowired
	private UserDAO homeService;

	@RequestMapping("/socioactivities")
	   public String home(Map<String,Object> model, HttpServletRequest req) {  
		String user=null;
		
		HttpSession session = req.getSession();
		if(session.getAttribute("user") != null)
		user = session.getAttribute("user").toString();
		
		model.put("user", user);
		
	    System.out.println("Test LOADING :"+user);
	    return "Homepage";
	 }

	 @RequestMapping("/about")
	   public String aboutpage(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "aboutpage";
	 }

	 @RequestMapping("/Freeclass")
	   public String Freeclass(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "Freeclass";
	 }
	 @RequestMapping("/Blooddonation")
	   public String Blooddonation(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "Blooddonation";
	 }
	 @RequestMapping("/Requests")
	   public String Requests(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "Requests";
	 }
	 @RequestMapping("/contact")
	   public String contact(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "contact";
	 }
	 @RequestMapping("/userregister")
	   public String register(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "userregister";
	 }
	 @RequestMapping("/userlogin")
	   public String login(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "userlogin";
	 }
	 @RequestMapping("/candidateregister")
	   public String register1(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "candidateregister";
	 }
	 @RequestMapping("/blooddonar")
	   public String register2(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "blooddonar";
	 }
	 
	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
		public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
		  @ModelAttribute("login") Login login) {
		    ModelAndView mav = null;		  
		    //HttpSession session
			Login user = homeService.validateUser(login);
		    if (null != user) {
		    	
		    	//session.setAttribute("user",user.getVch_user_name());
		    	request.getSession().setAttribute("user", user.getVch_user_name());
		    	request.getSession().setAttribute("userId", user.getNum_user_id());
		    	mav = new ModelAndView("Homepage");
		    	mav.addObject("username", user.getVch_user_name());
		    
		    } else {
		    	//session.setAttribute("user",null);
		    	request.getSession().setAttribute("user", null);
		    	request.getSession().setAttribute("userId", null);
		    	mav = new ModelAndView("login");
		    	mav.addObject("message", "Username or Password is wrong!!");
		    }
		    return mav;
		  }
	

	 @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
		public ModelAndView registerProcess(HttpServletRequest request, HttpServletResponse response,
		  @ModelAttribute("User") User user) {
		    ModelAndView mav = null;		  
		    //HttpSession session
		    user.setNum_created_by((int)request.getSession().getAttribute("userId"));
			homeService.userregister(user);
	    	mav = new ModelAndView("Homepage");
	    	mav.addObject("username", user.getVch_user_name());
		    
		    return mav;
		  }
		
	
	 
	 @RequestMapping(value = "/user", method = RequestMethod.POST)
	    public String checkUser(@RequestBody User userForm, BindingResult result, HttpServletRequest request)
	 	{
		 	//, RedirectAttributes redirectAttrs) {
	        System.out.println("Checking User " + userForm.getVch_user_name()+" Checking Password" + userForm.getVch_user_password()+"test");
	        List users = UserDAO.getAllUsers(userForm.getVch_user_name());
	        boolean userExists = false;
	        String userName = null;
	        //for(User user1 : users){
	//if(user1.getVch_user_name().equalsIgnoreCase(userForm.getVch_user_name()) && user1.getVch_user_password().equalsIgnoreCase(userForm.getVch_user_password())){
	//userExists = true;
	//userName = user.getVch_user_name();
//	System.out.println("User Logged IN " + userForm.getVch_user_name());
	//}
	//}

	        if (!userExists) {
	            System.out.println("Invalid username or password" + userForm.getVch_user_name());
	            //return new ResponseEntity<String>(HttpStatus.CONFLICT);
	        //resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Invalid username or password " + userForm.getVch_user_name()); // explicitely put error message in request
	            return null;
	        }
	        // Save client ...
	        //redirectAttrs.addAttribute("userName", "admin").addFlashAttribute("message", "Client Page!");
	        return "Homepage";
	       
	    }

}
