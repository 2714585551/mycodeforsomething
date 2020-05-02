/**
 * 
 */
package com.lpp.mq.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lpp.mq.core.entity.BaseEntity;

/**
 * @ClassName: SysMeun
 * @FullClassPath: com.lpp.mq.business.entity.SysMeun
 * @Description: TODO
 * @author: Arno
 * @date: 2017年3月28日 下午7:02:49
 * @version: 1.0
 */
@Entity
@Table(name = "t_sys_meun")
public class SysMeun extends BaseEntity {

	/** @Fields serialVersionUID : */
	private static final long serialVersionUID = 6284335908717885872L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	/** @Fields pid : 父id */
	@Column(name = "pid")
	private String pid;

	/** @Fields url : 请求地址 */
	@Column(name = "url")
	private String url;

	/** @Fields name : */
	@Column(name = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
