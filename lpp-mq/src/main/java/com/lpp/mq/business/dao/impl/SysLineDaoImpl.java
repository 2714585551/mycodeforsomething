/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysLineDao;
import com.lpp.mq.business.entity.SysLine;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysLineDaoImpl
  * @FullClassPath: com.lpp.mq.business.dao.impl.SysLineDaoImpl
  * @Description: 线路管理数据层
  * @author: Arno
  * @date: 2017年3月29日 下午4:51:28
  * @version: 1.0
  */

@Repository
public class SysLineDaoImpl extends BaseDaoImpl<SysLine, Long> implements SysLineDao {

	/* (non-Javadoc)
	 * @see com.lpp.mq.core.dao.imp.BaseDaoImpl#findPage(com.lpp.mq.core.vo.QueryPage)
	 */
	@Override
	public PageData<SysLine> findPage(QueryPage queryPage) {
		return super.findPage(queryPage);
	}
	
	/* (non-Javadoc)
	 * @see com.lpp.mq.core.dao.imp.BaseDaoImpl#deleteByPK(java.util.Collection)
	 */
	@Override
	public void deleteByPK(Collection<?> collections) {
		super.deleteByPK(collections);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysLineDao#saveSysLine(com.lpp.mq.business.entity.SysLine)
	 */
	@Override
	public void saveSysLine(SysLine sysline) {
		super.save(sysline);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysLineDao#updateSysLine(com.lpp.mq.business.entity.SysLine)
	 */
	@Override
	public void updateSysLine(SysLine sysline) {
		super.saveOrUpdate(sysline);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysLineDao#findByPK(java.lang.Long)
	 */
	@Override
	public SysLine findByPK(Long pk) {
		return super.get(pk);
	}

	/* (non-Javadoc)
	 * @see com.lpp.mq.business.dao.SysLineDao#findByStartAndEnd(java.lang.String, java.lang.String)
	 */
	@Override
	public SysLine findByStartAndEnd(String startCode, String endCode) {
		String hql = " From SysLine t where t.startCode=:startCode and t.endCode=:endCode ";
		Map<String, Object> paramMap = getMap();
		paramMap.put("startCode", startCode);
		paramMap.put("endCode", endCode);
		return super.getUniqueByHQL(hql, paramMap);
	}
	
	@Override
	public List<?> filterLine(String condition) {
		String hql = " From SysLine t where t.lineCode like(:lineCode) or t.startName like(:startName) or t.endName like (:endName) ";
		Map<String, Object> paramMap = getMap();
		paramMap.put("lineCode", "%"+condition+"%");
		paramMap.put("startName",  "%"+condition+"%");
		paramMap.put("endName",  "%"+condition+"%");
		return (List<?>) super.getListByHQL(hql, paramMap);
	}
	
}
