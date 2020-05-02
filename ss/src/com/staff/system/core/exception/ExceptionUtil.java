package com.staff.system.core.exception;

import java.io.PrintWriter;
import java.io.StringWriter;


/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月30日 下午7:06:33 
* 类说明 
*/
public class ExceptionUtil {
	public static String getTrace(Throwable t) {
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		t.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		return buffer.toString();
	}
}
 