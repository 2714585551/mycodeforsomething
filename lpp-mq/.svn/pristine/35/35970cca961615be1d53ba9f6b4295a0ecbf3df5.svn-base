/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.Collection;

import com.lpp.mq.business.entity.SysVehicle;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysVehicleService
  * @FullClassPath: com.lpp.mq.business.service.SysVehicleService
  * @Description: 车辆的接口.
  * @author: Apple
  * @date: 2017年3月24日 下午1:51:50
  * @version: 1.0
  */

public interface SysVehicleService {

	
	/** 
	* @Title: findPage 
	* @Description: 分页查询. 
	* @createDate: 2017年3月24日 下午1:52:46
	* @param queryPage
	* @return 
	*/ 
	PageData<SysVehicle> findPage(QueryPage queryPage);
	
	SysVehicle findByPK(Long pk);

	/** 
	* @Title: saveSysVehicle 
	* @Description: TODO 
	* @createDate: 2017年3月29日 下午6:02:34
	* @param sysVehicle 
	*/ 
	void saveSysVehicle(SysVehicle sysVehicle);

	/** 
	* @Title: updateSysVehicle 
	* @Description: TODO 
	* @createDate: 2017年3月29日 下午6:05:16
	* @param sysVehicle 
	*/ 
	void updateSysVehicle(SysVehicle sysVehicle);
	
	
	void deleteByPK(Collection<?> ids);
	
	
	/** 
	* @Title: queryVehicleByVehicleCode 
	* @Description: 根据车牌号获取车辆信息。 
	* @createDate: 2017年3月30日 下午3:34:25
	* @param vehicleCode 
	*/ 
	Boolean queryVehicleByVehicleCode(String vehicleCode);
	
}
