/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysGoodsDao;
import com.lpp.mq.business.dao.SysWayBillDetailDao;
import com.lpp.mq.business.entity.SysWayBill;
import com.lpp.mq.business.entity.SysWayBillDetail;
import com.lpp.mq.business.service.SysWaybillService;
import com.lpp.mq.business.util.CodeGenerateUtil;
import com.lpp.mq.business.util.CodeType;
import com.lpp.mq.core.dao.BaseDao;
import com.lpp.mq.core.service.impl.BaseServiceImpl;



/**
  * @ClassName: SysWayBillServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysWayBillServiceImpl
  * @Description: 运单服务层实现.
  * @author: Apple
  * @date: 2017年3月31日 下午2:40:41
  * @version: 1.0
  */

@Service
public class SysWayBillServiceImpl extends BaseServiceImpl<SysWayBill, Long> implements SysWaybillService {

	@Autowired
	private BaseDao<SysWayBill, Long> baseDao ;
	
	@Autowired
	private SysWayBillDetailDao sysWayBillDetailDao;
	
	@Autowired
	private SysGoodsDao sysGoodsDao;
	
	@Override
	public BaseDao<SysWayBill, Long> getBaseDao() {
		return baseDao;
	}

	@Override
	public void saveSysWayBill(SysWayBill sysWayBill) {
		// 运单号生成
		sysWayBill.setWaybillNo(CodeGenerateUtil.makeOrderNum(CodeType.YD.getCode()));
		sysWayBill.setCreateTime(new Date());
		// 未装车
		sysWayBill.setIfLoad("1");
		sysWayBill.setCreateOperator("test");
		baseDao.save(sysWayBill);
	}

	@Override
	public void deleteWaybill(List<Long> list) {
		List<Long> goodsID = new ArrayList<>();
		List<SysWayBillDetail> detaisl = sysWayBillDetailDao.findByWaybillID(list);
		for (SysWayBillDetail detail : detaisl) {
			goodsID.add(detail.getGoodsId());
		}
		sysGoodsDao.updateLoadStatus(goodsID, true);
		baseDao.deleteByPK(list);
	}

}
