/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysMeunDao;
import com.lpp.mq.business.entity.SysMeun;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;

/**
  * @ClassName: SysMeunDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysMeunDaoImpl
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月28日 下午7:48:50
  * @version: 1.0
  */

@Repository
public class SysMeunDaoImpl extends BaseDaoImpl<SysMeun, Long> implements SysMeunDao {

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysMeunDao#findAll()
	 */
	@Override
	public List<SysMeun> findAll() {
		return super.findAll();
	}

}
