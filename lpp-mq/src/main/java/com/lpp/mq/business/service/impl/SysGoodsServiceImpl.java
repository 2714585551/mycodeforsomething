/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysGoodsDao;
import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.business.service.SysGoodsService;
import com.lpp.mq.core.dao.BaseDao;
import com.lpp.mq.core.exception.BusinessException;
import com.lpp.mq.core.service.impl.BaseServiceImpl;

/**
  * @ClassName: SysGoodsServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysGoodsServiceImpl
  * @Description: 货物数据层实现
  * @author: Arno
  * @date: 2017年3月31日 上午10:23:22
  * @version: 1.0
  */

@Service
public class SysGoodsServiceImpl extends BaseServiceImpl<SysGoods, Long> implements SysGoodsService {

	@Autowired
	private BaseDao<SysGoods, Long> baseDao ;
	
	
	@Override
	public BaseDao<SysGoods, Long> getBaseDao() {
		return baseDao;
	}


	@Override
	public void saveSysGoods(SysGoods sysGoods) {
		SysGoods find = ((SysGoodsDao)baseDao).findSysGoodsByCode(sysGoods.getGoodsCode());
		if(null != find ){
			throw new BusinessException("货物编码已存在.");
		}
		sysGoods.setCreateTime(new Date());
		sysGoods.setIsloaded(1);
		baseDao.save(sysGoods);
	}


	public void updateSysGoods(SysGoods sysGoods) {
		SysGoods update = baseDao.findByPk(sysGoods.getId());
		SysGoods find = ((SysGoodsDao)baseDao).findSysGoodsByCode(sysGoods.getGoodsCode());
		if(null != find && !find.getId().toString().equals(update.getId().toString())){
			throw new BusinessException("货物编码已存在.");
		}
		BeanUtils.copyProperties(sysGoods, update, new String []{"isloaded","createUser","createTime"});
		baseDao.update(update);
	}

}
