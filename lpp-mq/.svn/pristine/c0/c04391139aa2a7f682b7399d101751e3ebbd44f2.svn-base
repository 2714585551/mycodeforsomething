/**
 * 
 */
package com.lpp.mq.business.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lpp.mq.core.entity.BaseEntity;

/**
 * @ClassName: SysDepart
 * @FullClassPath: com.lpp.mq.business.entity.SysDepart
 * @Description: 车次信息
 * @author: Arno
 * @date: 2017年3月29日 下午4:38:03
 * @version: 1.0
 */
@Entity
@Table(name = "t_sys_depart")
public class SysDepart extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = -7742934814502374219L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields startCode :车次编码 */
	@Column(name = "depart_code")
	private String departCode;

	/** @Fields freightTotal : 运费总额 */
	@Column(name = "total_freight")
	private BigDecimal totalFreight;

	/** @Fields arriveTime : 预计到达时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "arrive_time")
	private Date arriveTime;
	
	/** @Fields createTime : 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "create_time")
	private Date createTime;
	

	/************************ 线路信息 begin ***************************/
	/** @Fields lineCode : 线路编码 */
	@Column(name = "line_code")
	private String lineCode;

	/** @Fields startName :起点名称 */
	@Column(name = "start_name")
	private String startName;
	
	/** @Fields startName :起点编码*/
	@Column(name = "start_code")
	private String startCode;

	/** @Fields endName : 终点名称 */
	@Column(name = "end_name")
	private String endName;
	
	/** @Fields startName :终点编码 */
	@Column(name = "end_code")
	private String endCode;

	/** @Fields departTime : 发车时间 */
	@Column(name = "depart_time")
	private String departTime;

	/** @Fields usesHours :运输时长 */
	@Column(name = "uses_hours")
	private BigDecimal usesHours;
	/************************ 线路信息 end ***************************/
	
	/************************ 司机信息 begin ***************************/
	/** @Fields driverName : 司机姓名*/ 
	@Column(name="driver_name")
	private String driverName;
	
	/** @Fields mobilePhone : 司机电话*/ 
	@Column(name="mobile_phone")
	private String mobilePhone;
	
	/** @Fields fullAddress :详细地址 */ 
	@Column(name="full_address")
	private String fullAddress;

	/** @Fields personCard : 身份证号码*/ 
	@Column(name="person_card")
	private String personCard;
	
	/** @Fields driverNo : 驾驶证编号*/ 
	@Column(name="driver_no")
	private String driverNo;
	

	/************************ 司机信息 end ***************************/

	/** @Fields isdepart : 是否已发出 1：待发车  2：已发车 */
	@Column(name = "isdepart")
	private Integer isdepart;
	
	/** @Fields remark : 备注 */
	@Column(name = "remark")
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(BigDecimal totalFreight) {
		this.totalFreight = totalFreight;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getDepartCode() {
		return departCode;
	}

	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getStartName() {
		return startName;
	}

	public void setStartName(String startName) {
		this.startName = startName;
	}

	public String getEndName() {
		return endName;
	}

	public void setEndName(String endName) {
		this.endName = endName;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public BigDecimal getUsesHours() {
		return usesHours;
	}

	public void setUsesHours(BigDecimal usesHours) {
		this.usesHours = usesHours;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getPersonCard() {
		return personCard;
	}

	public void setPersonCard(String personCard) {
		this.personCard = personCard;
	}

	public String getDriverNo() {
		return driverNo;
	}

	public void setDriverNo(String driverNo) {
		this.driverNo = driverNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsdepart() {
		return isdepart;
	}

	public void setIsdepart(Integer isdepart) {
		this.isdepart = isdepart;
	}

	public String getStartCode() {
		return startCode;
	}

	public void setStartCode(String startCode) {
		this.startCode = startCode;
	}

	public String getEndCode() {
		return endCode;
	}

	public void setEndCode(String endCode) {
		this.endCode = endCode;
	}
}
