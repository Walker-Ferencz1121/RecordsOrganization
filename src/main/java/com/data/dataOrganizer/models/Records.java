package com.data.dataOrganizer.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "records")
public class Records {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phoneNum")
	private int phoneNum;
	
	@Column(name="vehLocation")
	private String vehLocation;
	
	@Column(name="year")
	private int year;
	
	@Column(name="make")
	//Make this into drop down box with common makes
	private String make;
	
	@Column(name="model")
	//Make this into drop down box based off of make
	private String model;
	
	@Column(name="color")
	private String color;
	
	@Column(name="vehIdNum")
	private int vehIdNum;
	
	@Column(name="vehTowedTo")
	private String vehTowedTo;
	
	@Column(name="paymentType")
	private String paymentType;
	
	@Column(name="operatorSignature")
	private String operatorSignature;
	
	@Column(name="total")
	private int total;
	
	@Autowired
	public Records() {
		
	}

	public Records(long id, Date date, String name, int phoneNum, String vehLocation, int year, String make, String model,
			String color, int vehIdNum, String vehTowedTo, String paymentType, String operatorSignature, int total) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.phoneNum = phoneNum;
		this.vehLocation = vehLocation;
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.vehIdNum = vehIdNum;
		this.vehTowedTo = vehTowedTo;
		this.paymentType = paymentType;
		this.operatorSignature = operatorSignature;
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getVehLocation() {
		return vehLocation;
	}

	public void setVehLocation(String vehLocation) {
		this.vehLocation = vehLocation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVehIdNum() {
		return vehIdNum;
	}

	public void setVehIdNum(int vehIdNum) {
		this.vehIdNum = vehIdNum;
	}

	public String getVehTowedTo() {
		return vehTowedTo;
	}

	public void setVehTowedTo(String vehTowedTo) {
		this.vehTowedTo = vehTowedTo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOperatorSignature() {
		return operatorSignature;
	}

	public void setOperatorSignature(String operatorSignature) {
		this.operatorSignature = operatorSignature;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Records [id=" + id + ", date=" + date + ", name=" + name + ", phoneNum=" + phoneNum + ", vehLocation="
				+ vehLocation + ", year=" + year + ", make=" + make + ", model=" + model + ", color=" + color
				+ ", vehIdNum=" + vehIdNum + ", vehTowedTo=" + vehTowedTo + ", paymentType=" + paymentType
				+ ", operatorSignature=" + operatorSignature + ", total=" + total + "]";
	}
}