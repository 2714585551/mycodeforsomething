/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.List;

import com.lpp.mq.business.entity.SysWayBillDetail;
import com.lpp.mq.core.service.BaseService;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysWaybillDetailService
  * @FullClassPath: com.lpp.mq.business.service.SysWaybillService
  * @Description: 运单明细的服务层.
  * @author: Apple
  * @date: 2017年3月31日 下午2:39:38
  * @version: 1.0
  */

public interface SysWaybillDetailService extends BaseService<SysWayBillDetail,Long>{

	
	PageData<SysWayBillDetail> findPage(QueryPage queryPage);
	
	void deleteAll(List<Long> list);

}
