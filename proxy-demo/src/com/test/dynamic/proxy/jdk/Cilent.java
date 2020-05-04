package com.test.dynamic.proxy.jdk;

import java.lang.reflect.Proxy;

import com.test.dynamic.proxy.User;

public class Cilent {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("w");
		UserService us = new UserServiceImpl();
		UserServiceInterceptor usi = new UserServiceInterceptor(us);
		UserService proxy  = (UserService)Proxy.newProxyInstance(us.getClass().getClassLoader(), us.getClass().getInterfaces(), usi);//内存生成字节码 从而对象失利后
		proxy.addUser(user);
		System.out.println("proxycode========="+proxy.hashCode());
	}
}
