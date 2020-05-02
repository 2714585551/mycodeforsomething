/**
 * 
 */
package com.staff.system.core.vo;

import java.util.ArrayList;
import java.util.List;


public class QueryParamVo implements java.io.Serializable{

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = 8675892350044304795L;
	private List<QueryParam> params = new ArrayList<>();

	public List<QueryParam> getParams() {
		return params;
	}

	public void setParams(List<QueryParam> params) {
		this.params = params;
	}
	
}
