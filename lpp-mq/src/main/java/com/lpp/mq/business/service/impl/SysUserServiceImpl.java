/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysUserDao;
import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.business.service.SysUserService;
import com.lpp.mq.core.exception.BusinessException;
import com.lpp.mq.core.security.MD5;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysUserServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysUserServiceImpl
  * @Description: 系统用户信息业务实现
  * @author: 李柯君
  * @date: 2017年3月23日 下午6:48:54
  * @version: 1.0
  */

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private  SysUserDao sysUserDao;

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#getAll()
	 */
	@Override
	public List<SysUser> getAll() {
		return sysUserDao.getAll();
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#saveUser(com.lpp.mq.business.entity.SysUser)
	 */
	@Override
	public void saveUser(SysUser sysuser)  {
		SysUser temp = this.findByloginName(sysuser.getLoginName());
		if (null != temp) {
			throw new BusinessException("登录名已存在");
		}
		sysuser.setPwd(MD5.toMD5("111111"));
		sysuser.setCreatTime(new Date());
		sysUserDao.saveUser(sysuser);
	}
	
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#findPage(com.lpp.mq.core.vo.QueryPage)
	 */
	@Override
	public PageData<SysUser> findPage(QueryPage queryPage) {
		return sysUserDao.findPage(queryPage);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#deleteSysUser(java.lang.Object)
	 */
	@Override
	public void deleteByPK(Collection<?> ids) {
		sysUserDao.deleteByPK(ids);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#findByloginName(java.lang.String)
	 */
	@Override
	public SysUser findByloginName(String loginName) {
		return sysUserDao.findByloginName(loginName);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#findByPK(java.lang.Long)
	 */
	@Override
	public SysUser findByPK(Long pk) {
		return sysUserDao.findByPK(pk);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#updateSysUser(com.lpp.mq.business.entity.SysUser)
	 */
	@Override
	public void updateSysUser(SysUser sysuser) {
		String loginName = sysuser.getLoginName();
		SysUser update = this.findByPK(sysuser.getId());
		SysUser find = this.findByloginName(loginName);
		if(null != find && !find.getId().toString().equals(sysuser.getId().toString())){
			throw new BusinessException("登录名已存在");
		}else{
			update.setLoginName(loginName);
			update.setSex(sysuser.getSex());
			update.setName(sysuser.getName());
			update.setRemark(sysuser.getRemark());
			update.setTelephone(sysuser.getTelephone());
			update.setEmail(sysuser.getEmail());
			update.setAge(sysuser.getAge());
			sysUserDao.saveOrUpdate(update);
		}
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysUserService#findUserByAcctNamePWD(java.lang.String, java.lang.String)
	 */
	@Override
	public SysUser findUserByAcctNamePWD(String acctName, String pwd) {
		return sysUserDao.findUserByAcctNamePWD(acctName, pwd);
	}
}
