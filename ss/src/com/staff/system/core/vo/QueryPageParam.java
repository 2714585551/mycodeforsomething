/**
 * 
 */
package com.staff.system.core.vo;

/**
 * @ClassName: QueryPageParam
 * @FullClassPath: com.lpp.mq.core.QueryPageParam
 * @Description: 查询参数
 * @author: Arno
 * @date: 2017年3月7日 下午4:36:18
 * @version: 1.0
 */

public class QueryPageParam implements java.io.Serializable{

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -3895043805465836624L;

	private String field;

	private String operator;

	private String type = "String" ;
	
	private Object value;

	public QueryPageParam() {
	}

	public QueryPageParam(String field, String operator, Object value) {
		super();
		this.field = field;
		this.operator = operator;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
