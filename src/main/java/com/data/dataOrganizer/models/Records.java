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
	
	@Column(name = "towing_fee")
	private double towingFee;
	
	@Column(name = "mileage_fee")
	private double mileageFee;
	
	@Column(name = "extra_person")
	private double extraPerson;
	
	@Column(name = "special_equip")
	private double specialEquip;
	
	@Column(name = "labor_charge")
	private double laborCharge;
	
	@Column(name = "storage")
	private double storage;
	
//	@Column(name = "total_price")
//	private double totalPrice;

	public Records() {
		
	}

	public Records(long id, String storageStart, String storageEnd, String firstName, String lastName, String phoneNum,
			String vehLocation, String vehYear, String vehMake, String vehModel, String vehColor, String vehIdNum,
			String vehTowedTo, String payment, String opSignature, String extraText, double towingFee,
			double mileageFee, double extraPerson, double specialEquip, double laborCharge, double storage,
			double totalPrice) {
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
		this.towingFee = towingFee;
		this.mileageFee = mileageFee;
		this.extraPerson = extraPerson;
		this.specialEquip = specialEquip;
		this.laborCharge = laborCharge;
		this.storage = storage;
//		this.totalPrice = totalPrice;
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
	
	public double getTowingFee() {
		
		return towingFee;
	}

	public void setTowingFee(double towingFee) {
		this.towingFee = towingFee;
	}

	public double getMileageFee() {
		
		return mileageFee;
	}

	public void setMileageFee(double mileageFee) {
		this.mileageFee = mileageFee;
	}

	public double getExtraPerson() {
		return extraPerson;
	}

	public void setExtraPerson(double extraPerson) {
		this.extraPerson = extraPerson;
	}

	public double getSpecialEquip() {
		return specialEquip;
	}

	public void setSpecialEquip(double specialEquip) {
		this.specialEquip = specialEquip;
	}

	public double getLaborCharge() {
		return laborCharge;
	}

	public void setLaborCharge(double laborCharge) {
		this.laborCharge = laborCharge;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}
//	
//	public double getTotalPrice() {
//		return totalPrice;
//	}
//
//	public void setTotalPrice(double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//
	public double totalCalculation() {		
		return towingFee + mileageFee;
	}
}