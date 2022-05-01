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
	public long id;
	
	@Column(name="date")
	public Date date;
	
	@Column(name="name")
	public String name;
	
	@Column(name="phoneNum")
	public String phoneNum;
	
	@Column(name="vehLocation")
	public String vehLocation;
	
	@Column(name="vehYear")
	public String vehYear;
	
	@Column(name="make")
	//Make this into drop down box with common makes
	public String make;
	
	@Column(name="model")
	//Make this into drop down box based off of make
	public String model;
	
	@Column(name="color")
	public String color;
	
	@Column(name="VIN")
	public String VIN;
	
	@Column(name="vehTowedTo")
	public String vehTowedTo;
	
	@Column(name="paymentType")
	public String paymentType;
	
	@Column(name="operatorSignature")
	public String operatorSignature;
	
	@Column(name="total")
	public int total;
	
	@Autowired
	public Records() {
		
	}

	public Records(long id, Date date, String name, String phoneNum, String vehLocation, String vehYear, String make, String model,
			String color, String VIN, String vehTowedTo, String paymentType, String operatorSignature, int total) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.phoneNum = phoneNum;
		this.vehLocation = vehLocation;
		this.vehYear = vehYear;
		this.make = make;
		this.model = model;
		this.color = color;
		this.VIN = VIN;
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getVehLocation() {
		return vehLocation;
	}

	public void setVehLocation(String vehLocation) {
		this.vehLocation = vehLocation;
	}

	public String getYear() {
		return vehYear;
	}

	public void setYear(String vehYear) {
		this.vehYear = vehYear;
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

	public String getVehIdNum() {
		return VIN;
	}

	public void setVehIdNum(String VIN) {
		this.VIN = VIN;
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
				+ vehLocation + ", vehYear=" + vehYear + ", make=" + make + ", model=" + model + ", color=" + color
				+ ", VIN=" + VIN + ", vehTowedTo=" + vehTowedTo + ", paymentType=" + paymentType
				+ ", operatorSignature=" + operatorSignature + ", total=" + total + "]";
	}
}