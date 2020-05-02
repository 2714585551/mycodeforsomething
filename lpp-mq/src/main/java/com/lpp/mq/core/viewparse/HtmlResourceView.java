/**
 * 
 */
package com.lpp.mq.core.viewparse;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.JstlView;

/**
 * @ClassName: HtmlResourceView
 * @FullClassPath: com.lpp.mq.core.viewparse.HtmlResourceView
 * @Description: TODO
 * @author: Arno
 * @date: 2017年3月27日 下午2:12:35
 * @version: 1.0
 */

public class HtmlResourceView extends  JstlView {

	@Override
	public boolean checkResource(Locale locale) {
		File file = new File(this.getServletContext().getRealPath("/") + getUrl());
		return file.exists();// 判断该页面是否存在
	}
}
