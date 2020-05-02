/**
 * 
 */
package com.lpp.mq.core.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.lpp.mq.core.dao.BaseDao;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
 * @ClassName: BaseService
 * @FullClassPath: com.lpp.mq.core.service.BaseService
 * @Description: Service封装接口
 * @author: Arno
 * @date: 2017年3月15日 下午4:48:55
 * @version: 1.0
 */

public abstract interface BaseService<T, PK> {

	/**
	 * @Title: getBaseDao
	 * @Description: 由业务类实现
	 * @createDate: 2017年3月31日 上午10:11:44
	 * @return
	 */
	public abstract BaseDao<T, PK> getBaseDao();

	/**
	 * @Title: findByPk
	 * @Description: 根据主键获取
	 * @createDate: 2017年3月31日 上午10:11:57
	 * @param pk
	 * @return
	 */
	public T findByPk(PK pk);

	/**
	 * @Title: save
	 * @Description: <保存实体>
	 * @createDate: 2017年3月6日 上午11:18:08
	 * @param t
	 *            实体参数
	 * @return Serializable
	 */
	public Serializable save(T t);

	/**
	 * @Title: saveOrUpdate
	 * @Description: <保存或者更新实体>
	 * @createDate: 2017年3月6日 上午11:18:23
	 * @param t
	 *            实体参数
	 */
	public void saveOrUpdate(T t);

	/**
	 * @Title: deleteByPk
	 * @Description: <根据主键删除数据>
	 * @createDate: 2017年3月6日 上午11:22:13
	 * @param pk
	 *            主键
	 * @return boolean
	 */
	public boolean deleteByPk(PK pk);
	
	/**
	 * @Title: delete
	 * @Description: <删除表中的数据>
	 * @createDate: 2017年3月6日 上午11:22:00
	 * @param t
	 *            实体参数
	 */
	public abstract void delete(T t);

	
	/**
	 * @Title: update
	 * @Description: 更新
	 * @createDate: 2017年3月6日 上午11:31:15
	 * @param t
	 *            实体
	 */
	public abstract void update(T t);
	
	
	/**
	 * @Title: deleteAll
	 * @Description: <删除所有>
	 * @createDate: 2017年3月6日 上午11:22:53
	 * @param entities
	 *            实体的Collection集合
	 */
	public abstract void deleteAll(Collection<T> entities);
	
	
	/** 
	* @Title: findAll 
	* @Description: 查询全部 
	* @createDate: 2017年3月21日 下午6:26:42
	* @return List<T>
	*/ 
	public List<T> findAll();
	
	
	/** 
	* @Title: deleteByPK 
	* @Description: 根据主键删除(多选删除) 
	* @createDate: 2017年3月24日 下午2:01:34
	* @param collections 
	*/ 
	void deleteByPK(Collection<?> collections);
	
	
	/**
	 * @Title: findPage
	 * 
	 * @Description: <HQL分页查询>
	 * 
	 * @createDate: 2017年3月7日 下午5:46:43
	 * 
	 * @param queryPage
	 *            查询参数
	 * @return PageData的封装类，里面包含了页码的信息以及查询的数据List集合
	 */
	public PageData<T> findPage( QueryPage queryPage);

	/** 
	* @Title: getParamsMap 
	* @Description: 获取查询条件map 
	* @createDate: 2017年3月31日 下午12:50:40
	* @return Map<String,Object>
	*/ 
	public Map<String,Object> getParamsMap();
}
