/**
 * 
 */
package com.lpp.mq.business.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.lpp.mq.business.vo.QueryParamVo;
import com.lpp.mq.core.contants.SymbolConstats;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.QueryParam;

/**
  * @ClassName: ParamUtil
  * @FullClassPath: com.lpp.mq.business.ParamUtil
  * @Description: 请求参数
  * @author: Arno
  * @date: 2017年3月24日 下午12:27:12
  * @version: 1.0
  */

public class ParamUtil {

	/** 
	* @Title: buildQueryParams 
	* @Description: 构建分页查询条件 
	* @createDate: 2017年3月24日 下午12:28:27
	* @param request
	* @return QueryPage
	*/ 
	public static QueryPage buildQueryParams(HttpServletRequest request){

		String pageIndex = request.getParameter("pageIndex");
		String pageSize = request.getParameter("pageSize");
		String paramsVo = request.getParameter("params");
		QueryParamVo queryPageVo = JsonUtils.jsonToObject(paramsVo, QueryParamVo.class);
		
		QueryPage queryPage = new QueryPage();
		queryPage.setPage(Integer.valueOf(pageIndex));
		queryPage.setPageSize(Integer.valueOf(pageSize));
		if(null != queryPageVo && !queryPageVo.getParams().isEmpty()){
			List<QueryParam> params = queryPageVo.getParams();
			for (QueryParam queryParam : params) {
				queryPage.getParams().add(queryParam);
			}
		}
		return queryPage ;
	}
	
	/** 
	* @Title: buildDeleteContidion 
	* @Description: 根据id删除 
	* @createDate: 2017年3月29日 下午6:35:36
	* @param request
	* @return 
	*/ 
	public static List<Long> buildDeleteContidion(HttpServletRequest request){
		List<Long> list = new ArrayList<>();
		String ids = request.getParameter("ids");
		if(StringUtils.isNoneBlank(ids)){
			if(ids.contains(SymbolConstats.COMMA)){
				String[] split = ids.split(SymbolConstats.COMMA);
				for (String id : split) {
					list.add(Long.valueOf(id));
				}
			}else{
				list.add(Long.valueOf(ids));
			}
		}
		return list ;
	}
	
}
