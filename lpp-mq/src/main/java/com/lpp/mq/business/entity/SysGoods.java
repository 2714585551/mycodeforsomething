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
 * @ClassName: SysGoods
 * @FullClassPath: com.lpp.mq.business.entity.SysGoods
 * @Description: 货物信息
 * @author: Arno
 * @date: 2017年3月29日 下午4:38:03
 * @version: 1.0
 */
@Entity
@Table(name = "t_sys_goods")
public class SysGoods extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = -7685143476549743160L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields goodsCode : 货物编码 */
	@Column(name = "goods_code")
	private String goodsCode;

	/** @Fields goodsName :货物名称 */
	@Column(name = "goods_name")
	private String goodsName;

	/** @Fields goodsType :货物类型 */
	@Column(name = "goods_type")
	private String goodsType;

	/** @Fields goodsCount : 货物件数 */
	@Column(name = "goods_count")
	private Integer goodsCount;

	/** @Fields goodsWeight : 货物重量 */
	@Column(name = "goods_weight")
	private BigDecimal goodsWeight;

	/** @Fields goodsVolumn : 货物体积 */
	@JsonFormat(pattern = "HH:mm:ss", timezone = "GMT+8")
	@Column(name = "goods_volumn")
	private BigDecimal goodsVolumn;

	/** @Fields costFreight :运费 */
	@Column(name = "cost_freight")
	private BigDecimal costFreight;

	/** @Fields goodsInsured :保价 */
	@Column(name = "goods_insured")
	private BigDecimal goodsInsured;

	
	/** @Fields goodsWarehouse : 仓库 */
	@Column(name = "goods_warehouse")
	private String goodsWarehouse;

	
	/** @Fields goodsPosition : 仓位 */
	@Column(name = "goods_position")
	private String goodsPosition;
	
	/** @Fields isloaded : 是否已装 */
	@Column(name = "isloaded")
	private Integer isloaded;

	/** @Fields createUser : 创建人 */
	@Column(name = "create_user")
	private String createUser;

	/** @Fields operateTime : 操作时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "create_time")
	private Date createTime;

	/** @Fields remark : 备注 */
	@Column(name = "remark")
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getGoodsPosition() {
		return goodsPosition;
	}

	public void setGoodsPosition(String goodsPosition) {
		this.goodsPosition = goodsPosition;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGoodsWarehouse() {
		return goodsWarehouse;
	}

	public void setGoodsWarehouse(String goodsWarehouse) {
		this.goodsWarehouse = goodsWarehouse;
	}

	public Integer getIsloaded() {
		return isloaded;
	}

	public void setIsloaded(Integer isloaded) {
		this.isloaded = isloaded;
	}
	
}
