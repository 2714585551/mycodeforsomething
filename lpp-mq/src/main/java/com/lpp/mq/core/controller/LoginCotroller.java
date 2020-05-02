/**
 * 
 */
package com.lpp.mq.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lpp.mq.business.entity.SysMeun;
import com.lpp.mq.business.entity.SysUser;
import com.lpp.mq.business.service.SysMeunService;
import com.lpp.mq.business.service.SysUserService;
import com.lpp.mq.core.entity.ClientInfoBean;
import com.lpp.mq.core.entity.SysPwd;
import com.lpp.mq.core.security.MD5;
import com.lpp.mq.core.security.ThreadLocalClient;
import com.lpp.mq.core.utils.JsonUtils;
import com.lpp.mq.core.vo.ResponseMessage;



/**
  * @ClassName: LoginCotroller
  * @FullClassPath: com.lpp.mq.core.controller.LoginCotroller
  * @Description: 登录
  * @author: Arno
  * @date: 2017年3月23日 下午1:41:51
  * @version: 1.0
  */
@Controller
@RequestMapping(value = "")
public class LoginCotroller {
	
	public static final String LOGIN_ACCOUNT = "LoginAccount";

	@Autowired
	private SysMeunService sysMeunService;
	
	@Autowired
	private SysUserService sysUserService;
	
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public ResponseEntity<?> login(HttpServletRequest request, HttpServletResponse response) {
		String loginObj = request.getParameter("loginObj");
		ResponseMessage msg = new ResponseMessage();
		msg.setSuccess(false);
		JSONObject jsonObject = JSON.parseObject(loginObj);
		String accountNo = jsonObject.get("accountNo").toString().trim();
		String pwd = jsonObject.get("pwd").toString().trim();
		if(StringUtils.isEmpty(accountNo)){
			msg.setMsg("请输入用户名");
			return new ResponseEntity<>(msg, HttpStatus.OK);
		}
		if(StringUtils.isEmpty(pwd)){
			msg.setMsg("请输入登录密码");
			return new ResponseEntity<>(msg, HttpStatus.OK);
		}
		SysUser sysUser = sysUserService.findUserByAcctNamePWD(accountNo, MD5.toMD5(pwd));
		if(null == sysUser){
			msg.setMsg("输入的用户信息不存在,请重新输入");
			return new ResponseEntity<>(msg, HttpStatus.OK);
		}
		request.getSession().setAttribute(LOGIN_ACCOUNT, sysUser);
		ClientInfoBean clientInfoBean = collectClientInfo(request);
		ThreadLocalClient.put(clientInfoBean);
		msg.setSuccess(true);
		msg.setMsg("登录成功");
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	/** 
	* @Title: collectClientInfo 
	* @Description: TODO 
	* @createDate: 2017年3月30日 下午7:26:48
	* @param request
	* @return 
	*/ 
	private ClientInfoBean collectClientInfo(HttpServletRequest request) {
		ClientInfoBean frameBean = new ClientInfoBean();
		frameBean.setContextPath(request.getContextPath());
		frameBean.setHostIp(request.getRemoteHost());
		frameBean.setHostPort(request.getRemotePort());
		HttpSession session = request.getSession();
		SysUser sysUser = (SysUser) session.getAttribute(LOGIN_ACCOUNT);
		frameBean.setSysUser(sysUser);
		return frameBean;
	
	}


	@RequestMapping(value = "/loadMenu")
	@ResponseBody
	public List<SysMeun> loadMenu(HttpServletRequest request, HttpServletResponse response) {
		List<SysMeun> findAll = sysMeunService.findAll();
		return findAll ;
	}
	
	@RequestMapping(value = "/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "main";
	}
	
	
	@RequestMapping(value = "/resetPwd")
	public String resetPwd(HttpServletRequest request, HttpServletResponse response){
		return "password_edit";
	}
	
	@RequestMapping(value = "/resetPassWd")
	@ResponseBody
	public ResponseEntity<?> resetPassWd(HttpServletRequest request, HttpServletResponse response){
		ResponseMessage message = new ResponseMessage();
		message.setSuccess(false);
		message.setMsg("修改失败");
		String data = request.getParameter("data");
		SysPwd sysPwd = JsonUtils.jsonToObject(data,SysPwd.class);
		SysUser sysUser = (SysUser) request.getSession().getAttribute(LOGIN_ACCOUNT);
		if(null != sysUser){
			sysUser.setPwd(MD5.toMD5(sysPwd.getPwd()));
			sysUserService.updateSysUser(sysUser);
			message.setSuccess(true);
			message.setMsg("修改成功");
		}
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}

 


