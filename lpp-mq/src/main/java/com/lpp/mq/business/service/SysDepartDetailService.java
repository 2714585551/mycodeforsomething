/**
 * 
 */
package com.lpp.mq.business.service;

import java.util.List;

import com.lpp.mq.business.entity.SysDepartDetail;
import com.lpp.mq.core.service.BaseService;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;

/**
  * @ClassName: SysDepartDetailService
  * @FullClassPath: com.lpp.mq.business.service.SysDepartDetailService
  * @Description: 车次运单明细
  * @author: Arno
  * @date: 2017年3月31日 下午8:28:09
  * @version: 1.0
  */

public interface SysDepartDetailService extends BaseService<SysDepartDetail, Long> {

	public PageData<SysDepartDetail> findPage(QueryPage queryPage);

	/** 
	* @Title: save 
	* @Description: 保存中间表 
	* @createDate: 2017年4月1日 上午10:34:48
	* @param valueOf
	* @param waybills
	* @return Boolean
	*/ 
	public Boolean save(Long valueOf, List<Long> waybills);

	/** 
	* @Title: deleteByDepartID 
	* @Description: 根据车次id删除 
	* @createDate: 2017年4月1日 下午3:56:20
	* @param list 
	*/ 
	public void deleteByDepartID(List<Long> list);

	/** 
	* @Title: deleteByPks 
	* @Description: TODO 
	* @createDate: 2017年4月1日 下午4:27:44
	* @param list 
	*/ 
	void deleteByPks(List<Long> list);
}
