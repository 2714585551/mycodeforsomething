/**
 * 
 */
package com.lpp.mq.core.entity;

import com.lpp.mq.business.entity.SysUser;

/**
  * @ClassName: ClientInfoBean
  * @FullClassPath: com.lpp.mq.core.entity.ClientInfoBean
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月30日 下午5:50:36
  * @version: 1.0
  */

public class ClientInfoBean {
	

	private String hostIp;

	private int hostPort;
	
	private String contextPath;
	
	private SysUser sysUser;

	public String getHostIp() {
		return hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public int getHostPort() {
		return hostPort;
	}

	public void setHostPort(int hostPort) {
		this.hostPort = hostPort;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

}
