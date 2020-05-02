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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lpp.mq.core.entity.BaseEntity;

/**
  * @ClassName: SysWayBillDetail
  * @FullClassPath: com.lpp.mq.business.entity.SysWayBillDetail
  * @Description: TODO
  * @author: Apple
  * @date: 2017年3月31日 下午5:39:27
  * @version: 1.0
  */
@Entity
@Table(name= "t_sys_waybill_detail")
public class SysWayBillDetail extends BaseEntity{

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -428790657704227174L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="waybill_id")
	private Long waybillId;
	
	@Column(name="goods_id")
	private Long goodsId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;
	
	@Column(name="create_user")
	private String createUser;
	
	@Transient 
	private String goodsCode;
	@Transient 
	private String goodsName;
	@Transient 
	private String goodsType;
	@Transient 
	private Integer goodsCount;
	@Transient 
	private BigDecimal goodsWeight;
	@Transient 
	private BigDecimal goodsVolumn;
	@Transient 
	private BigDecimal costFreight;
	@Transient 
	private BigDecimal goodsInsured;
	@Transient 
	private String goodsWarehouse;
	@Transient 
	private String goodsPosition; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWaybillId() {
		return waybillId;
	}

	public void setWaybillId(Long waybillId) {
		this.waybillId = waybillId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public BigDecimal getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(BigDecimal goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public BigDecimal getGoodsVolumn() {
		return goodsVolumn;
	}

	public void setGoodsVolumn(BigDecimal goodsVolumn) {
		this.goodsVolumn = goodsVolumn;
	}

	public BigDecimal getCostFreight() {
		return costFreight;
	}

	public void setCostFreight(BigDecimal costFreight) {
		this.costFreight = costFreight;
	}

	public BigDecimal getGoodsInsured() {
		return goodsInsured;
	}

	public void setGoodsInsured(BigDecimal goodsInsured) {
		this.goodsInsured = goodsInsured;
	}

	public String getGoodsWarehouse() {
		return goodsWarehouse;
	}

	public void setGoodsWarehouse(String goodsWarehouse) {
		this.goodsWarehouse = goodsWarehouse;
	}

	public String getGoodsPosition() {
		return goodsPosition;
	}

	public void setGoodsPosition(String goodsPosition) {
		this.goodsPosition = goodsPosition;
	}
	
	
}
