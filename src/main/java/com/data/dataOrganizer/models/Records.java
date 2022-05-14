package com.data.dataOrganizer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class Records {
	
	@Id
	//@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "veh_year")
	private String vehYear;
	
	@Column(name = "phone_num")
	private String phoneNum;

	public Records() {
		
	}

	public Records(long id, String name, String vehYear, String phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.vehYear = vehYear;
		this.phoneNum = phoneNum;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehYear() {
		return vehYear;
	}

	public void setVehYear(String vehYear) {
		this.vehYear = vehYear;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}