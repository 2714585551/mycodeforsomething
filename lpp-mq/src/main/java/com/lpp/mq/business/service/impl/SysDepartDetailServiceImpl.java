/**
 * 
 */
package com.lpp.mq.business.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysDepartDetailDao;
import com.lpp.mq.business.dao.SysWayBillDao;
import com.lpp.mq.business.entity.SysDepartDetail;
import com.lpp.mq.business.entity.SysWayBill;
import com.lpp.mq.business.service.SysDepartDetailService;
import com.lpp.mq.core.dao.BaseDao;
import com.lpp.mq.core.service.impl.BaseServiceImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDepartDetailServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysDepartDetailServiceImpl
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月31日 下午8:29:13
  * @version: 1.0
  */
@Service
public class SysDepartDetailServiceImpl extends BaseServiceImpl<SysDepartDetail, Long> implements SysDepartDetailService {

	@Autowired
	private BaseDao<SysDepartDetail, Long> baseDao;
	
	@Autowired
	private SysWayBillDao sysWayBillDao;
	
	@Override
	public BaseDao<SysDepartDetail, Long> getBaseDao() {
		return baseDao;
	}
	
	@Override
	public Boolean save(Long departID, List<Long> waybills) {
		List<SysDepartDetail> details = new ArrayList<>();
		for (Long waybillID : waybills) {
			details.add(new SysDepartDetail(departID,waybillID ));
		}
		baseDao.saveBatch(details);
		
		sysWayBillDao.updateLoadedStatus(waybills, true);
		return true;
	}
	
	@Override
	public PageData<SysDepartDetail> findPage(QueryPage queryPage) {
		 PageData<SysDepartDetail> findPage = super.findPage(queryPage);
		 List<SysDepartDetail> content = findPage.getContent();
		 if(null != content && !content.isEmpty()){
			 List<SysWayBill> sysWayBills = sysWayBillDao.findSysWayBillByPK(getBillID(content));
			 buildData(content, sysWayBills);
		 }
		 return findPage ;
	}
	
	@Override
	public void deleteByDepartID(List<Long> list) {
		List<SysDepartDetail> details = ((SysDepartDetailDao)baseDao).findByDepartID(list);
		baseDao.deleteAll(details);
		List<Long> waybills = new ArrayList<>();
		for (SysDepartDetail detail : details) {
			waybills.add(detail.getWaybillID());
		}
		sysWayBillDao.updateLoadedStatus( waybills, false);
		
	}
	
	@Override
	public void deleteByPks(List<Long> list) {
		List<Long> waybills = new ArrayList<>();
		for (Long pk : list) {
			waybills.add(baseDao.findByPk(pk).getWaybillID());
		}
		baseDao.deleteByPK(list);
		sysWayBillDao.updateLoadedStatus( waybills, false);
	}
	
	
	
	
	public List<Long> getBillID(List<SysDepartDetail> content){
		List<Long> list = new ArrayList<>();
		for (SysDepartDetail detail : content) {
			list.add(detail.getWaybillID());
		}
		return list ;
	}
	
	
	public void buildData( List<SysDepartDetail> content , List<SysWayBill> sysWayBills){
		for (SysDepartDetail details : content) {
			for (SysWayBill sysWayBill : sysWayBills) {
				if(details.getWaybillID().toString().equals(sysWayBill.getId().toString())){
					details.setWaybillNo(sysWayBill.getWaybillNo());
					details.setArriveRegion(sysWayBill.getArriveRegion());
					details.setSendRegion(sysWayBill.getSendRegion());
					details.setConsigneeName(sysWayBill.getConsigneeName());
					details.setConsigneePhone(sysWayBill.getConsigneePhone());
					details.setConsignorName(sysWayBill.getConsignorName());
					details.setConsignorPhone(sysWayBill.getConsignorPhone());
				}
			}
		}
	}
}
