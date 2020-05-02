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
 * @ClassName: SysUser
 * @FullClassPath: com.lpp.mq.business.entity.SysUser
 * @Description: 用户信息
 * @author: Arno
 * @date: 2017年3月23日 下午6:32:18
 * @version: 1.0
 */
@Entity
@Table(name = "t_sys_user")
public class SysUser extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = 6960316304492094253L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields loginName : 登录姓*/ 
	@Column(name = "LOGIN_NAME")
	private String loginName;
	
	/** @Fields name : 姓名*/ 
	@Column(name = "NAME")
	private String name;

	/** @Fields pwd : 密码*/ 
	@Column(name = "PASSWORD")
	private String pwd;

	/** @Fields sex : 性别*/ 
	@Column(name = "SEX")
	private String sex;

	/** @Fields age : 年龄*/ 
	@Column(name = "AGE")
	private Integer age;
	
	/** @Fields email : 邮箱*/ 
	@Column(name = "EMAIL")
	private String email;

	/** @Fields telephone : 电话*/ 
	@Column(name = "TELEPHONE")
	private String telephone;

	/** @Fields creatTime : 创建时间 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	@Column(name = "CREAT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creatTime;

	/** @Fields mark : 备注 */
	@Column(name = "REMARK", length = 255)
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}
