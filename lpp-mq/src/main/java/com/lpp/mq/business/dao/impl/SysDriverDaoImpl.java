/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysDriverDao;
import com.lpp.mq.business.entity.SysDriver;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDriverDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysDriverDaoImpl
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月24日 下午1:55:35
  * @version: 1.0
  */
@Repository
public class SysDriverDaoImpl extends BaseDaoImpl<SysDriver, Long> implements SysDriverDao{

	
	public PageData<SysDriver> findPage(QueryPage queryPage) {
		return super.findPage(queryPage);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysDriverDao#findByPK(java.lang.Long)
	 */
	@Override
	public SysDriver findByPK(Long pk) {
		return super.get(pk);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysDriverDao#saveDriver(com.lpp.mq.business.entity.SysDriver)
	 */
	@Override
	public void saveDriver(SysDriver sysDriver) {
		super.save(sysDriver);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysDriverDao#updateDriver(com.lpp.mq.business.entity.SysDriver)
	 */
	@Override
	public void updateDriver(SysDriver sysDriver) {
		super.update(sysDriver);
	}
	
	@Override
	public void deleteByPK(Collection<?> ids) {
		super.deleteByPK(ids);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysDriverDao#filterDriver(java.lang.String)
	 */
	@Override
	public List<?> filterDriver(String condition) {
		String hql ="FROM SysDriver t where t.driverName like(:name) or t.mobilePhone like (:mobile) or t.personCard like (:cardNo)";
		Map<String, Object> paramMap = getMap();
		paramMap.put("name", "%"+condition+"%");
		paramMap.put("mobile", "%"+condition+"%");
		paramMap.put("cardNo", "%"+condition+"%");
		return super.getListByHQL(hql, paramMap );
	}
}
