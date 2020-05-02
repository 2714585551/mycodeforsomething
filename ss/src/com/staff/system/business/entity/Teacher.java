package com.staff.system.business.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="T_MQ_TEACHERE")
public class Teacher implements Serializable {
	
    /** @Fields serialVersionUID : */ 
	private static final long serialVersionUID = 41286669660511055L;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME",length=32)
    private String name;

    @Column(name="AGE")
    private Integer age;

	public Teacher(){
        super();
    }

	
	
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
  
}