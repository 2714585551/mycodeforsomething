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
 * @ClassName: SysLine
 * @FullClassPath: com.lpp.mq.business.entity.SysLine
 * @Description: 线路信息
 * @author: Arno
 * @date: 2017年3月29日 下午4:38:03
 * @version: 1.0
 */
@Entity
@Table(name = "t_sys_line")
public class SysLine extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = -7742934814502374219L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields lineCode : 线路编码*/ 
	@Column(name = "line_code")
	private String lineCode;
	
	/** @Fields startCode :起点code */ 
	@Column(name = "start_code")
	private String startCode;

	/** @Fields startName :起点名称 */ 
	@Column(name = "start_name")
	private String startName;

	/** @Fields endCode : 终点编码*/ 
	@Column(name = "end_code")
	private String endCode;

	/** @Fields endName : 终点名称*/ 
	@Column(name = "end_name")
	private String endName;

	/** @Fields departTime : 发车时间*/ 
	@JsonFormat(pattern="HH:mm:ss",timezone = "GMT+8")
	@Column(name = "depart_time")
	private Date departTime;

	/** @Fields usesHours :运输时长 */ 
	@Column(name = "uses_hours")
	private BigDecimal usesHours;

	/** @Fields operateName :操作人 */ 
	@Column(name = "operate_name")
	private String operateName;

	/** @Fields operateTime : 操作时间*/ 
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@Column(name = "create_time")
	private Date createTime;

	/** @Fields remark : 备注*/ 
	@Column(name = "remark")
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getStartCode() {
		return startCode;
	}

	public void setStartCode(String startCode) {
		this.startCode = startCode;
	}

	public String getStartName() {
		return startName;
	}

	public void setStartName(String startName) {
		this.startName = startName;
	}

	public String getEndCode() {
		return endCode;
	}

	public void setEndCode(String endCode) {
		this.endCode = endCode;
	}

	public String getEndName() {
		return endName;
	}

	public void setEndName(String endName) {
		this.endName = endName;
	}

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}

	public BigDecimal getUsesHours() {
		return usesHours;
	}

	public void setUsesHours(BigDecimal usesHours) {
		this.usesHours = usesHours;
	}

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
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

}
