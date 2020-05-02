/**
 * 
 */
package com.lpp.mq.core.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @ClassName: SysDictionary
 * @FullClassPath: com.lpp.mq.core.entity.SysDictionary
 * @Description: 数据字典
 * @author: Arno
 * @date: 2017年3月21日 下午5:21:19
 * @version: 1.0
 */

@Entity
@Table(name = "T_SYS_DICT")
public class SysDictionary extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = 1078654552204489269L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields dictName : 字典名称 */
	@Column(name = "NAME", length = 100, nullable = false)
	private String name;

	/** @Fields dictCode : 字典编码 */
	@Column(name = "CODE", length = 100, nullable = false)
	private String code;

	/** @Fields creatTime : 创建时间 */
	@Column(name = "CREAT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creatTime;

	/** @Fields mark : 备注 */
	@Column(name = "MARK", length = 255)
	private String mark;

	/*
	 * cascade：为级联操作，里面有级联保存，级联删除等，all为所有 
	 * fetch：加载类型，有lazy和eager二种，eager为急加载，意为立即加载，在类加载时就加载，lazy为慢加载，第一次调用的时候再加载，由于数据量太大，onetomany一般为lazy
	 * mappedBy：这个为manyToOne中的对象名
	 * Set：这个类型有两种，一种为list另一种为set
	 */
	/** @Fields dictDataSet : 字典明细 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dict")
	private Set<SysDictionaryData> dictSet = new HashSet<>();

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

	public Set<SysDictionaryData> getDictSet() {
		return dictSet;
	}

	public void setDictSet(Set<SysDictionaryData> dictSet) {
		this.dictSet = dictSet;
	}
}
