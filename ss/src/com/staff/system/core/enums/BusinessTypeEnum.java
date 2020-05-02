/**
 * 
 */
package com.staff.system.core.enums;

/**
  * @ClassName: BusinessTypeEnum
  * @FullClassPath: com.lpp.mq.enums.BusinessTypeEnum
  * @Description: 业务类型枚举
  * @author: Arno
  * @date: 2017年3月15日 下午4:31:36
  * @version: 1.0
  */

public enum BusinessTypeEnum {

	LOGIN("login","1000");
	
	private String bizType;
	
	private String bizCode ;

	private BusinessTypeEnum() {

	}
	
	private BusinessTypeEnum(String bizType, String bizCode ) {
		this.bizType = bizType;
		this.bizCode = bizCode ;
	}
	
	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
}
