/**
 * 
 */
package com.lpp.mq.business.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpp.mq.business.service.SysRegionService;

/**
  * @ClassName: SysRegionController
  * @FullClassPath: com.lpp.mq.business.controller.SysRegionController
  * @Description: 
  * @author: Apple
  * @date: 2017年3月24日 下午4:47:12
  * @version: 1.0
  */
@Controller
@RequestMapping("/region")
public class SysRegionController {
	
	@Autowired
	private SysRegionService sysRegionService;

	@RequestMapping(value = "/queryProvince")
	@ResponseBody
	public List<?> queryProvinceList(){
		return sysRegionService.getAllProvinceList();
	}
	
	@RequestMapping(value = "/queryCity")
	@ResponseBody
	public List<?> queryCityList(final HttpServletRequest request){
		String provinceCode = request.getParameter("provinceCode");
		return sysRegionService.getCityListByProvinceCode(provinceCode);
	}
	
	
	@RequestMapping(value = "/filterCity")
	@ResponseBody
	public List<?> filterCity(final HttpServletRequest request){
		String cityName = request.getParameter("key");
		List<?> cityAll = sysRegionService.filterCity(cityName);
		return cityAll;
	}
	
	
	
	@RequestMapping(value = "/queryArea")
	@ResponseBody
	public List<?> queryAreaList(final HttpServletRequest request){
		String cityCode = request.getParameter("cityCode");
		return sysRegionService.getAreaListByCityCode(cityCode);
	}
}
