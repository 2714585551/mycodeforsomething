/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.List;

/**
  * @ClassName: SysRegionDao
  * @FullClassPath: com.lpp.mq.business.dao.SysRegionDao
  * @Description: 
  * @author: Apple
  * @date: 2017年3月24日 下午5:27:50
  * @version: 1.0
  */

public interface SysRegionDao {

	List<?> queryAllProvince();
	
	List<?> getCityListByProvinceCode(String provinceCode);

	
	List<?> getAreaListByCityCode(String cityCode);

	/** 
	* @Title: filterCity 
	* @Description: 根据名称获取数据 
	* @createDate: 2017年3月30日 下午2:30:59
	* @param cityName
	* @return List<?>
	*/ 
	List<?> filterCity(String cityName);
}
