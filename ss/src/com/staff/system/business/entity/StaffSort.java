package com.staff.system.business.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="t_sys_sort")
public class StaffSort implements Serializable {
	
    /** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = 41286669660511055L;


    @Column(name="staffid")
    private int  staffid;

    @Column(name="staffname")
    private String staffname;

	
    @Column(name="sortdata")
    private String sortdata;
    
    @Column(name="companyid")
    private long companyid;



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

	public String getSortdata() {
		return sortdata;
	}

	public void setSortdata(String sortdata) {
		this.sortdata = sortdata;
	}

	public long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	
    
    
	
}