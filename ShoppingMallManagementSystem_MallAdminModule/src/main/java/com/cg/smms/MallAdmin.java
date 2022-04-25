package com.cg.smms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MallAdmin {

	private Integer id;
	private String name;
	private String password;
	private String mall;
	private Integer phone;
	
	
	public MallAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	public Integer getId() {
		return id;
	}


	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + ", getId()=" + getId() + ", getName()=" + getName() + ", getPassword()=" + getPassword()
				+ ", getMall()=" + getMall() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMall() {
		return mall;
	}


	public void setMall(String mall) {
		this.mall = mall;
	}


	public Integer getPhone() {
		return phone;
	}


	public void setPhone(Integer phone) {
		this.phone = phone;
	}


	public MallAdmin(Integer id, String name, String password, String mall, Integer phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}
}
	
	