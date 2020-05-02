/**
 * 
 */
package com.lpp.mq.core.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @ClassName: SysDictionaryData
 * @FullClassPath: com.lpp.mq.core.entity.SysDictionaryData
 * @Description: 数据字典
 * @author: Arno
 * @date: 2017年3月21日 下午5:21:19
 * @version: 1.0
 */

@Entity
@Table(name = "T_SYS_DICTDATA")
public class SysDictionaryData extends BaseEntity {

	

	/** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = -6584731647121710965L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields dictName : 字典名称*/
	@Column(name = "NAME", length = 100 , nullable = false )
	private String name;

	/** @Fields dictCode : 字典编码*/
	@Column(name = "CODE", length = 100 ,  nullable = false)
	private String code;

	/** @Fields creatTime : 创建时间*/
	@Column(name = "CREAT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creatTime;
	
	/** @Fields mark : 备注*/
	@Column(name = "MARK", length = 255 )
	private String mark;

	/**@JoinColumn--> 来指定外键列*/
	/** @Fields dict : 字典类别*/ 
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="DICT_ID")
	private SysDictionary dict; 
	
	 
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public SysDictionary getDict() {
		return dict;
	}

	public void setDict(SysDictionary dict) {
		this.dict = dict;
	}
}
