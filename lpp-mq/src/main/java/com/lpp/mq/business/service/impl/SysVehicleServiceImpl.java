/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.Collection;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysVehicleDao;
import com.lpp.mq.business.entity.SysVehicle;
import com.lpp.mq.business.service.SysVehicleService;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysVehicleServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysVehicleServiceImpl
  * @Description: 车辆的服务.
  * @author: Apple
  * @date: 2017年3月24日 下午1:53:26
  * @version: 1.0
  */
@Service
public class SysVehicleServiceImpl implements SysVehicleService{
	
	@Autowired
	SysVehicleDao sysVehicleDao;


	@Override
	public PageData<SysVehicle> findPage(QueryPage queryPage) {
		return sysVehicleDao.findPage(queryPage);
	}

	
	@Override
	public SysVehicle findByPK(Long pk) {
		return sysVehicleDao.findByPK(pk);
	}
	
	
	@Override
	public void saveSysVehicle(SysVehicle sysVehicle)  {
		sysVehicleDao.saveSysVehicle(sysVehicle);
	}


	@Override
	public void updateSysVehicle(SysVehicle sysVehicle) {
		if(null == sysVehicle.getId()){
			this.saveSysVehicle(sysVehicle);
		}else{
			SysVehicle oldSysVehicle = this.findByPK(sysVehicle.getId());
			if(oldSysVehicle != null ){
				BeanUtils.copyProperties(sysVehicle, oldSysVehicle);
				sysVehicleDao.updateSysVehicle(oldSysVehicle);
			}
		}
	}


	@Override
	public void deleteByPK(Collection<?> ids) {
		sysVehicleDao.deleteByPK(ids);
	}


	@Override
	public Boolean queryVehicleByVehicleCode(String vehicleCode) {
		return sysVehicleDao.queryVehicleByVehicleCode(vehicleCode);
	}
}
