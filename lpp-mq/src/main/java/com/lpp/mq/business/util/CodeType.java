/**
 * 
 */
package com.lpp.mq.business.util;

/**
  * @ClassName: CodeType
  * @FullClassPath: com.lpp.mq.business.util.CodeType
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月31日 下午6:13:52
  * @version: 1.0
  */

public enum CodeType {

	YD("YD","运单");
	
	String code;
	String name;
	
	private CodeType(String code,String name){
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
