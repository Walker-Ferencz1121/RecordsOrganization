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
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_num")
	private String phoneNum;
	
	@Column(name = "veh_location")
	private String vehLocation;
	
	@Column(name = "veh_year")
	private String vehYear;
	
	@Column(name = "veh_make")
	private String vehMake;
	
	@Column(name = "veh_model")
	private String vehModel;
	
	@Column(name = "veh_color")
	private String vehColor;
	
	@Column(name = "veh_id_num")
	private String vehIdNum;
	
	@Column(name = "veh_towed_to")
	private String vehTowedTo;
	
	@Column(name = "payment")
	private String payment;
	
	@Column(name = "op_signature")
	private String opSignature;
	
	@Column(name = "total")
	private String total;

	public Records() {
		
	}

	public Records(long id, String date, String firstName, String lastName, String phoneNum, String vehLocation, String vehYear,
			String vehMake, String vehModel, String vehColor, String vehIdNum, String vehTowedTo, String payment,
			String opSignature, String total) {
		super();
		this.id = id;
		this.date = date;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.vehLocation = vehLocation;
		this.vehYear = vehYear;
		this.vehMake = vehMake;
		this.vehModel = vehModel;
		this.vehColor = vehColor;
		this.vehIdNum = vehIdNum;
		this.vehTowedTo = vehTowedTo;
		this.payment = payment;
		this.opSignature = opSignature;
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getVehYear() {
		return vehYear;
	}

	public void setVehYear(String vehYear) {
		this.vehYear = vehYear;
	}

	public String getVehMake() {
		return vehMake;
	}

	public void setVehMake(String vehMake) {
		this.vehMake = vehMake;
	}

	public String getVehModel() {
		return vehModel;
	}

	public void setVehModel(String vehModel) {
		this.vehModel = vehModel;
	}

	public String getVehColor() {
		return vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getVehIdNum() {
		return vehIdNum;
	}

	public void setVehIdNum(String vehIdNum) {
		this.vehIdNum = vehIdNum;
	}

	public String getVehTowedTo() {
		return vehTowedTo;
	}

	public void setVehTowedTo(String vehTowedTo) {
		this.vehTowedTo = vehTowedTo;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getOpSignature() {
		return opSignature;
	}

	public void setOpSignature(String opSignature) {
		this.opSignature = opSignature;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	
}