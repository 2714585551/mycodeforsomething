/**
 * 
 */
package com.staff.system.core.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.staff.system.core.dao.BaseDao;
import com.staff.system.core.service.BaseService;
import com.staff.system.core.vo.PageData;
import com.staff.system.core.vo.QueryPage;


/**
  * @ClassName: BaseServiceImpl
  * @FullClassPath: com.lpp.mq.core.service.impl.BaseServiceImpl
  * @Description: Service封装接口实现
  * @author: Arno
  * @date: 2017年3月15日 下午4:49:37
  * @version: 1.0
  */

public abstract class BaseServiceImpl<T, PK> implements BaseService<T, PK> {

	public abstract BaseDao<T, PK> getBaseDao();

	@Override
	public T findByPk(PK pk) {
		return getBaseDao().findByPk(pk);
	}

	@Override
	public Serializable save(T t) {
		return getBaseDao().save(t);
	}

	@Override
	public void saveOrUpdate(T t) {
		getBaseDao().saveOrUpdate(t);
	}

	@Override
	public boolean deleteByPk(PK pk) {
		return getBaseDao().deleteByPk(pk);
	}

	@Override
	public PageData<T> findPage(QueryPage queryPage) {
		return getBaseDao().findPage(queryPage);
	}

	@Override
	public void delete(T t) {
		getBaseDao().delete(t);

	}

	@Override
	public void deleteAll(Collection<T> entities) {
		getBaseDao().deleteAll(entities);
	}

	@Override
	public void deleteByPK(Collection<?> collections) {
		getBaseDao().deleteByPK(collections);
	}


	@Override
	public List<T> findAll() {
		return getBaseDao().findAll();
	}

	@Override
	public void update(T t) {
		getBaseDao().update(t);
	}
	
	@Override
	public Map<String, Object> getParamsMap() {
		return  new HashMap<String, Object>();
	}
}
