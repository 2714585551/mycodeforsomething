package com.staff.system.business.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年4月11日 下午7:50:42 
* 类说明 
*/

@Entity
@Table(name="T_SYS_COMPANY")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2393635831413037702L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	/** @Fieids  COMPANY_NAME : 公司名称 */
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	
	

	/** @Fieids  COMPANY_ADDRESS : 公司地址 */
	@Column(name = "COMPANY_ADDRESS")
	private String companyAddress;
	
	/** @Fieids  COMPANY_TELEPHONE : 公司电话 */
	@Column(name = "COMPANY_TELEPHONE")
	private String companyTelephone;
	
	/** @Fieids  COMPANY_ZIP : 公司邮编 */
	@Column(name = "COMPANY_ZIP")
	private String companyZip;
	
	/** @Fieids  COMPANY_EMILE : 公司邮箱 */
	@Column(name = "COMPANY_EMAIL")
	private String companyEmile;
	

	/** @Fieids  COMPANY_DETAIL : 公司简介 */
	@Column(name = "COMPANY_DETAIL")
	private String companyDetail;
	


	public String getCompanyDetail() {
		return companyDetail;
	}

	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public String getCompanyTelephone() {
		return companyTelephone;
	}


	public void setCompanyTelephone(String companyTelephone) {
		this.companyTelephone = companyTelephone;
	}


	public String getCompanyZip() {
		return companyZip;
	}


	public void setCompanyZip(String companyZip) {
		this.companyZip = companyZip;
	}


	public String getCompanyEmile() {
		return companyEmile;
	}


	public void setCompanyEmile(String companyEmile) {
		this.companyEmile = companyEmile;
	}

}
 