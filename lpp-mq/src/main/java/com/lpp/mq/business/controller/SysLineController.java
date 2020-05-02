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

import com.lpp.mq.business.entity.SysLine;
import com.lpp.mq.business.service.SysLineService;
import com.lpp.mq.business.util.ParamUtil;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.ResponseMessage;

/**
  * @ClassName: SysLineController
  * @FullClassPath: com.lpp.mq.business.controller.SysLineController
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月29日 下午4:53:48
  * @version: 1.0
  */
@Controller
@RequestMapping("/line")
public class SysLineController {

	@Autowired
	private SysLineService sysLineService;
	
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) throws JMSException {
		return "line/list";
	}
	
	@RequestMapping("/edit")
	public String edit(final HttpServletRequest request, final HttpServletResponse response) {
		return "line/editLine";
	}
	
	
	@RequestMapping(value = "/query")
	@ResponseBody
	public Map<String, Object> querylist( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		PageData<SysLine> findPage = sysLineService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save(final HttpServletRequest request, final HttpServletResponse response) {
		String data = request.getParameter("data");
		SysLine sysline = JsonUtils.jsonToObject(data, SysLine.class);
		if(null == sysline.getId()){
			sysLineService.saveSysLine(sysline);
		}else{
			sysLineService.updateSysLine(sysline);
		}
		ResponseMessage message = new ResponseMessage(true, "保存成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseEntity<?> delete(final HttpServletRequest request, final HttpServletResponse response) {
		List<Long> list = ParamUtil.buildDeleteContidion(request);
		sysLineService.deleteByPK(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public ResponseEntity<?> get(final HttpServletRequest request, final HttpServletResponse response) {
		String id = request.getParameter("id");
		SysLine sysLine = sysLineService.findByPK(Long.valueOf(id));
		return new ResponseEntity<>(sysLine, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/filter")
	@ResponseBody
	public List<?> filterLine(final HttpServletRequest request){
		String condition = request.getParameter("key");
		List<?> lineAll = sysLineService.filterLine(condition);
		return lineAll;
	}
	
}
