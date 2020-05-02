package com.staff.system.business.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.staff.system.business.entity.Company;
import com.staff.system.business.entity.Depart;
import com.staff.system.business.entity.Device;
import com.staff.system.business.entity.Power;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.entity.StaffCheck;
import com.staff.system.business.entity.StaffSort;
import com.staff.system.business.service.CompanySevice;
import com.staff.system.business.service.DepartService;
import com.staff.system.business.service.Devicehander;
import com.staff.system.business.service.PowerSevice;
import com.staff.system.business.service.StaffCheckHandle;
import com.staff.system.business.service.StaffSevice;
import com.staff.system.business.service.StaffSortSevice;
import com.staff.system.business.service.Staffhandle;
import com.staff.system.core.utils.JsonUtils;
import com.staff.system.business.service.notice;



@Controller
public class NormalController {

	
     String testid = "";
	
	@Autowired
	private CompanySevice companySevice;
	@Autowired
	private PowerSevice powerSevice;
	
	@Autowired
	private DepartService departService;
	
	@Autowired
	private StaffSevice staffSevice;
	
	@Autowired
	private StaffSortSevice sortSevice;
	
	@RequestMapping(value = "/showmydetail")
	public String showmydetail(){
		return "showmydetail";	
	}
	
	
	@RequestMapping(value = "/showCompany")
	@ResponseBody
	public Map showCompany(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Staff staff = (Staff)session.getAttribute("staff");
		long id = staff.getStaffCompanyId();
		Company	com = companySevice.getCompany(id);
		HttpSession session2 = request.getSession();
        session.setAttribute("company",com);
		map.put("companydetail",com.getCompanyDetail());
		return map;	
	}
	
	
	@RequestMapping(value = "/shownewCompany")
	@ResponseBody
	public Map shownewCompany(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Staff staff = (Staff)session.getAttribute("staff");
		long id = staff.getStaffCompanyId();
		Company	com = companySevice.getCompany(id);
		map.put("Company",com);
		return map;	
	}
	
	@RequestMapping(value = "/showCompanypage")
	public String showCompany(){
		return "showcompany";	
	}
	
	@RequestMapping(value = "/showadamin")
	public String showadamin(){
		return "showadamin";	
	}
	
	@RequestMapping(value = "/noticeadd")
	@ResponseBody
	public Map addnotice(HttpServletRequest request) {
		String mydata = request.getParameter("mydata");
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long id = com.getId();
		Map<String, Object> map = new HashMap<>();
		if (notice.noticesave(mydata,id)) {
			map.put("mag", "发布成功");
			return map;
		} else {
			
			map.put("mag", "发布失败");
			return map;
		}
	}
	
	@RequestMapping(value = "/notice")
	public String notice(){
		return "notice";	
	}
	
	
	@RequestMapping(value = "/updatadevice")
	public String updatadevice(){
		return "updatadevice";	
	}
	
	@RequestMapping("/deldevice")
	public String deldevice(){
		
		return "deldevice";
	}
	
	@RequestMapping("/staffsort")
	public String staffsort(){
		
		return "staffsort";
	}
	
	@RequestMapping("/adddevice")
	public String adddevice(){
		
		return "adddevice";
	}
	
	@RequestMapping("/showdevice")
	@ResponseBody
	public List<Device> showdevice(HttpServletRequest request,HttpServletResponse response)
	{
		 String key = request.getParameter("key");
	     if(key==null||key=="")
		 {
		     List<Device> list = Devicehander.deviceall();
		     return list;
		 }else{
			 List<Device> list = Devicehander.deviceone(key);
		     return list;
		 }
	}
	
	
	@RequestMapping(value = "/powerset")
	@ResponseBody
	public Map powerset(HttpServletRequest request) throws Exception {
		String mydata = request.getParameter("mydata");
		JSONObject jsonobj=JSONObject.parseObject(mydata);
		int staffid = jsonobj.getInteger("id");
		String data = jsonobj.getString("data");
        Power power = new Power();
        power.setStaffid(staffid);
        power.setData(data);
		Map<String, Object> map = new HashMap<>();
        if(powerSevice.savepower(power))
        {
        	map.put("msg", "权限保存成功");
        }else{
        	map.put("msg", "权限保存失败");
        }
		return map;
		
	}
	
	
	@RequestMapping("/showdevicemsg")
	public String showdevicemsg(){
		
		return "showdevicemsg";
	}
	
	@RequestMapping("/editnomstaff")
	public String editnomstaff(){
		return "editnomstaff";
	}
	
	@RequestMapping(value = "/setpassword")
	public String setpassword(){
		return "setpassword";	
	}
	
	
	@RequestMapping(value = "/addAdmin")
	public String addAdmin(){
		return "addAdmin";	
	}
	
	
	@RequestMapping(value = "/setnewpass")
	@ResponseBody
	public Map setnewpass(HttpServletRequest request) {
		String mydata = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Staff st = (Staff)session.getAttribute("staff");
		st.setStaffPassword(mydata);
		if (staffSevice.updatastaff(st)) {
			map.put("success", true);
			return map;
		} else {
			
			map.put("success", false);
			return map;
		}
	
	}
	
	@RequestMapping(value = "/testoldpsd")
	@ResponseBody
	public Map testoldpsd(HttpServletRequest request) {
		String mydata = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Staff st = (Staff)session.getAttribute("staff");
		
		if (st.getStaffPassword().equals(mydata)) {
			map.put("success", true);
			return map;
		} else {
			
			map.put("success", false);
			return map;
		}
	
	}
	
	@RequestMapping(value = "/updataadmin")
	public String updataadmin(){
		return "updataadmin";	
	}
	
	@RequestMapping(value = "/deviceset")
	public String deviceset(){
		return "deviceset";	
	}
	
	
	@RequestMapping(value = "/editpower")
	public String editpower(){
		return "editpower";	
	}
	@RequestMapping(value = "/power")
	public String power(){
		return "power";	
	}
	
	@RequestMapping(value = "/test")
	public String test(){
		return "test";	
	}
	
	@RequestMapping(value = "/showReport")
	public String showReport(Model model,HttpServletRequest request,HttpServletResponse response){
			String rs ="人事部";
			int count1 = Staffhandle.finddepNum(rs);
			model.addAttribute("rsnumber",count1);
			String cw ="财务部";
			int count2 = Staffhandle.finddepNum(cw);
			model.addAttribute("cwnumber",count2);
			String sc ="市场销售部";
			int count3 = Staffhandle.finddepNum(sc);
			model.addAttribute("scnumber",count3);
			String js ="技术部";
			int count4 = Staffhandle.finddepNum(js);
			model.addAttribute("jsnumber",count4);
			String hq ="后勤部";
			int count5 = Staffhandle.finddepNum(hq);
			model.addAttribute("hqnumber",count5);
			String kf ="客服部";
			int count6 = Staffhandle.finddepNum(kf);
			model.addAttribute("kfnumber",count6);
			int dev1 = 1;
			int device1 = Devicehander.getuseNum(dev1);
			model.addAttribute("device1",device1);
			int dev2 = 2;
			int device2 = Devicehander.getuseNum(dev2);
			model.addAttribute("device2",device2);
			int dev3 = 3;
			int device3 = Devicehander.getuseNum(dev3);
			model.addAttribute("device3",device3);
			int dev4 = 4;
			int device4 = Devicehander.getuseNum(dev4);
			model.addAttribute("device4",device4);
			int dev5 = 5;
			int device5 = Devicehander.getuseNum(dev5);
			model.addAttribute("device5",device5);
			int dev6 = 6;
			int device6 = Devicehander.getuseNum(dev6);
			model.addAttribute("device6",device6);
        	return "showReport";	
	}
	
	@RequestMapping(value = "/addstaff")
	public String addstaff(){
		return "addstaff";	
	}
	
	@RequestMapping(value = "/alertbox")
	public String alertbox(){
		return "alertbox";	
	}
	
	@RequestMapping(value = "/seecheck")
	public String seecheck(){
		return "seecheck";	
	}
	
	@RequestMapping(value = "/showsysstaff")
	public String showsysstaff(){
		return "showsysstaff";	
	}
	
	@RequestMapping("/deletedevice")
	public String savedevice(HttpServletRequest request,HttpServletResponse response){
		String deviceid =request.getParameter("deviceid");
		if(Devicehander.deldevice(deviceid))
		{
			return "deldevice";
		}
		return "";
	}
	
	
	
	
	
	@RequestMapping("/testcheck")
	@ResponseBody
	public Map testcheck(HttpServletRequest request,HttpServletResponse response){
		String mydata = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		StaffCheck sc = new StaffCheck();
		sc.setStaffname("王伏");
		sc.setDevicenumber(1);
		sc.setDevicenumber(1);
		sc.setStatue("良好");
		sc.setCompanyid(com.getId());
		if(mydata == null){
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			Date now = new Date(); 
			String staffarrtime = sd.format(now);
			sc.setStaffarrtime(staffarrtime);
		  if(StaffCheckHandle.check(sc)){
				    testid = StaffCheckHandle.findcheck(staffarrtime);
					map.put("msg", "签到成功");
		}
		else{
			map.put("msg", "签到失败");
		}
		}
		else{
			
				SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				Date now1 = new Date(); 
				String leavetime = sd1.format(now1);
				if(StaffCheckHandle.checkleave(testid,leavetime)){
				map.put("msg", "签退成功");
			}
			else{
				map.put("msg", "签退失败");
			}
		}
		return map;
	}
	

	
	
	@RequestMapping("/updatadev")
	public String updatadev(Device device){
		
		if(Devicehander.updatadevices(device))
		{
			return "alertbox";
		}
		return "";
	}
	@RequestMapping("/showcheckinf")
	@ResponseBody
	public List<StaffCheck>  showcheckinf(HttpServletRequest request, Map<String, Object> map) {
	
		 String key = request.getParameter("key");
		if(key==null||key=="")
		{
			List<StaffCheck> staffcheckall = StaffCheckHandle.showall(); 
			return staffcheckall;	
		}else{
			List<StaffCheck> staffchecksomebody = StaffCheckHandle.showone(key);
		  return staffchecksomebody;
		}
	}
	@RequestMapping("/savedevice")
	public String savedevice(Device device){
		if(Devicehander.savedevice(device))
		{
			return "adddevice";
		}
		return "";
	}
	@RequestMapping(value = "/showCompanyset")
	public String showCompanyset(){
		return "showCompanyset";	
	}
	
	
	@RequestMapping(value = "/adddepart")
	@ResponseBody
	public Map adddepart(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Map<String, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long comid = com.getId();
		String data = request.getParameter("mydata");
		Map<String, Object> map = new HashMap<>();
		Depart dep = JsonUtils.toPojo(data, Depart.class);
		dep.setCompanyId(comid);
		if(departService.savedep(dep)){
			result.put("msg", "保存成功");
		}
		else{
			result.put("msg", "保存失败");
		}
		 return result;

	}
	
	@RequestMapping(value = "/showdep")
	@ResponseBody
	public Map<String, Object> querylist( HttpServletRequest request, HttpServletResponse response) {
    	String key = request.getParameter("key");
    	if(key == null || key == ""){
		Map<String, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long id = com.getId();
		List <Depart> depall = departService.getAllDep(id);
		result.put("total", depall.size());
		result.put("data", depall);
		return result;
		}else{
			Map<String, Object> result = new HashMap<>();
			HttpSession session = request.getSession();
			Company com = (Company)session.getAttribute("company");
			long id = com.getId();
			List <Depart> depall = departService.getAllDepbyname(key);
			result.put("total", depall.size());
			result.put("data", depall);
			return result;
		}
	}
	
	@RequestMapping(value = "/savesort")
	@ResponseBody
	public Map<String, Object> savesort( HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<>();
		String mydata = request.getParameter("mydata");
		JSONObject jsonobj=JSONObject.parseObject(mydata);
		int staffid = jsonobj.getInteger("id");
		String staffname = jsonobj.getString("staffName");
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long comid = com.getId();
		StaffSort  sort = new StaffSort();
		sort.setStaffid(staffid);
		sort.setStaffname(staffname);
		sort.setSortdata(mydata);
		sort.setCompanyid(comid);
		if(sortSevice.savesort(sort)){
			result.put("msg", "保存成功");
			
		}else{
			result.put("msg", "保存失败");
		}
		return result;
	}
	
	
	
	@RequestMapping(value = "/Adamin")
	@ResponseBody
	public Map<String, Object> Adamin( HttpServletRequest request, HttpServletResponse response) {
    	String key = request.getParameter("key");
    	if(key == null || key == ""){
		Map<String, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long comid = com.getId();
		String  isadmin = "1";
		List <Staff> stafflist = staffSevice.getStaffList(comid, isadmin);
		result.put("total", stafflist.size());
		result.put("data", stafflist);
		return result;
		}else{
			Map<String, Object> result = new HashMap<>();
			HttpSession session = request.getSession();
			Company com = (Company)session.getAttribute("company");
			long id = com.getId();
			List <Staff> staff= staffSevice.getStaffByName(key);
			result.put("total", staff.size());
			result.put("data", staff);
			return result;
		}
	}
	
	
	@RequestMapping(value = "/stafflist")
	@ResponseBody
	public Map<String, Object> stafflist( HttpServletRequest request, HttpServletResponse response) {
    	String key = request.getParameter("key");
    	if(key == null || key == ""){
		Map<String, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		Company com = (Company)session.getAttribute("company");
		long comid = com.getId();
		String  isadmin = "0";
		List <Staff> staff = staffSevice.getStaffList(comid, isadmin);
		result.put("total", staff.size());
		result.put("data", staff);
		return result;
		}else{
			Map<String, Object> result = new HashMap<>();
			HttpSession session = request.getSession();
			Company com = (Company)session.getAttribute("company");
			long id = com.getId();
			List <Staff> staff= staffSevice.getStaffByName(key);
			result.put("total", staff.size());
			result.put("data", staff);
			return result;
		}
	}
}
