/**
 * 
 */
package com.lpp.mq.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lpp.mq.core.entity.BaseEntity;

/**
  * @ClassName: SysRegion
  * @FullClassPath: com.lpp.mq.business.entity.SysRegion
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月24日 下午5:21:38
  * @version: 1.0
  */
@Entity
@Table(name="t_sys_region")
public class SysRegion extends BaseEntity{

	
	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -702812499311014869L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REGION_ID")
	private Long id;
	
	@Column(name="PROVINCE_CODE")
	private String provinceCode;
	
	@Column(name="PROVINCE_NAME")
	private String provinceName;
	
	@Column(name="CITY_CODE")
	private String cityCode;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="DISTRICT_CODE")
	private String districtCode;
	
	@Column(name="DISTRICT_NAME")
	private String districtName;
	
	@Column(name="REGION_TYPE")
	private String regionType;

	public SysRegion() {
	
	}

	public SysRegion(String cityCode, String cityName) {
		this.cityCode = cityCode;
		this.cityName = cityName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getRegionType() {
		return regionType;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}
	
}
