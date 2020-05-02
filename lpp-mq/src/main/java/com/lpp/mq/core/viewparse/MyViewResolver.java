/**
 * 
 */
package com.lpp.mq.core.viewparse;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

/**
 * @ClassName: MyViewResolver
 * @FullClassPath: com.lpp.mq.core.viewparse.MyViewResolver
 * @Description: 配置视图解析器
 * @author: Arno
 * @date: 2017年3月27日 下午1:24:42
 * @version: 1.0
 */

public class MyViewResolver implements ViewResolver {

	private static final Logger logger = Logger.getLogger(MyViewResolver.class);

	private ViewResolver jspResolver;
	private ViewResolver htmlResolver;

	public View resolveViewName(String viewName, Locale locale) throws Exception {
		System.out.println("当前页面：" + viewName);
		if (logger.isDebugEnabled()) {
			logger.debug("当前页面：" + viewName);
		}
		
		if (isJspView(viewName)) {
			return jspResolver.resolveViewName(viewName, locale);
		}
		
		if (isHtmlView(viewName)) {
			return htmlResolver.resolveViewName(viewName, locale);
		}
		
		
		return null;
	}

	private boolean isJspView(String viewName) {
		return viewName.endsWith(".jsp");
	}

	private boolean isHtmlView(String viewName) {
		return viewName.endsWith(".html");
	}

	public void setJspResolver(ViewResolver jspResolver) {
		this.jspResolver = jspResolver;
	}

	public void setHtmlResolver(ViewResolver htmlResolver) {
		this.htmlResolver = htmlResolver;
	}

}
