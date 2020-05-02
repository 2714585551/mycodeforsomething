package com.staff.system.core.utils;


import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequestWrapper;

import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;



/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月30日 下午5:55:06 
* 类说明 
*/
public abstract class Basejson extends MultiActionController {

	
	private static final Logger log = Logger.getLogger(Basejson.class);
	/**
	 * 已废弃，为了兼容以前使用struts的写法
	 */
	@Resource(name="httpServletResponseWrapper")
	@Deprecated
    public HttpServletResponseWrapper response = null;
	/**
	 * 已废弃，为了兼容以前使用struts的写法
	 */
    @Resource(name="httpServletRequestWrapper")
    @Deprecated
    public HttpServletRequestWrapper request = null;
	private static boolean isInitVelocity = false;
	
	public void print(String data) {
		response.setCharacterEncoding("utf-8");
		response.setHeader("Cache-Control", "no-cache");
	
			PrintWriter pw;
			try {
				pw = response.getWriter();
				pw.print(data);
				pw.flush();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	public void printJson(String data) {

		response.setContentType("application/json");
		print(data);
	}

	public void printText(String data) {

		response.setContentType("text/html");
		print(data);
	}
	
	public void printXml(String data) {
		response.setContentType("text/xml");
		print(data);
	}
	
	public void printJS(String data) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/x-javascript");
		print(data);
	}
	
	public void printCSS(String data) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/css");
		print(data);
	}
	
	public void printHtml(String data) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		print(data);
	}

	public static String getMsg(String issuccess, String msg) {

		StringBuffer buf = new StringBuffer();
		buf.append("{\"success\":");
		buf.append(issuccess);
		buf.append(",\"data\":{\"msg\":\"");
		buf.append(msg);
		buf.append("\"}}");

		return buf.toString();
	}
	
}
 