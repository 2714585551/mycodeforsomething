/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.List;

import com.lpp.mq.business.entity.SysMeun;

/**
 * @ClassName: SysMeunDao
 * @FullClassPath: com.lpp.mq.business.dao.impl.SysMeunDao
 * @Description: 菜单
 * @author: Arno
 * @date: 2017年3月28日 下午7:44:46
 * @version: 1.0
 */

public interface SysMeunDao {

	/**
	 * @Title: findAll
	 * @Description: 获取全部
	 * @createDate: 2017年3月28日 下午7:47:59
	 * @return List<SysMeun>
	 */
	public List<SysMeun> findAll();

}
