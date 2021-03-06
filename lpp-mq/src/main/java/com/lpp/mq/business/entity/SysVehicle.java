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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lpp.mq.core.entity.BaseEntity;

/**
  * @ClassName: SysVehicle
  * @FullClassPath: com.lpp.mq.business.entity.SysVehicle
  * @Description:车辆管理的实体.
  * @author: Apple
  * @date: 2017年3月30日 上午9:15:06
  * @version: 1.0
  */
@Entity
@Table(name= "t_sys_vehicle")
public class SysVehicle extends BaseEntity{
	
	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = 8578917054123132075L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	/** @Fields vehicleCode : 车牌号*/ 
	@Column(name= "vehicle_code")
	private String vehicleCode;
	
	/** @Fields vehicleType : 车辆类型(合同车 外雇车)*/ 
	@Column(name = "vehicle_type")
	private String vehicleType;
	
	/** @Fields brandType : 品牌型号*/ 
	@Column(name = "brand_type")
	private String brandType;
	
	/** @Fields engineNo : 发动机号*/ 
	@Column(name = "engine_no")
	private String engineNo;
	
	/** @Fields carColor :车身颜色 */ 
	@Column(name = "car_color")
	private String carColor;
	
	/** @Fields frameNumber :车架号 */ 
	@Column(name= "frame_number")
	private String frameNumber;
	
	/** @Fields car_load :载重 */ 
	@Column(name = "car_load")
	private BigDecimal carLoad;
	
	/** @Fields lwh : 长宽高*/ 
	@Column(name = "lwh" )
	private String lwh;
	
	/** @Fields buyerTime :购买时间 */ 
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Column(name="buyer_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date buyerTime;

	/** @Fields produceTime :出厂时间 */ 
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Column(name="produce_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date produceTime;
	
	/** @Fields useLimit : 使用年限*/ 
	@Column(name="use_limit")
	private Integer useLimit;
	
	/** @Fields carOwner :车辆所有者 */ 
	@Column(name="car_owner")
	private String carOwner;
	
	/** @Fields registerTime :注册时间 */ 
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Column(name="register_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registerTime;
	
	/** @Fields createUser : 创建人*/ 
	@Column(name = "create_user")
	private String createUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getBrandType() {
		return brandType;
	}

	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFrameNumber() {
		return frameNumber;
	}

	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public BigDecimal getCarLoad() {
		return carLoad;
	}

	public void setCarLoad(BigDecimal carLoad) {
		this.carLoad = carLoad;
	}

	public String getLwh() {
		return lwh;
	}

	public void setLwh(String lwh) {
		this.lwh = lwh;
	}

	public Date getBuyerTime() {
		return buyerTime;
	}

	public void setBuyerTime(Date buyerTime) {
		this.buyerTime = buyerTime;
	}

	public Date getProduceTime() {
		return produceTime;
	}

	public void setProduceTime(Date produceTime) {
		this.produceTime = produceTime;
	}

	public Integer getUseLimit() {
		return useLimit;
	}

	public void setUseLimit(Integer useLimit) {
		this.useLimit = useLimit;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	
}
