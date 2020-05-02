/**
 * 
 */
package com.lpp.mq.core.security;

import com.lpp.mq.core.entity.ClientInfoBean;

/**
  * @ClassName: ThreadLocalClient
  * @FullClassPath: com.lpp.mq.core.security.ThreadLocalClient
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月30日 下午5:48:01
  * @version: 1.0
  */

public class ThreadLocalClient {
	
	private static final ThreadLocal<ClientInfoBean> CONTAINER = new ThreadLocal<ClientInfoBean>();
	
	public static void put(ClientInfoBean object){
		CONTAINER.set(object);
	}
	
	public static ClientInfoBean get(){
		return CONTAINER.get();
	}
	
	public static void remove() {
    	CONTAINER.remove();
    }
}
