/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysUserDao
  * @FullClassPath: com.lpp.mq.business.dao.SysUserDao
  * @Description: 系统用户信息
  * @author: 李柯君
  * @date: 2017年3月23日 下午6:45:33
  * @version: 1.0
  */

public interface SysUserDao {

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
	* @createDate: 2017年3月23日 下午9:15:38
	* @param sysuser 
	*/ 
	public void saveUser(SysUser sysuser);
	
	
	/** 
	* @Title: findPage 
	* @Description: 分页查询 
	* @createDate: 2017年3月24日 上午10:43:31
	* @param queryPage
	* @return PageData<SysUser>
	*/ 
	public PageData<SysUser> findPage( QueryPage queryPage);

	/** 
	* @Title: deleteByPK 
	* @Description: 根据用户id删除用户 
	* @createDate: 2017年3月24日 下午1:50:28
	* @param ids 
	*/ 
	public void deleteByPK(Collection<?> ids);

	/** 
	* @Title: findByloginName 
	* @Description: 根据登录名获取用户 
	* @createDate: 2017年3月28日 下午3:50:10
	* @param loginName
	* @return 
	*/ 
	public SysUser findByloginName(String loginName);
	
	
	/** 
	* @Title: findByPK 
	* @Description: 根据主键获取用户 
	* @createDate: 2017年3月28日 下午3:50:57
	* @param pk
	* @return 
	*/ 
	public SysUser findByPK(Long pk);

	/** 
	* @Title: saveOrUpdate 
	* @Description: 保存或者更新 
	* @createDate: 2017年3月28日 下午5:24:37
	* @param sysuser 
	*/ 
	public void saveOrUpdate(SysUser sysuser);
	
	
	/** 
	* @Title: findUserByAcctNamePWD 
	* @Description: TODO 
	* @createDate: 2017年3月30日 下午6:47:04
	* @param acctName
	* @param pwd
	* @return 
	*/ 
	SysUser findUserByAcctNamePWD(String acctName, String pwd) ;
}
