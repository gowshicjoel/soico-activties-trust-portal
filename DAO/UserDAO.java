package com.iim.socioactivities.DAO;

import java.awt.List;

import com.iim.socioactivities.Model.User;

public interface UserDAO {
	boolean authenticationSuccess(String username,String password);

	void userregister(User userreg);

	static List getAllUsers(String vch_user_name) {
		// TODO Auto-generated method stub
		return null;
	}

	Login validateUser(Login login);

	void freeclass_register(User freeclass);
}


