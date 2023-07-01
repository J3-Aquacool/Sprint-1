package com.app.dao;

import com.app.entity.User;

public class IUserDaoImpl implements UserDAO {

	public boolean validateUser(User u) {
		
		if(u.getUsername().equals("java") && u.getPassword().equals("jags"))
			
		return true;
		
		else
			return false;
	}

}
