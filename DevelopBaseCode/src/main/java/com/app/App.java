package com.app;

import com.app.dao.IUserDaoImpl;
import com.app.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Welcome All");
    	    User u=new User("java","jags");
    	    
    	    IUserDaoImpl ud=new IUserDaoImpl();
    	    boolean b=ud.validateUser(u);
    	    if(b)
    	    {
    	    	System.out.println("Login Success");
    	    }
    	    else
    	    	System.out.println("Login Failed");
    	    
    }
}
