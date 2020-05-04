package com.test.dynamic.proxy.cglib;

import com.test.dynamic.proxy.User;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("w");
		Enhancer enhancer = new Enchancer();
		enhancer.setSuperclass(UserServiceImpl.class); //������һ���̳���������
		enhancer.setCallback(new UserServiceInterceptor());
		UserServiceImpl usi1 =  (UserServiceImpl)enhancer.create();
		usi1.addUser(user);
		
		
	}
}
