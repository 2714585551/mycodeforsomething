/**
 * 
 */
package com.lpp.mq.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.core.controller.LoginCotroller;
import com.lpp.mq.core.security.ThreadLocalClient;

/**
  * @ClassName: LoginVerifyFilter
  * @FullClassPath: com.lpp.mq.core.filter.LoginVerifyFilter
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月31日 上午9:14:26
  * @version: 1.0
  */

public class LoginVerifyFilter implements Filter{

	private static final Logger LOGGER = Logger.getLogger(LoginVerifyFilter.class);
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		SysUser sysUser = (SysUser) httpRequest.getSession().getAttribute(LoginCotroller.LOGIN_ACCOUNT);
		LOGGER.info("用户信息：" + JSON.toJSONString(sysUser));
		if(null != sysUser){
			chain.doFilter(request, response);
			return;
		}else{
			if ("/".equals(httpRequest.getRequestURI()) || "/login".equals(httpRequest.getRequestURI())
					|| httpRequest.getRequestURI().contains("/css") || httpRequest.getRequestURI().contains("/img")
					|| httpRequest.getRequestURI().contains("/js")) {
				chain.doFilter(request, response);
				return;
			}
			httpResponse.sendRedirect("/");
			return;
		}
	
	}

	@Override
	public void destroy() {
		ThreadLocalClient.remove();
	}

}
