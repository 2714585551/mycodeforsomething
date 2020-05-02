/**
 * 
 */
package com.lpp.mq.core.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: RequestUtil
 * @FullClassPath: com.lpp.mq.utils.RequestUtil
 * @Description: TODO
 * @author: Arno
 * @date: 2017年3月9日 下午6:10:49
 * @version: 1.0
 */

public class RequestUtil {

	public static final String X_REQUESTED_WIDTH = "X-Requested-With";
	public static final String XML_HTTP_REQUEST = "XMLHttpRequest";

	private RequestUtil() {
		
	}

	/** 
	* @Title: isAjaxRequest 
	* @Description: 判断是否ajax请求 (request.getHeader("x-requested-with"); 为 null，则为传统同步请求，为XMLHttpRequest，则为Ajax 异步请求。)
	* @createDate: 2017年3月9日 下午6:16:09
	* @param request
	* @return boolean
	*/ 
	public static boolean isAjaxRequest(HttpServletRequest request) {
		String header = request.getHeader(X_REQUESTED_WIDTH);
		return  header!= null && header.contains(XML_HTTP_REQUEST);
	}

	public static String getCookieValue(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				String cookieName = cookie.getName();
				if (cookieName.equals(name)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}
