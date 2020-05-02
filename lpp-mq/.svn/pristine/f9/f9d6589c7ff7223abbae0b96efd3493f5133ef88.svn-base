/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysDriverDao;
import com.lpp.mq.business.entity.SysDriver;
import com.lpp.mq.business.service.SysDriverService;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDriverServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysDriverServiceImpl
  * @Description: 司机的服务.
  * @author: Apple
  * @date: 2017年3月24日 下午1:53:26
  * @version: 1.0
  */
@Service
public class SysDriverServiceImpl implements SysDriverService{
	
	@Autowired
	SysDriverDao sysDriverDao;

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysDriverService#findPage(com.lpp.mq.core.vo.QueryPage)
	 */
	@Override
	public PageData<SysDriver> findPage(QueryPage queryPage) {
		return sysDriverDao.findPage(queryPage);
	}

	
	@Override
	public SysDriver findByPK(Long pk) {
		return sysDriverDao.findByPK(pk);
	}
	
	
	@Override
	public void saveDriver(SysDriver sysDriver)  {
		sysDriverDao.saveDriver(sysDriver);
	}


	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysDriverService#updateSysDriver(com.lpp.mq.business.entity.SysDriver)
	 */
	@Override
	public void updateSysDriver(SysDriver sysDriver) {
		if(null == sysDriver.getId()){
			this.saveDriver(sysDriver);
		}else{
			SysDriver oldDrvier = this.findByPK(sysDriver.getId());
			if(oldDrvier != null ){
				BeanUtils.copyProperties(sysDriver, oldDrvier);
				sysDriverDao.updateDriver(oldDrvier);
			}
		}
	}


	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysDriverService#deleteByPK(java.util.Collection)
	 */
	@Override
	public void deleteByPK(Collection<?> ids) {
		sysDriverDao.deleteByPK(ids);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysDriverService#filterLine(java.lang.String)
	 */
	@Override
	public List<?> filterDriver(String condition) {
		return sysDriverDao.filterDriver(condition);
	}
}
