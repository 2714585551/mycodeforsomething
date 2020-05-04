package com.test.dynamic.proxy.cglib;


import java.lang.reflect.Method;
import java.util.logging.Logger;

import com.test.dynamic.proxy.User;

public class UserServiceInterceptor implements MethodInterceptor {   //build path 添加  Cglib.jar 包
	private static Logger log = Logger.getLogger(UserServiceInterceptor.class.getName());
	
	public Object intercept(Object obj,Method method,Object[] args, MethodProxy proxy) throws Throwable{
		
		User user = (User) args[0];
		if(user.getUsername().length() <=1){
			throw new RuntimeException("用户名字得大于1");
		}
		
		Object o =  proxy.invokeSuper(obj, args); //子类请求的时候 得执行他的父类才是对应的方法
		log.info("操作成功");
		return o;
		
	
	}
	

}
