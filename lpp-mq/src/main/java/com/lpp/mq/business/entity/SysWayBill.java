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
  * @ClassName: SysWayBill
  * @FullClassPath: com.lpp.mq.business.entity.SysWayBill
  * @Description: 运单的实体.
  * @author: Apple
  * @date: 2017年3月31日 下午12:52:01
  * @version: 1.0
  */
@Entity
@Table(name="t_sys_waybill")
public class SysWayBill extends BaseEntity{

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -9053901999529536331L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	/** @Fields waybillNo : 运单号*/ 
	@Column(name="waybill_no")
	private String waybillNo;
	
	/** @Fields sendRegionCode : 发站区域编码*/ 
	@Column(name="send_regionCode")
	private String sendRegionCode;
	
	/** @Fields sendRegion :发站名称 */ 
	@Column(name="send_region")
	private String sendRegion;
	
	/** @Fields arriveRegionCode :到站区域编码 */ 
	@Column(name="arrive_regionCode")
	private String arriveRegionCode;
	
	/** @Fields arriveRegion : 到站区域名称*/ 
	@Column(name="arrive_region")
	private String arriveRegion;
	
	/** @Fields consignorName : 发件人*/ 
	@Column(name="consignor_name")
	private String consignorName;
	
	/** @Fields consignorPhone :发件人固定电话 */ 
	@Column(name="consignor_phone")
	private String consignorPhone;
	
	@Column(name="consignor_province_code")
	private String consignorProvinceCode;
	
	@Column(name="consignor_city_code")
	private String consignorCityCode;
	
	@Column(name="consignor_area_code")
	private String consignorAreaCode;
	
	@Column(name="consignor_detailAddress")
	private String consignorDetailAddress;
	
	@Column(name="from_fullAddress")
	private String fromFullAddress;
	
	@Column(name="consignee_name")
	private String consigneeName;
	
	@Column(name="consignee_phone")
	private String consigneePhone;
	
	@Column(name="consignee_province_code")
	private String consigneeProvinceCode;
	
	@Column(name="consignee_city_code")
	private String consigneeCityCode;
	
	@Column(name="consignee_area_code")
	private String consigneeAreaCode;
	
	@Column(name="consignee_detailAddress")
	private String consigneeDetailAddress;
	
	@Column(name="to_fullAddress")
	private String toFullAddress;
	
	/** @Fields ifLoad : 是否装车（1：否 2：是）*/ 
	@Column(name="if_load")
	private String ifLoad;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;
	
	@Column(name="create_operator")
	private String createOperator;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getSendRegionCode() {
		return sendRegionCode;
	}

	public void setSendRegionCode(String sendRegionCode) {
		this.sendRegionCode = sendRegionCode;
	}

	public String getSendRegion() {
		return sendRegion;
	}

	public void setSendRegion(String sendRegion) {
		this.sendRegion = sendRegion;
	}

	public String getArriveRegionCode() {
		return arriveRegionCode;
	}

	public void setArriveRegionCode(String arriveRegionCode) {
		this.arriveRegionCode = arriveRegionCode;
	}

	public String getArriveRegion() {
		return arriveRegion;
	}

	public void setArriveRegion(String arriveRegion) {
		this.arriveRegion = arriveRegion;
	}

	public String getConsignorName() {
		return consignorName;
	}

	public void setConsignorName(String consignorName) {
		this.consignorName = consignorName;
	}

	public String getConsignorPhone() {
		return consignorPhone;
	}

	public void setConsignorPhone(String consignorPhone) {
		this.consignorPhone = consignorPhone;
	}

	public String getConsignorProvinceCode() {
		return consignorProvinceCode;
	}

	public void setConsignorProvinceCode(String consignorProvinceCode) {
		this.consignorProvinceCode = consignorProvinceCode;
	}

	public String getConsignorCityCode() {
		return consignorCityCode;
	}

	public void setConsignorCityCode(String consignorCityCode) {
		this.consignorCityCode = consignorCityCode;
	}

	public String getConsignorAreaCode() {
		return consignorAreaCode;
	}

	public void setConsignorAreaCode(String consignorAreaCode) {
		this.consignorAreaCode = consignorAreaCode;
	}

	public String getConsignorDetailAddress() {
		return consignorDetailAddress;
	}

	public void setConsignorDetailAddress(String consignorDetailAddress) {
		this.consignorDetailAddress = consignorDetailAddress;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneePhone() {
		return consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	public String getConsigneeProvinceCode() {
		return consigneeProvinceCode;
	}

	public void setConsigneeProvinceCode(String consigneeProvinceCode) {
		this.consigneeProvinceCode = consigneeProvinceCode;
	}

	public String getConsigneeCityCode() {
		return consigneeCityCode;
	}

	public void setConsigneeCityCode(String consigneeCityCode) {
		this.consigneeCityCode = consigneeCityCode;
	}

	public String getFromFullAddress() {
		return fromFullAddress;
	}

	public void setFromFullAddress(String fromFullAddress) {
		this.fromFullAddress = fromFullAddress;
	}

	public String getToFullAddress() {
		return toFullAddress;
	}

	public void setToFullAddress(String toFullAddress) {
		this.toFullAddress = toFullAddress;
	}

	public String getConsigneeAreaCode() {
		return consigneeAreaCode;
	}

	public void setConsigneeAreaCode(String consigneeAreaCode) {
		this.consigneeAreaCode = consigneeAreaCode;
	}

	public String getConsigneeDetailAddress() {
		return consigneeDetailAddress;
	}

	public void setConsigneeDetailAddress(String consigneeDetailAddress) {
		this.consigneeDetailAddress = consigneeDetailAddress;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateOperator() {
		return createOperator;
	}

	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}

	public String getIfLoad() {
		return ifLoad;
	}

	public void setIfLoad(String ifLoad) {
		this.ifLoad = ifLoad;
	}

	
}
