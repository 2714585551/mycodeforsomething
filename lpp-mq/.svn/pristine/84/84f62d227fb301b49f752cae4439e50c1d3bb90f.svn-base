/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysWayBillDetailDao;
import com.lpp.mq.business.entity.SysWayBillDetail;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;



/**
  * @ClassName: SysWayBillDetailDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysWayBillDetailDaoImpl
  * @Description: 运单明细数据层.
  * @author: Apple
  * @date: 2017年3月31日 下午3:08:43
  * @version: 1.0
  */

@Repository
public class SysWayBillDetailDaoImpl extends BaseDaoImpl<SysWayBillDetail, Long> implements SysWayBillDetailDao {

	@Override
	public List<SysWayBillDetail> findByPks(List<Long> list) {
		String hql= "from SysWayBillDetail t where t.id in (:ids)";
		Map<String,Object> paramMap  = getMap();
		paramMap.put("ids", list);
		return super.getListByHQL(hql, paramMap  );
	}

	@Override
	public List<SysWayBillDetail> findByWaybillID(List<Long> list) {
		String hql= "from SysWayBillDetail t where t.waybillId in (:ids)";
		Map<String,Object> paramMap  = getMap();
		paramMap.put("ids", list);
		return super.getListByHQL(hql, paramMap);
	}


}
