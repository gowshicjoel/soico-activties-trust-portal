package com.iim.socioactivities.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iim.socioactivities.Model.User;

@SuppressWarnings("unused")
@Repository
@Transactional
public class UserDAOImpl implements UserDAO{
	@Autowired
	JdbcTemplate jDBCTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setjDBCTemplate(JdbcTemplate jDBCTemplate) {
		this.jDBCTemplate = jDBCTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
			
	public boolean authenticationSuccess(String username, String password)
	{
		String sql="SELECT COUNT(Num_login_id) AS CNT FROM Tbl_mst_login WHERE Vch_user_name ='"+username+"' AND Vch_user_password ='"+password+"'";
		System.out.print(sql);
		int cnt = jDBCTemplate.queryForObject(sql, Integer.TYPE);
		System.out.println(cnt);
		if(cnt>0)
			return true;
		else
		return false;
	}
	@Override
	public void userregister(User userreg)
	{
		String sql="insert into tbl_mst_userregister (Num_user_id, Vch_user_name, Vch_user_password, Num_created_by, Num_user_age, Num_user_mobileno, Vch_user_emailid, Vch_user_address, Vch_user_education, Vch_user_job, Vch_user_bloodtype, Chr_active_status, Dtt_join_date, Dtt_creation_date) "
				+ "('"+userreg.getNum_user_id()+"','"+userreg.getVch_user_name()+"','"+userreg.getVch_user_password()+"','"+userreg.getNum_created_by()+"','"+userreg.getNum_user_age()+"','"+userreg.getNum_user_mobileno()+"','"+userreg.getVch_user_emailid()+"',"+userreg.getVch_user_address()+",'"+userreg.getVch_user_education()+"','"+userreg.getVch_user_job()+"','"+userreg.getVch_user_bloodtype()+"','"+userreg.getChr_active_status()+"','"+userreg.getDtt_join_date()+"','"+userreg.getDtt_creation_date()+"','Y',1)";
		System.out.print(sql);
		jDBCTemplate.update(sql);
		
	}	
	@Override
	public Login validateUser (Login login){
		String sql = "SELECT num_user_id from Tbl_mst_login WHERE Vch_user_name = ? and Vch_user_password = ?";
		int count = jDBCTemplate.queryForObject(sql, Integer.class, login.getVch_user_name(), login.getVch_user_password());
		if(count == 0) {
    		        return null;
		} else
		{
			login.setNum_user_id(count);
			return login;
		}
}
	

@Override
public void freeclass_register(User freeclass)
{
	String sql="insert into freeclass_register (register_id, name, age, mobile_no, email_id, address) "
			+ "('"+freeclass.getRegister_id()+"','"+freeclass.getName()+"','"+freeclass.getAge()+"','"+freeclass.getMobile_no()+"','"+freeclass.getEmail_id()+"','"+freeclass.getAddress()+"','Y',1)";
	System.out.print(sql);
	jDBCTemplate.update(sql);
	
}
}