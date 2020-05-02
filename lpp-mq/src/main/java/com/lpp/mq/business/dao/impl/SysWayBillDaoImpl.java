/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysWayBillDao;
import com.lpp.mq.business.entity.SysWayBill;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;



/**
  * @ClassName: SysWayBillDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysWayBillDaoImpl
  * @Description: 运单数据层.
  * @author: Apple
  * @date: 2017年3月31日 下午3:08:43
  * @version: 1.0
  */

@Repository
public class SysWayBillDaoImpl extends BaseDaoImpl<SysWayBill, Long> implements SysWayBillDao {

	@Override
	public List<SysWayBill> findSysWayBillByPK(Collection<?> collection) {
		String hql = "From SysWayBill t where t.id in (:ids)" ;
		Map<String,Object> paramMap  =getMap();
		paramMap.put("ids", collection);
		return super.getListByHQL(hql, paramMap );
	}

	@Override
	public void updateLoadedStatus(List<Long> waybills, boolean flag) {
	  Map<String,Object> paramMap  =getMap();
		String hql = "update SysWayBill SET ifLoad=:ifLoad where id in(:id)" ;
		if(flag){
			paramMap.put("ifLoad", "2");	
		}else{
			paramMap.put("ifLoad", "1");
		}
		paramMap.put("id", waybills);
		super.updateHql(hql, paramMap );
	}

}
