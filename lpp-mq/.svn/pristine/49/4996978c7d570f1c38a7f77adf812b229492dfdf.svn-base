/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysRegionDao;
import com.lpp.mq.business.entity.SysRegion;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;

/**
  * @ClassName: SysRegionDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysRegionDaoImpl
  * @Description: 
  * @author: Apple
  * @date: 2017年3月24日 下午5:28:32
  * @version: 1.0
  */
@Repository
public class SysRegionDaoImpl extends BaseDaoImpl<SysRegion, Long> implements SysRegionDao{

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysRegionDao#queryAllProvince()
	 */
	@Override
	public List<?> queryAllProvince() {
		return super.getListByHQL("from SysRegion t where t.regionType = '1'", new Object[]{});
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysRegionDao#getCityListByProvinceCode(java.lang.String)
	 */
	@Override
	public List<?> getCityListByProvinceCode(String provinceCode) {
		return super.getListByHQL("from SysRegion t where t.regionType = '2' and provinceCode=?", provinceCode);
	}


	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysRegionDao#getAreaListByCityCode(java.lang.String)
	 */
	@Override
	public List<?> getAreaListByCityCode(String cityCode) {
		return super.getListByHQL("from SysRegion t where t.regionType = '3' and cityCode=?", cityCode);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysRegionDao#filterCity(java.lang.String)
	 */
	@Override
	public List<?> filterCity(String cityName) {
		Map<String, Object> map = getMap();
		StringBuilder hql = new StringBuilder("SELECT new com.lpp.mq.business.entity.SysRegion(cityCode, cityName) from SysRegion t where t.regionType =:regionType");
		if(StringUtils.isNotBlank(cityName)){
			hql.append(" and t.cityName like (:cityName)");
			map.put("cityName", "%"+cityName+"%");
		}
		map.put("regionType", "2");
		return  super.getListByHQL(hql.toString(), map);
	}
}
