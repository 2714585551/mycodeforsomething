package com.test.dynamic.proxy.cglib;

import com.test.dynamic.proxy.User;

public class UserServiceImpl {
	
	public final void addUser(User user) {
		System.out.println("add user............."+user.toString());		
	}


}
