package com.staff.system.business.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年4月5日 下午1:10:02 
* 类说明 
*/

@Controller
public class Showinf {

	@RequestMapping(value = "/showmyinf")
	public String showmyinf(HttpServletRequest request, HttpServletResponse response){
		return "showmyinf";
	}
}
 