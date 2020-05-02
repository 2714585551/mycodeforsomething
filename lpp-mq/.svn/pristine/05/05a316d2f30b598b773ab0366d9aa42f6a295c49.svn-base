/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysUserDao;
import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysUserDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysUserDaoImpl
  * @Description: 系统用户信息实现
  * @author: 李柯君
  * @date: 2017年3月23日 下午6:46:55
  * @version: 1.0
  */
@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser, Long> implements SysUserDao {

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#getAll()
	 */
	@Override
	public List<SysUser> getAll() {
		return super.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#saveUser()
	 */
	@Override
	public void saveUser(SysUser sysuser) {
		super.save(sysuser);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.core.dao.imp.BaseDaoImpl#findPage(com.lpp.mq.core.vo.QueryPage)
	 */
	@Override
	public PageData<SysUser> findPage(QueryPage queryPage) {
		return super.findPage(queryPage);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#deleteSysUser(java.lang.Object)
	 */
	@Override
	public void deleteByPK(Collection<?> ids) {
		super.deleteByPK(ids);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#findByloginName(java.lang.String)
	 */
	@Override
	public SysUser findByloginName(String loginName) {
		String hql = "FROM SysUser t where t.loginName =:loginName";
		Map<String, Object> paramMap = getMap();
		paramMap.put("loginName", loginName);
		return super.getUniqueByHQL(hql, paramMap );
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#findByPK(java.lang.Long)
	 */
	@Override
	public SysUser findByPK(Long pk) {
		return super.get(pk);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.core.dao.imp.BaseDaoImpl#saveOrUpdate(java.lang.Object)
	 */
	@Override
	public void saveOrUpdate(SysUser t) {
		super.saveOrUpdate(t);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysUserDao#findUserByAcctNamePWD(java.lang.String, java.lang.String)
	 */
	@Override
	public SysUser findUserByAcctNamePWD(String acctName, String pwd) {
		return super.getUniqueByHQL("from SysUser t where t.loginName = ? and t.pwd = ? ", acctName,pwd);
	}
}
