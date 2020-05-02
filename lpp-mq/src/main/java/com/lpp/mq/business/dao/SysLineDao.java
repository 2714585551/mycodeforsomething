/**
 * 
 */
package com.lpp.mq.business.dao;

import java.util.Collection;
import java.util.List;

import com.lpp.mq.business.entity.SysLine;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysLineDao
  * @FullClassPath: com.lpp.mq.business.dao.SysLineDao
  * @Description: 线路管理数据层
  * @author: Arno
  * @date: 2017年3月29日 下午4:50:49
  * @version: 1.0
  */

public interface SysLineDao {

	/** 
	* @Title: findPage 
	* @Description: 分页查询 
	* @createDate: 2017年3月29日 下午5:00:54
	* @param queryPage
	* @return PageData<SysLine>
	*/ 
	PageData<SysLine> findPage(QueryPage queryPage);

	/** 
	* @Title: deleteByPK 
	* @Description: 根据主键删除数据 
	* @createDate: 2017年3月29日 下午6:38:14
	* @param ids 
	*/ 
	void deleteByPK(Collection<?> ids);

	/** 
	* @Title: saveSysLine 
	* @Description: 保存线路 
	* @createDate: 2017年3月30日 下午4:30:48
	* @param sysline 
	*/ 
	void saveSysLine(SysLine sysline);

	/** 
	* @Title: updateSysLine 
	* @Description: 更新线路 
	* @createDate: 2017年3月30日 下午4:31:12
	* @param sysline 
	*/ 
	void updateSysLine(SysLine sysline);

	
	/** 
	* @Title: findByPK 
	* @Description: 根据主键获取数据 
	* @createDate: 2017年3月30日 下午4:33:17
	* @param pk
	* @return SysLine
	*/ 
	SysLine findByPK(Long pk);

	/** 
	* @Title: findByStartAndEnd 
	* @Description: 根据起点和终点获取数据 
	* @createDate: 2017年3月30日 下午4:34:21
	* @param startCode
	* @param endCode
	* @return SysLine
	*/ 
	SysLine findByStartAndEnd(String startCode, String endCode);

	/** 
	* @Title: filterLine 
	* @Description: 过滤线路 
	* @createDate: 2017年3月31日 下午4:27:42
	* @param condition
	* @return 
	*/ 
	List<?> filterLine(String condition);
}
