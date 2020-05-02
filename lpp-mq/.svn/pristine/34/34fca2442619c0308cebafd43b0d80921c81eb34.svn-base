/**
 * 
 */
package com.lpp.mq.business.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
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

import com.lpp.mq.business.entity.SysVehicle;
import com.lpp.mq.business.service.SysVehicleService;
import com.lpp.mq.business.util.ParamUtil;
import com.lpp.mq.core.contants.SymbolConstats;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.ResponseMessage;

/**
  * @ClassName: SysVehicleController
  * @FullClassPath: com.lpp.mq.business.controller.SysVehicleController
  * @Description: 线路管理
  * @author: Apple
  * @date: 2017年3月24日 下午1:34:26
  * @version: 1.0
  */
@Controller
@RequestMapping("/vehicle")
public class SysVehicleController {
	
	@Autowired
	private SysVehicleService sysVehicleService;
	

	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) throws JMSException {
		return "vehicle/list";
	}

	
	@RequestMapping(value = "/querylist")
	@ResponseBody
	public Map<String, Object> querylist(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		PageData<SysVehicle> findPage = sysVehicleService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}
	
	@RequestMapping("/edit")
	public String edit(final HttpServletRequest request, final HttpServletResponse response) {
		return "vehicle/vehicleEdit";
	}

	
	@RequestMapping("/get")
	@ResponseBody
	public ResponseEntity<?> get(final HttpServletRequest request, final HttpServletResponse response) {
		String id = request.getParameter("id");
		SysVehicle sysVehicle = sysVehicleService.findByPK(Long.valueOf(id));
		return new ResponseEntity<>(sysVehicle, HttpStatus.OK);
	}
	
	
	@RequestMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save(final HttpServletRequest request) {
		ResponseMessage message = new ResponseMessage();
		String data = request.getParameter("data");
		SysVehicle sysVehicle = JsonUtils.jsonToObject(data, SysVehicle.class);
		if(null == sysVehicle.getId()){
			Boolean flag = sysVehicleService.queryVehicleByVehicleCode(sysVehicle.getVehicleCode());
			if(flag){
				message.setSuccess(false);
				message.setMsg("车牌号为：" + sysVehicle.getVehicleCode() + "已存在!");
				return new ResponseEntity<>(message, HttpStatus.OK);
			}
			sysVehicle.setRegisterTime(new Date());
			sysVehicle.setCreateUser("test");
			sysVehicleService.saveSysVehicle(sysVehicle);
		}else{
			sysVehicleService.updateSysVehicle(sysVehicle);
		}
		message.setSuccess(true);
		message.setMsg("保存成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseEntity<?> delete(final HttpServletRequest request, final HttpServletResponse response) {
		String ids = request.getParameter("ids");
		List<Long> list = new ArrayList<>();
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
		sysVehicleService.deleteByPK(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
