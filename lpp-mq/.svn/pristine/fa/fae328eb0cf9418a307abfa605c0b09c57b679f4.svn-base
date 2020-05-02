/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysGoodsDao;
import com.lpp.mq.business.dao.SysWayBillDetailDao;
import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.business.entity.SysWayBillDetail;
import com.lpp.mq.business.service.SysWaybillDetailService;
import com.lpp.mq.core.dao.BaseDao;
import com.lpp.mq.core.service.impl.BaseServiceImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;



/**
  * @ClassName: SysWayBillDetailServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysWayBillDetailServiceImpl
  * @Description: 运单明细服务层实现.
  * @author: Apple
  * @date: 2017年3月31日 下午2:40:41
  * @version: 1.0
  */

@Service
public class SysWayBillDetailServiceImpl extends BaseServiceImpl<SysWayBillDetail, Long> implements SysWaybillDetailService {

	@Autowired
	private BaseDao<SysWayBillDetail, Long> baseDao ;
	
	@Autowired
	private SysGoodsDao sysGoodsDao;
	
	
	@Override
	public BaseDao<SysWayBillDetail, Long> getBaseDao() {
		return baseDao;
	}

	@Override
	public PageData<SysWayBillDetail> findPage(QueryPage queryPage){
		PageData<SysWayBillDetail> page = baseDao.findPage(queryPage);
		List<SysWayBillDetail> content = page.getContent();
		if(content!= null && content.size() > 0 ){
			for(SysWayBillDetail detail : content){
				SysGoods goods = sysGoodsDao.findById(detail.getGoodsId());
				if(goods!=null){
					detail.setGoodsCode(goods.getGoodsCode());
					detail.setGoodsName(goods.getGoodsName());
					detail.setGoodsType(goods.getGoodsType());
					detail.setGoodsCount(goods.getGoodsCount());
					detail.setGoodsVolumn(goods.getGoodsVolumn());
					detail.setGoodsWeight(goods.getGoodsWeight());
					detail.setCostFreight(goods.getCostFreight());
					detail.setGoodsInsured(goods.getGoodsInsured());
					detail.setGoodsWarehouse(goods.getGoodsWarehouse());
					detail.setGoodsPosition(goods.getGoodsPosition());
				}
			}
		}
		return page;
	}

	@Override
	public void deleteAll(List<Long> list) {
		List<Long> goodsID = new ArrayList<>();
		List<SysWayBillDetail> details = ((SysWayBillDetailDao)baseDao).findByPks(list);
		for (SysWayBillDetail detail : details) {
			goodsID.add(detail.getGoodsId());
		}
		sysGoodsDao.updateLoadStatus(goodsID, true);
		baseDao.deleteByPK(list);
	}
}
