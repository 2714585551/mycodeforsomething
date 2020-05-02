/**
 * 
 */
package com.lpp.mq.business.service;

import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.core.service.BaseService;

/**
  * @ClassName: SysGoodsService
  * @FullClassPath: com.lpp.mq.business.service.SysGoodsService
  * @Description: 货物服务层
  * @author: Arno
  * @date: 2017年3月31日 上午10:22:47
  * @version: 1.0
  */

public interface SysGoodsService extends BaseService<SysGoods,Long>{

	/** 
	* @Title: saveSysGoods 
	* @Description: 保存货物 
	* @createDate: 2017年3月31日 下午12:45:34
	* @param sysGoods 
	*/ 
	void saveSysGoods(SysGoods sysGoods);

	/** 
	* @Title: updateSysGoods 
	* @Description: 跟新获取 
	* @createDate: 2017年3月31日 下午12:45:40
	* @param sysGoods 
	*/ 
	void updateSysGoods(SysGoods sysGoods);


}
