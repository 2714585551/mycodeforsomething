package com.staff.system.business.entity;

public class StaffCheck {

	private int staffid;
	private String staffname;
	private String staffarrtime;
	private String staffleavetime;
	private int devicenumber;
	private String statue;
	private Long companyid;
	
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffarrtime() {
		return staffarrtime;
	}
	public void setStaffarrtime(String staffarrtime) {
		this.staffarrtime = staffarrtime;
	}
	public String getStaffleavetime() {
		return staffleavetime;
	}
	public void setStaffleavetime(String staffleavetime) {
		this.staffleavetime = staffleavetime;
	}
	public int getDevicenumber() {
		return devicenumber;
	}
	public void setDevicenumber(int devicenumber) {
		this.devicenumber = devicenumber;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	
	
}
