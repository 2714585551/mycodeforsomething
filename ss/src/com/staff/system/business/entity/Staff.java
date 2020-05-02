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
 * @version 创建时间：2017年3月27日 下午2:59:51 类说明
 */

@Entity
@Table(name = "T_SYS_STAFF")
public class Staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7989774422293797865L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	/** @Fieids staffName : 员工姓名 */
	@Column(name = "STAFF_NAME")
	private String staffName;

	/** @Fieids staffGende : 员工性别 */
	@Column(name = "STAFF_GENDER")
	private String staffGender;

	/** @Fieids staffPhone : 员工电话 */
	@Column(name = "STAFF_PHONE")
	private String staffPhone;

	/** @Fields staffPicture : 员工图片 */
	@Column(name = "STAFF_PICTURE")
	private String staffPicture;

	/** @Fields staffCardID :员工身份证号 */
	@Column(name = "STAFF_CARDID")
	private String staffCardID;

	/** @Fields staffAddress :员工住址 */
	@Column(name = "STAFF_ADDRESS")
	private String staffAddress;
	
	
	/** @Fields staffAddress :员工生日 */
	@Column(name = "STAFF_BIRTHDAY")
	private String staffBirthday;
	
	/** @Fields staffAddress :员工所属公司 */
	@Column(name = "STAFF_COMPANYID")
	private long staffCompanyId;
	
	/** @Fields staffPassword :员工备注 */
	@Column(name = "STAFF_REMARK")
	private String staffRemark;
	
	/** @Fields staffPassword :员工密码 */
	@Column(name = "STAFF_PASSWORD")
	private String staffPassword;
    
	/** @Fields staffPassword :员工邮箱 */
	@Column(name = "STAFF_EMAIL")
	private String staffEmail;
	
	/** @Fields staffPassword :是否是管理员 */
	@Column(name = "STAFF_ISADMIN")
	private String isAdmin;
	
	/** @Fields staffPassword :部门 */
	@Column(name = "STAFF_DEPARTMENT")
	private String staffDep;
	
	public String getStaffDep() {
		return staffDep;
	}

	public void setStaffDep(String staffDep) {
		this.staffDep = staffDep;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getStaffRemark() {
		return staffRemark;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public void setStaffRemark(String staffRemark) {
		this.staffRemark = staffRemark;
	}

	public long getStaffCompanyId() {
		return staffCompanyId;
	}

	public void setStaffCompanyId(long staffCompanyId) {
		this.staffCompanyId = staffCompanyId;
	}

	public String getStaffBirthday() {
		return staffBirthday;
	}

	public void setStaffBirthday(String staffBirthday) {
		this.staffBirthday = staffBirthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getStaffPhone() {
		return staffPhone;
	}

	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}

	public String getStaffPicture() {
		return staffPicture;
	}

	public void setStaffPicture(String staffPicture) {
		this.staffPicture = staffPicture;
	}

	public String getStaffCardID() {
		return staffCardID;
	}

	public void setStaffCardID(String staffCardID) {
		this.staffCardID = staffCardID;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	

}
