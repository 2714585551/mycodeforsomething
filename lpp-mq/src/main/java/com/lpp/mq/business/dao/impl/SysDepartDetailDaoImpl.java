/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysDepartDetailDao;
import com.lpp.mq.business.entity.SysDepartDetail;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;

/**
  * @ClassName: SysDepartDetailDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysDepartDetailDaoImpl
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月31日 下午8:27:21
  * @version: 1.0
  */

@Repository
public class SysDepartDetailDaoImpl extends BaseDaoImpl<SysDepartDetail, Long> implements SysDepartDetailDao {

	@Override
	public List<SysDepartDetail> findByDepartID(List<Long> list) {
		String hql= "from SysDepartDetail t where t.departId in (:departIds)";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("departIds", list);
		return super.getListByHQL(hql, paramMap);
	}

	
}
