/**
 * 
 */
package com.lpp.mq.core.entity;

/**
  * @ClassName: SysPwd
  * @FullClassPath: com.lpp.mq.core.entity.SysPwd
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月31日 下午12:19:32
  * @version: 1.0
  */

public class SysPwd {
	
	private String oldPwd;
	
	private String pwd;
	
	private String confirmPwd;

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
}
