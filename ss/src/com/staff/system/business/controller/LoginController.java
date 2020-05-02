package com.staff.system.business.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.staff.system.business.entity.Power;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.service.Loginservice;
import com.staff.system.business.service.PowerSevice;
import com.staff.system.business.service.notice;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月31日 上午10:16:27 
* 类说明 
*/

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private Loginservice loginservice;
	
	
	@Autowired
	private PowerSevice powerSevice;
	
	int flag = 0;
	int msgnumold;
	int msgnumnew;
	@RequestMapping(value = "/logincheck")
	@ResponseBody
	public Map login(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> map = new HashMap<>();
		String mydata = request.getParameter("mydata");
		JSONObject jsonobj=JSONObject.parseObject(mydata);
		String account = jsonobj.getString("account");
		String password = jsonobj.getString("password"); 
	    Staff staff = loginservice.getStaff(account, password);
	    Power power = powerSevice.getpower(staff.getId());
	    String msg = notice.getnoticetext();
	    String msgnum ="";
	    if(flag == 0){
	     int msgnumold = notice.getnoticenum();
	      flag++;
	    }
	    else{
	    	  msgnumnew = notice.getnoticenum();
	    	  flag=0;
	    }
	    if(msgnumold<msgnumnew)
	    {
	    	msgnum="+1";
	    }
	    if(staff != null)
	    {
	    	map.put("success", "登陆成功");
	    	HttpSession session = request.getSession();
	    	String str = staff.getStaffPicture();
	    	String str1="\\img";
	    	int num = str.indexOf(str1);
	    	String pic =str.substring(num);
	    	staff.setStaffPicture(pic);
	        session.setAttribute("staff",staff);
	        session.setAttribute("msg", msg);
	        session.setAttribute("msgnum", msgnum);
	        if(power == null)
	        {
	        	 session.setAttribute("powerdata", "admin");
	        }else{
	        	 session.setAttribute("powerdata", power.getData());
	        }
	       
	    }else{
	    	map.put("error", "账户或密码有误");
	    	}
	    return map;
	}
	
	@RequestMapping(value = "/mainpage")
	public String loginsuccess(HttpServletRequest request, HttpServletResponse response){
		return "mainpage";
	}
	
	@RequestMapping(value = "/index")
	public String loginout(){
		return "index";	
	}
	@RequestMapping(value = "/register")
	public String register(){
		return "register";	
	}
}
 