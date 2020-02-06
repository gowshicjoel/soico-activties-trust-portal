package com.iim.socioactivities.Controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iim.socioactivities.DAO.UserDAO;

@SuppressWarnings("unused")
@Controller
public class MainController {
	
	 @RequestMapping("/socioactivities")
	   public String home(Map<String,Object> model) {  

	    	System.out.println("Test LOADING");
	       return "Homepage";
	 }
}
