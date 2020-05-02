/**
 * 
 */
package com.lpp.mq.business.service;

import com.lpp.mq.business.entity.SysDepart;
import com.lpp.mq.core.service.BaseService;

/**
  * @ClassName: SysDepartService
  * @FullClassPath: com.lpp.mq.business.service.SysDepartService
  * @Description: 车次服务
  * @author: Arno
  * @date: 2017年3月31日 下午3:36:58
  * @version: 1.0
  */

public interface SysDepartService extends BaseService<SysDepart, Long>{

	/** 
	* @Title: saveSysDepart 
	* @Description: 保存数据 
	* @createDate: 2017年3月31日 下午6:20:36
	* @param sysDepart 
	*/ 
	void saveSysDepart(SysDepart sysDepart);

	/** 
	* @Title: updateLoadStatus 
	* @Description: 更新发车状态 
	* @createDate: 2017年4月5日 下午4:55:16
	* @param valueOf 
	*/ 
	void updateLoadStatus(Long valueOf);

}
