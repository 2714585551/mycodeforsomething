/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysDriver;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDriverService
  * @FullClassPath: com.lpp.mq.business.service.SysDriverService
  * @Description: 司机的接口.
  * @author: Apple
  * @date: 2017年3月24日 下午1:51:50
  * @version: 1.0
  */

public interface SysDriverService {

	
	/** 
	* @Title: findPage 
	* @Description: 分页查询. 
	* @createDate: 2017年3月24日 下午1:52:46
	* @param queryPage
	* @return 
	*/ 
	PageData<SysDriver> findPage(QueryPage queryPage);
	
	SysDriver findByPK(Long pk);

	/** 
	* @Title: saveDriver 
	* @Description: TODO 
	* @createDate: 2017年3月29日 下午6:02:34
	* @param sysDriver 
	*/ 
	void saveDriver(SysDriver sysDriver);

	/** 
	* @Title: updateSysDriver 
	* @Description: TODO 
	* @createDate: 2017年3月29日 下午6:05:16
	* @param sysDriver 
	*/ 
	void updateSysDriver(SysDriver sysDriver);
	
	
	void deleteByPK(Collection<?> ids);

	/** 
	* @Title: filterLine 
	* @Description: 过滤司机信息 
	* @createDate: 2017年3月31日 下午5:42:37
	* @param condition
	* @return List<?>
	*/ 
	List<?> filterDriver(String condition);
	
}
