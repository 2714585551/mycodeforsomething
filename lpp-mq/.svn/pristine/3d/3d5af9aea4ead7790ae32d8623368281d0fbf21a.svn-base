/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysUserService
  * @FullClassPath: com.lpp.mq.business.service.SysUserService
  * @Description: 系统用户信息业务实现
  * @author: 李柯君
  * @date: 2017年3月23日 下午6:48:21
  * @version: 1.0
  */

public interface SysUserService {

	/** 
	* @Title: getAll 
	* @Description: 获取全部用户数据 
	* @createDate: 2017年3月23日 下午7:04:24
	* @return List<SysUser>
	*/ 
	public List<SysUser> getAll();

	/** 
	* @Title: saveUser 
	* @Description: 保存用户 
	* @createDate: 2017年3月23日 下午9:14:11
	* @param sysuser 
	*/ 
	public void saveUser(SysUser sysuser);
	
	/** 
	* @Title: findPage 
	* @Description: 分页查询 
	* @createDate: 2017年3月24日 上午10:44:27
	* @param queryPage
	* @return  PageData<SysUser>
	*/ 
	public PageData<SysUser> findPage(QueryPage queryPage);

	/** 
	* @Title: deleteSysUser 
	* @Description: 根据主键删除用户 
	* @createDate: 2017年3月24日 下午1:49:29
	* @param object 
	*/ 
	public void deleteByPK(Collection<?> ids);

	/** 
	* @Title: findByloginName 
	* @Description: 根据登录名获取用户 
	* @createDate: 2017年3月28日 下午3:49:02
	* @param loginName 
	* @return SysUser
	*/ 
	public SysUser findByloginName(String loginName);
	
	/** 
	* @Title: findByPK 
	* @Description: 根据主键获取用户 
	* @createDate: 2017年3月28日 下午4:11:03
	* @param pk
	* @return SysUser
	*/ 
	public SysUser findByPK(Long pk);

	/** 
	* @Title: updateSysUser 
	* @Description: 更新用户信息 
	* @createDate: 2017年3月28日 下午5:22:52
	* @param sysuser 
	*/ 
	public void updateSysUser(SysUser sysuser);
	
	
	/** 
	* @Title: findUserByAcctNamePWD 
	* @Description: 根据账户和密码查找用户. 
	* @createDate: 2017年3月30日 下午6:44:14
	* @param acctName
	* @param pwd
	* @return 
	*/ 
	SysUser findUserByAcctNamePWD(String acctName,String pwd);
}
