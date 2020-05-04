package com.test.dynamic.proxy.jdk;

import java.lang.reflect.Proxy;

import com.test.dynamic.proxy.User;

public class Cilent {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("w");
		UserService us = new UserServiceImpl();
		UserServiceInterceptor usi = new UserServiceInterceptor(us);
		UserService proxy  = (UserService)Proxy.newProxyInstance(us.getClass().getClassLoader(), us.getClass().getInterfaces(), usi);//�ڴ������ֽ��� �Ӷ�����ʧ����
		proxy.addUser(user);
		System.out.println("proxycode========="+proxy.hashCode());
	}
}
