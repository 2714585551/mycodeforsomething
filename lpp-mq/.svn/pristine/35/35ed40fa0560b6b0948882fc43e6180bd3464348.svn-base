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
import javax.persistence.Transient;

import com.lpp.mq.core.entity.BaseEntity;

/**
  * @ClassName: SysDepartDetail
  * @FullClassPath: com.lpp.mq.business.entity.SysDepartDetail
  * @Description: 发车运单明细
  * @author: Arno
  * @date: 2017年3月31日 下午8:21:55
  * @version: 1.0
  */

@Entity
@Table(name = "t_sys_depart_detail")
public class SysDepartDetail extends BaseEntity{

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = 286440574203659828L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	
	/** @Fields departId : 车次id*/ 
	@Column(name="depart_id")
	private Long departId;
	
	/** @Fields waybillID : 运单id*/ 
	@Column(name="waybill_id")
	private Long waybillID;

	public SysDepartDetail() {
	}
	
	public SysDepartDetail(Long departId, Long waybillID) {
		super();
		this.departId = departId;
		this.waybillID = waybillID;
	}



	/** @Fields waybillNo : 运单号*/ 
	@Transient
	private String waybillNo;
	
	/** @Fields sendRegion :发站名称 */ 
	@Transient
	private String sendRegion;
	
	/** @Fields arriveRegion : 到站区域名称*/ 
	@Transient
	private String arriveRegion;
	
	/** @Fields consignorName : 发件人*/ 
	@Transient
	private String consignorName;
	
	/** @Fields consignorPhone :发件人固定电话 */ 
	@Transient
	private String consignorPhone;
	
	/** @Fields consigneeName : 收件人*/ 
	@Transient
	private String consigneeName;
	
	/** @Fields consigneePhone : 收件人电话*/ 
	@Transient
	private String consigneePhone;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDepartId() {
		return departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
	}

	public Long getWaybillID() {
		return waybillID;
	}

	public void setWaybillID(Long waybillID) {
		this.waybillID = waybillID;
	}

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getSendRegion() {
		return sendRegion;
	}

	public void setSendRegion(String sendRegion) {
		this.sendRegion = sendRegion;
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
}
