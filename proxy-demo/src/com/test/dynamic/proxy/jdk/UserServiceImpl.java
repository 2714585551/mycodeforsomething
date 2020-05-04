package com.test.dynamic.proxy.jdk;

import com.test.dynamic.proxy.User;

public class UserServiceImpl implements UserService {

	@Override
	public final void addUser(User user) {
		System.out.println("add user............."+user.toString());		
	}

}
