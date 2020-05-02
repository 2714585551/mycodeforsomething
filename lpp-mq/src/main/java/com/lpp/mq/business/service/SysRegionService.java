/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.List;

/**
  * @ClassName: SysRegionService
  * @FullClassPath: com.lpp.mq.business.service.SysRegionService
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月24日 下午5:32:17
  * @version: 1.0
  */

public interface SysRegionService {
	
	List<?> getAllProvinceList();
	
	List<?> getCityListByProvinceCode(String provinceCode);
	
	List<?> getAreaListByCityCode(String cityCode);


	/** 
	* @Title: filterCity 
	* @Description: 根据名称获取数据 
	* @createDate: 2017年3月30日 下午2:29:51
	* @param cityCode
	* @return 
	*/ 
	List<?> filterCity(String cityName);

}
