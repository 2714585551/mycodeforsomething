/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysWayBill;

/**
  * @ClassName: SysWayBillDao
  * @FullClassPath: com.lpp.mq.business.dao.SysWayBillDao
  * @Description: 运单数据层.
  * @author: Apple
  * @date: 2017年3月31日 下午2:30:39
  * @version: 1.0
  */

public interface SysWayBillDao {
	
	/** 
	* @Title: findSysWayBillByPK 
	* @Description: 根据主键获取 
	* @createDate: 2017年3月31日 下午8:44:15
	* @param collection
	* @return  List<SysWayBill>
	*/ 
	public List<SysWayBill> findSysWayBillByPK(Collection<?> collection);

	/** 
	* @Title: updateLoadedStatus 
	* @Description: 更改运单状态 
	* @createDate: 2017年4月1日 上午10:50:15
	* @param waybills 
	* @param flag  true：已装   false:未装
	*/ 
	public void updateLoadedStatus( List<Long> waybills,boolean flag );
}
