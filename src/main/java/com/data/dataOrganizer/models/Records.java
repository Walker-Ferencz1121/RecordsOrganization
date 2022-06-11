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
	//@GeneratedValue(strategy =  GenerationType.AUTO)
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "storage_start")
	private String storageStart;

	@Column(name = "storage_end")
	private String storageEnd;

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
	
	@Column(name = "extra_text")
	private String extraText;

	public Records() {
		
	}

	public Records(long id, String storageStart, String storageEnd, String firstName, String lastName, String phoneNum,
			String vehLocation, String vehYear, String vehMake, String vehModel, String vehColor, String vehIdNum,
			String vehTowedTo, String payment, String opSignature, String total, String extraText) {
		super();
		this.id = id;
		this.storageStart = storageStart;
		this.storageEnd = storageEnd;
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
		this.extraText = extraText;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStorageStart() {
		return storageStart;
	}

	public void setStorageStart(String storageStart) {
		this.storageStart = storageStart;
	}

	public String getStorageEnd() {
		return storageEnd;
	}

	public void setStorageEnd(String storageEnd) {
		this.storageEnd = storageEnd;
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

	public String getExtraText() {
		return extraText;
	}

	public void setExtraText(String extraText) {
		this.extraText = extraText;
	}
	
//	public double totalCalculation() {
//		Total total = new Total();
//		
//		return total.totalCalculation();
//	}
}