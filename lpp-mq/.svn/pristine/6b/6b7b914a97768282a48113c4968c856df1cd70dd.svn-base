/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.Collection;

import com.lpp.mq.business.entity.SysVehicle;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysVehicleDao
  * @FullClassPath: com.lpp.mq.business.dao.SysVehicleDao
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月24日 下午1:54:32
  * @version: 1.0
  */

public interface SysVehicleDao {

	
	
	PageData<SysVehicle> findPage( QueryPage queryPage);
	
	
	SysVehicle findByPK(Long pk);
	
	
	void saveSysVehicle(SysVehicle sysVehicle);
	
	
	void updateSysVehicle(SysVehicle sysVehicle);
	
	
	void deleteByPK(Collection<?> ids);
	
	Boolean queryVehicleByVehicleCode(String vehicleCode);
	
}
