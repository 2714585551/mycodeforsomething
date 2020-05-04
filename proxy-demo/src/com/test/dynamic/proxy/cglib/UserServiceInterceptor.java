package com.test.dynamic.proxy.cglib;


import java.lang.reflect.Method;
import java.util.logging.Logger;

import com.test.dynamic.proxy.User;

public class UserServiceInterceptor implements MethodInterceptor {   //build path ���  Cglib.jar ��
	private static Logger log = Logger.getLogger(UserServiceInterceptor.class.getName());
	
	public Object intercept(Object obj,Method method,Object[] args, MethodProxy proxy) throws Throwable{
		
		User user = (User) args[0];
		if(user.getUsername().length() <=1){
			throw new RuntimeException("�û����ֵô���1");
		}
		
		Object o =  proxy.invokeSuper(obj, args); //���������ʱ�� ��ִ�����ĸ�����Ƕ�Ӧ�ķ���
		log.info("�����ɹ�");
		return o;
		
	
	}
	

}
