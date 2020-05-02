/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.List;

import com.lpp.mq.business.entity.SysMeun;

/**
  * @ClassName: SysMeunService
  * @FullClassPath: com.lpp.mq.business.service.SysMeunService
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月28日 下午7:49:45
  * @version: 1.0
  */

public interface SysMeunService {

	/**
	 * @Title: findAll
	 * @Description: 获取全部
	 * @createDate: 2017年3月28日 下午7:47:59
	 * @return List<SysMeun>
	 */
	public List<SysMeun> findAll();
	
}
