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

import com.staff.system.business.entity.Company;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.service.Resigerservice;
import com.staff.system.business.service.StaffSevice;
import com.staff.system.core.utils.JsonUtils;

@Controller
@RequestMapping("/ergister")
public class RegisterController {

	@Autowired
	private Resigerservice resigerservice;

	@Autowired
	private StaffSevice staffSevice;
	
	@RequestMapping(value = "/regcompany")
	@ResponseBody
	public Map regist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String data = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		Company com = JsonUtils.toPojo(data, Company.class);
		Company company = resigerservice.saveCompany(com);
		System.out.println("");
		if (com != null) {
			map.put("success", true);
			map.put("msg", "公司注册成功");
			HttpSession session = request.getSession();
	        session.setAttribute("company",company);
			return map;
		} else {
			map.put("success", false);
			map.put("msg", "公司注册失败");
			return map;
		}
	}
	
	@RequestMapping(value = "/regcom")
	@ResponseBody
	public Map  registernewcom(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String data = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Company comp = (Company)session.getAttribute("company");
		long pk = comp.getId();
		Company com = JsonUtils.toPojo(data, Company.class);
		Company company =  resigerservice.updatecom(com,pk);
		if(company != null)
		{
			map.put("msg", "修改成功");
			return map;
			
		}else{
			map.put("msg", "修改失败");
			return map;
		}
	}
	

	@RequestMapping(value = "/registerAdmin")
	public String register(HttpServletRequest request, HttpServletResponse response) {
		return "registerAdmin";
	}
	
	@RequestMapping(value = "/regAdmin")
	@ResponseBody
	public Map regAdmin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String data = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		Staff staff = JsonUtils.toPojo(data, Staff.class);
		if(staff.getId() == 0){
		Staff sta = staffSevice.saveStaff(staff) ;
		if (sta != null) {
			map.put("success", true);
			map.put("msg", "管理员注册成功,您的账号为："+sta.getId()+"初始密码为：123456");	
			return map;
		} else {
			map.put("success", false);
			map.put("msg", "管理员注册失败");
			return map;
		}	
		}else{
			
			if (staffSevice.updatastaff(staff)){
			
				map.put("success", true);
				return map;
			} else {
				map.put("success", false);
				return map;
			}	
			
		}
	}
	
	@RequestMapping(value = "/getAdmininf")
	@ResponseBody
	public Map getAdmininf(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String data = request.getParameter("mydata");
		int id = Integer.parseInt(data);
		Map<String, Object> map = new HashMap<>();
		Staff staff =  staffSevice.getStaffByID(id);
		if (staff != null) {
			map.put("staff", staff);
			return map;
		} else {
			map.put("success", false);
			return map;
		}
	}
}
