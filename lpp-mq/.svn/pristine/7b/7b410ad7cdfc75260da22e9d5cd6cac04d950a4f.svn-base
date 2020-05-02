/**
 * 
 */
package com.lpp.mq.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpp.mq.business.dao.SysMeunDao;
import com.lpp.mq.business.entity.SysMeun;
import com.lpp.mq.business.service.SysMeunService;

/**
  * @ClassName: SysMeunServiceImpl
  * @FullClassPath: com.lpp.mq.business.service.impl.SysMeunServiceImpl
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月28日 下午7:50:06
  * @version: 1.0
  */

@Service
public class SysMeunServiceImpl implements SysMeunService {

	@Autowired
	private SysMeunDao sysMeunDao;
	/* (non-Javadoc)
	 * @see com.lpp.mq.business.service.SysMeunService#findAll()
	 */
	@Override
	public List<SysMeun> findAll() {
		return sysMeunDao.findAll();
	}

}
