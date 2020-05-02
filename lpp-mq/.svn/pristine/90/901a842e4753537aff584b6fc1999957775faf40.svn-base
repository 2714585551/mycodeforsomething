/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.List;

import com.lpp.mq.business.entity.SysGoods;

/**
  * @ClassName: SysGoodsDao
  * @FullClassPath: com.lpp.mq.business.dao.SysGoodsDao
  * @Description: 货物数据层
  * @author: Arno
  * @date: 2017年3月31日 上午10:17:38
  * @version: 1.0
  */

public interface SysGoodsDao {

	/** 
	* @Title: findSysGoodsByCode 
	* @Description: 根据货物编码获取数据 
	* @createDate: 2017年3月31日 下午12:55:35
	* @param goodsCode
	* @return SysGoods
	*/ 
	public SysGoods findSysGoodsByCode(String goodsCode);
	
	
	SysGoods findById(Long id);


	/** 
	* @Title: updateLoadStatus 
	* @Description: 更新商品状态 
	* @createDate: 2017年4月1日 下午6:21:13
	* @param goodsID 
	*/ 
	public void updateLoadStatus(List<Long> goodsID, boolean flag);
	
	
}
