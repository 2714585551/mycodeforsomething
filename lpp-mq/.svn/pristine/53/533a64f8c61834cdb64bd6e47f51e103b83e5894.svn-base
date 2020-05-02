/**
 * 
 */
package com.lpp.mq.business.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.business.service.SysGoodsService;
import com.lpp.mq.business.util.ParamUtil;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.ResponseMessage;

/**
  * @ClassName: SysGoodsServiceController
  * @FullClassPath: com.lpp.mq.business.controller.SysGoodsServiceController
  * @Description: 获取控制层
  * @author: Arno
  * @date: 2017年3月31日 上午10:27:01
  * @version: 1.0
  */

@Controller
@RequestMapping("/goods")
public class SysGoodsController {

	@Autowired
	private SysGoodsService	 sysGoodsService ;
	

	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) throws JMSException {
		return "goods/list";
	}
	
	@RequestMapping(value = "/poplist")
	public String poplist(HttpServletRequest request, HttpServletResponse response, Model model) throws JMSException {
		return "goods/toBeLoadList";
	}
	
	
	@RequestMapping("/edit")
	public String edit(final HttpServletRequest request, final HttpServletResponse response) {
		return "goods/editGoods";
	}

	@RequestMapping(value = "/query")
	@ResponseBody
	public Map<String, Object> querylist( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		PageData<SysGoods> findPage = sysGoodsService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}
	
	
	@RequestMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save(final HttpServletRequest request, final HttpServletResponse response) {
		String data = request.getParameter("data");
		SysGoods sysGoods = JsonUtils.jsonToObject(data, SysGoods.class);
		if(null == sysGoods.getId()){
			sysGoodsService.saveSysGoods(sysGoods);
		}else{
			sysGoodsService.updateSysGoods(sysGoods);
		}
		ResponseMessage message = new ResponseMessage(true, "保存成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public ResponseEntity<?> get(final HttpServletRequest request, final HttpServletResponse response) {
		String id = request.getParameter("id");
		SysGoods sysGoods = sysGoodsService.findByPk(Long.valueOf(id));
		return new ResponseEntity<>(sysGoods, HttpStatus.OK);
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseEntity<?> delete(final HttpServletRequest request, final HttpServletResponse response) {
		List<Long> list = ParamUtil.buildDeleteContidion(request);
		sysGoodsService.deleteByPK(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
}
