/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.List;

import com.lpp.mq.business.entity.SysWayBillDetail;

/**
  * @ClassName: SysWayBillDetailDao
  * @FullClassPath: com.lpp.mq.business.dao.SysWayBillDetailDao
  * @Description: 运单明细数据层.
  * @author: Apple
  * @date: 2017年3月31日 下午2:30:39
  * @version: 1.0
  */

public interface SysWayBillDetailDao {

	/** 
	* @Title: findByPks 
	* @Description: TODO 
	* @createDate: 2017年4月1日 下午6:11:15
	* @param list 
	*/ 
	List<SysWayBillDetail> findByPks(List<Long> list);
	
	
	/** 
	* @Title: findByWaybillID 
	* @Description: TODO 
	* @createDate: 2017年4月1日 下午6:11:15
	* @param list 
	*/ 
	List<SysWayBillDetail> findByWaybillID(List<Long> list);
	
}
