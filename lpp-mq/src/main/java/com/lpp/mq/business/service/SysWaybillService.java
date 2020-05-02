/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.List;

import com.lpp.mq.business.entity.SysWayBill;
import com.lpp.mq.core.service.BaseService;

/**
  * @ClassName: SysWaybillService
  * @FullClassPath: com.lpp.mq.business.service.SysWaybillService
  * @Description: 运单的服务层.
  * @author: Apple
  * @date: 2017年3月31日 下午2:39:38
  * @version: 1.0
  */

public interface SysWaybillService extends BaseService<SysWayBill,Long>{

	void saveSysWayBill(SysWayBill sysWayBill);

	/** 
	* @Title: deleteWaybill 
	* @Description: TODO 
	* @createDate: 2017年4月1日 下午6:28:28
	* @param list 
	*/ 
	void deleteWaybill(List<Long> list);

}
