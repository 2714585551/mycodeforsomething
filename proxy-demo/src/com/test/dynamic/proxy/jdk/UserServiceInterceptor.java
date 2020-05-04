package com.test.dynamic.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import com.test.dynamic.proxy.User;

public class UserServiceInterceptor  implements InvocationHandler{

	private Object object;
	
	private static Logger log = Logger.getLogger(UserServiceInterceptor.class.getName());
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(args != null && args.length>0&& args[0] instanceof User){
			User user = (User) args[0];
			if(user.getUsername().length() <=1){
				throw new RuntimeException("用户名字得大于1");
			}
			
			Object o =  method.invoke(object, args);
			log.info("操作成功");
			return o;
			
		}	
		
		
		return null;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public UserServiceInterceptor(Object object) {
		super();
		this.object = object;
	}
	
	

}
