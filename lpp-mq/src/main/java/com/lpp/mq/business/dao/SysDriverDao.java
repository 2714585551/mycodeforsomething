/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysDriver;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDriverDao
  * @FullClassPath: com.lpp.mq.business.dao.SysDriverDao
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月24日 下午1:54:32
  * @version: 1.0
  */

public interface SysDriverDao {

	
	
	PageData<SysDriver> findPage( QueryPage queryPage);
	
	
	SysDriver findByPK(Long pk);
	
	
	void saveDriver(SysDriver sysDriver);
	
	
	void updateDriver(SysDriver sysDriver);
	
	
	void deleteByPK(Collection<?> ids);


	/** 
	* @Title: filterDriver 
	* @Description: 过滤司机信息 
	* @createDate: 2017年3月31日 下午5:43:28
	* @param condition
	* @return 
	*/ 
	List<?> filterDriver(String condition);
	
}
