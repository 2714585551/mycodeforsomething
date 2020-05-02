/**
 * 
 */
package com.lpp.mq.business.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpp.mq.business.entity.SysGoods;
import com.lpp.mq.business.entity.SysWayBill;
import com.lpp.mq.business.entity.SysWayBillDetail;
import com.lpp.mq.business.service.SysGoodsService;
import com.lpp.mq.business.service.SysWaybillDetailService;
import com.lpp.mq.business.service.SysWaybillService;
import com.lpp.mq.business.util.ParamUtil;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.QueryParam;
import com.lpp.mq.core.vo.ResponseMessage;

/**
  * @ClassName: SysWayBillController
  * @FullClassPath: com.lpp.mq.business.controller.SysWayBillController
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月31日 下午2:13:59
  * @version: 1.0
  */
@Controller
@RequestMapping("/wayBill")
public class SysWayBillController {
	
	@Autowired
	private SysWaybillService sysWaybillService;
	@Autowired
	private SysWaybillDetailService sysWaybillDetailService;
	@Autowired
	private SysGoodsService sysGoodsService;

	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "waybill/list";
	}

	@RequestMapping("/edit")
	public String edit(final HttpServletRequest request, final HttpServletResponse response) {
		return "waybill/editWayBill";
	}
	
	@RequestMapping("/load")
	public String load(final HttpServletRequest request, final HttpServletResponse response) {
		return "waybill/loadWaybill";
	}
	
	@RequestMapping(value = "/querylist")
	@ResponseBody
	public Map<String, Object> querylist(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		PageData<SysWayBill> findPage = sysWaybillService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}
	
	
	@RequestMapping(value = "/queryDetaillist")
	@ResponseBody
	public Map<String, Object> queryDetaillist(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		String wayBillId = request.getParameter("wayBill_id");
		if(!StringUtils.isEmpty(wayBillId)){
			QueryParam queryParam = new QueryParam("waybillId","=",wayBillId,"Long");
			queryPage.getParams().add(queryParam);
		}
		PageData<SysWayBillDetail> findPage = sysWaybillDetailService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}
	
	
	@RequestMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save(final HttpServletRequest request, final HttpServletResponse response) {
		String data = request.getParameter("data");
		SysWayBill sysWayBill = JsonUtils.jsonToObject(data, SysWayBill.class);
		if(null == sysWayBill.getId()){
			sysWaybillService.saveSysWayBill(sysWayBill);
		}else{
			sysWaybillService.update(sysWayBill);
		}
		ResponseMessage message = new ResponseMessage(true, "保存成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public ResponseEntity<?> get(final HttpServletRequest request, final HttpServletResponse response) {
		String id = request.getParameter("id");
		SysWayBill sysWayBill = sysWaybillService.findByPk(Long.valueOf(id));
		return new ResponseEntity<>(sysWayBill, HttpStatus.OK);
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseEntity<?> delete(final HttpServletRequest request, final HttpServletResponse response) {
		List<Long> list = ParamUtil.buildDeleteContidion(request);
		sysWaybillService.deleteWaybill(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/deleteDetail")
	@ResponseBody
	public ResponseEntity<?> deleteDetail(final HttpServletRequest request, final HttpServletResponse response) {
		List<Long> list = ParamUtil.buildDeleteContidion(request);
		sysWaybillDetailService.deleteAll(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
	@RequestMapping("/loadDetail")
	@ResponseBody
	public ResponseEntity<?> loadDetail(final HttpServletRequest request, final HttpServletResponse response) {
		String data = request.getParameter("data");
		SysWayBillDetail sysWayBillDetail = JsonUtils.jsonToObject(data, SysWayBillDetail.class);
		sysWayBillDetail.setCreateTime(new Date());
		sysWayBillDetail.setCreateUser("test");
		sysWaybillDetailService.save(sysWayBillDetail);
		
		SysGoods goods = sysGoodsService.findByPk(sysWayBillDetail.getGoodsId());
		if(null != goods){
			goods.setIsloaded(2);
			sysGoodsService.update(goods);
		}
		
		ResponseMessage message = new ResponseMessage(true, "装货成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
}
