/**
 * 
 */
package com.lpp.mq.business.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lpp.mq.core.entity.BaseEntity;

/**
  * @ClassName: SysDriver
  * @FullClassPath: com.lpp.mq.business.entity.SysDriver
  * @Description: 司机
  * @author: Apple
  * @date: 2017年3月24日 下午1:39:17
  * @version: 1.0
  */
@Entity
@Table(name="t_sys_driver")
public class SysDriver extends BaseEntity{

	
	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -8386486031376157552L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="driver_name")
	private String driverName;
	
	@Column(name="mobile_phone")
	private String mobilePhone;
	
	@Column(name="driver_age")
	private String driverAge;
	
	@Column(name="driver_sex")
	private String driverSex;
	
	@Column(name="province_code")
	private String provinceCode;
	
	@Column(name="city_code")
	private String cityCode;
	
	@Column(name="area_code")
	private String areaCode;
	
	@Column(name="person_address")
	private String personAddress;
	
	@Column(name="full_address")
	private String fullAddress;

	@Column(name="person_card")
	private String personCard;
	
	@Column(name="driver_type")
	private String driverType;
	
	@Column(name="driver_no")
	private String driverNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Column(name="operate_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date operateTime;
	
	@Column(name="operate_user")
	private String operateUser;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="lincense_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lincenseDate;

	public Date getLincenseDate() {
		return lincenseDate;
	}

	public void setLincenseDate(Date lincenseDate) {
		this.lincenseDate = lincenseDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getDriverAge() {
		return driverAge;
	}

	public void setDriverAge(String driverAge) {
		this.driverAge = driverAge;
	}

	public String getDriverSex() {
		return driverSex;
	}

	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getPersonCard() {
		return personCard;
	}

	public void setPersonCard(String personCard) {
		this.personCard = personCard;
	}

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getDriverNo() {
		return driverNo;
	}

	public void setDriverNo(String driverNo) {
		this.driverNo = driverNo;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}
	
	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
