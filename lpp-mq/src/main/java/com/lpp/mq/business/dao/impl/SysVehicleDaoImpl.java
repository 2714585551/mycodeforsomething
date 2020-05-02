/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysVehicleDao;
import com.lpp.mq.business.entity.SysVehicle;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysVehicleDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysVehicleDaoImpl
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月24日 下午1:55:35
  * @version: 1.0
  */
@Repository
public class SysVehicleDaoImpl extends BaseDaoImpl<SysVehicle, Long> implements SysVehicleDao{

	
	public PageData<SysVehicle> findPage(QueryPage queryPage) {
		return super.findPage(queryPage);
	}

	@Override
	public SysVehicle findByPK(Long pk) {
		return super.get(pk);
	}

	@Override
	public void saveSysVehicle(SysVehicle sysVehicle) {
		super.save(sysVehicle);
	}


	@Override
	public void updateSysVehicle(SysVehicle sysVehicle) {
		super.update(sysVehicle);
	}
	
	@Override
	public void deleteByPK(Collection<?> ids) {
		super.deleteByPK(ids);
	}

	@Override
	public Boolean queryVehicleByVehicleCode(String vehicleCode) {
		List<SysVehicle> listByHQL = super.getListByHQL("from SysVehicle t where t.vehicleCode = ?", vehicleCode);
		if(null != listByHQL && listByHQL.size() > 0 ){
			return true;
		}
		return false;
	}
}
