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

@SuppressWarnings("unused")
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
		String sql="SELECT COUNT(Num_login_id) AS CNT FROM Tbl_mst_login WHERE Vch_user_name ='"+username+"' AND Vch_password ='"+password+"'";
		System.out.print(sql);
		int cnt = jDBCTemplate.queryForObject(sql, Integer.TYPE);
		System.out.println(cnt);
		if(cnt>0)
			return true;
		else
		return false;
	}

}
