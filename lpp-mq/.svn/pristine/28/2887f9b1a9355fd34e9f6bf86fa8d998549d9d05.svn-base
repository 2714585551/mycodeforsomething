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

import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.business.service.SysUserService;
import com.lpp.mq.business.util.ParamUtil;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.PageData;
import com.lpp.mq.core.vo.QueryPage;
import com.lpp.mq.core.vo.ResponseMessage;

/**
 * @ClassName: SysUserController
 * @FullClassPath: com.lpp.mq.business.controller.SysUserController
 * @Description: 用户信息控制层
 * @author: 李柯君
 * @date: 2017年3月23日 下午6:43:07
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) throws JMSException {
		return "user/list";
	}
	
	@RequestMapping("/edit")
	public String edit(final HttpServletRequest request, final HttpServletResponse response) {
		return "user/editUser";
	}

	@RequestMapping(value = "/querylist")
	@ResponseBody
	public Map<String, Object> querylist( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<>();
		QueryPage queryPage = ParamUtil.buildQueryParams(request);
		PageData<SysUser> findPage = sysUserService.findPage(queryPage);
		result.put("total", findPage.getTotalCount());
		result.put("data", findPage.getContent());
		return result;
	}

	@RequestMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save(final HttpServletRequest request, final HttpServletResponse response) {
		String name = request.getParameter("data");
		SysUser sysuser = JsonUtils.jsonToObject(name, SysUser.class);
		if(null == sysuser.getId()){
			sysUserService.saveUser(sysuser);
		}else{
			sysUserService.updateSysUser(sysuser);
		}
		ResponseMessage message = new ResponseMessage(true, "保存成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseEntity<?> delete(final HttpServletRequest request, final HttpServletResponse response) {
		List<Long> list = ParamUtil.buildDeleteContidion(request);
		sysUserService.deleteByPK(list);
		ResponseMessage message = new ResponseMessage(true, "删除成功");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public ResponseEntity<?> get(final HttpServletRequest request, final HttpServletResponse response) {
		String id = request.getParameter("id");
		SysUser sysuser = sysUserService.findByPK(Long.valueOf(id));
		return new ResponseEntity<>(sysuser, HttpStatus.OK);
	}
}
