/**
 * 
 */
package com.lpp.mq.business.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lpp.mq.business.dao.SysGoodsDao;
import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.core.dao.imp.BaseDaoImpl;

/**
 * @ClassName: SysGoodsDaoImpl
 * @FullClassPath: com.lpp.mq.business.dao.impl.SysGoodsDaoImpl
 * @Description: 货物数据层
 * @author: Arno
 * @date: 2017年3月31日 上午10:20:23
 * @version: 1.0
 */

@Repository
public class SysGoodsDaoImpl extends BaseDaoImpl<SysGoods, Long> implements SysGoodsDao {

	@Override
	public SysGoods findSysGoodsByCode(String goodsCode) {
		String hql = "FROM SysGoods t where t.goodsCode =:goodsCode";
		Map<String, Object> paramMap = getMap();
		paramMap.put("goodsCode", goodsCode);
		return super.getUniqueByHQL(hql, paramMap);
	}

	@Override
	public SysGoods findById(Long id) {
		return super.findByPk(id);
	}

	@Override
	public void updateLoadStatus(List<Long> goodsID, boolean flag) {
		String hql = "update SysGoods SET isloaded=:isloaded where id in(:id)";
		Map<String, Object> paramMap = getMap();
		paramMap.put("id", goodsID);
		if (flag) {
			// 更新为未装
			paramMap.put("isloaded", 1);
		} else {
			// 更新为已装
			paramMap.put("isloaded", 2);
		}

		super.updateHql(hql, paramMap);
	}

}
