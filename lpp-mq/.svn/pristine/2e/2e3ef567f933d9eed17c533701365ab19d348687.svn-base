/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysRegionDao;
import com.lpp.mq.business.service.SysRegionService;

/**
  * @ClassName: SysRegionServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysRegionServiceImpl
  * @Description: 
  * @author: Apple
  * @date: 2017年3月24日 下午5:32:48
  * @version: 1.0
  */
@Service
public class SysRegionServiceImpl implements SysRegionService{
	@Autowired
	SysRegionDao sysRegionDao;

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysRegionService#getAllProvinceList()
	 */
	@Override
	public List<?> getAllProvinceList() {
		return sysRegionDao.queryAllProvince();
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysRegionService#getCityListByProvinceCode(java.lang.String)
	 */
	@Override
	public List<?> getCityListByProvinceCode(String provinceCode) {
		return sysRegionDao.getCityListByProvinceCode(provinceCode);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysRegionService#getAreaListByCityCode(java.lang.String)
	 */
	@Override
	public List<?> getAreaListByCityCode(String cityCode) {
		return sysRegionDao.getAreaListByCityCode(cityCode);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysRegionService#filterCity(java.lang.String)
	 */
	@Override
	public List<?> filterCity(String cityName) {
		return sysRegionDao.filterCity(cityName);
	}
}
