package com.data.dataOrganizer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "total")
public class Total {

	@Id
	//@GeneratedValue(strategy =  GenerationType.IDENTITY)
//	@GeneratedValue(strategy =  GenerationType.AUTO)
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "towing_fee")
	private double towingFee;
	
	@Column(name = "mileage_fee")
	private double mileageFee;
	
//	@Column(name = "extra_person")
//	private double extraPerson;
//	
//	@Column(name = "special_equip")
//	private double specialEquip;
//	
//	@Column(name = "labor_charge")
//	private double laborCharge;
//	
//	@Column(name = "storage")
//	private double storage;
	
	@Column(name = "total_price")
	private double totalPrice;
	
	public Total() {
		
	}

	public Total(long id, double towingFee, double mileageFee,
			//, double extraPerson, double specialEquip,
			//double laborCharge, double storage) 
			double totalPrice)
			{
		super();
		this.id = id;
		this.towingFee = towingFee;
		this.mileageFee = mileageFee;
//		this.extraPerson = extraPerson;
//		this.specialEquip = specialEquip;
//		this.laborCharge = laborCharge;
//		this.storage = storage;
		this.totalPrice = totalPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

//	public double getTowingFee() {
//		return towingFee;
//	}
//
//	public void setTowingFee(double towingFee) {
//		this.towingFee = towingFee;
//	}
//
//	public double getMileageFee() {
//		return mileageFee;
//	}
//
//	public void setMileageFee(double mileageFee) {
//		this.mileageFee = mileageFee;
//	}
//
//	public double getExtraPerson() {
//		return extraPerson;
//	}
//
//	public void setExtraPerson(double extraPerson) {
//		this.extraPerson = extraPerson;
//	}
//
//	public double getSpecialEquip() {
//		return specialEquip;
//	}
//
//	public void setSpecialEquip(double specialEquip) {
//		this.specialEquip = specialEquip;
//	}
//
//	public double getLaborCharge() {
//		return laborCharge;
//	}
//
//	public void setLaborCharge(double laborCharge) {
//		this.laborCharge = laborCharge;
//	}
//
//	public double getStorage() {
//		return storage;
//	}
//
//	public void setStorage(double storage) {
//		this.storage = storage;
//	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		//this.totalPrice = towingFee + mileageFee;
	}

	public double totalCalculation() {
		this.totalPrice = towingFee + mileageFee;
		
		return totalPrice;
		
		//return towingFee + mileageFee;
	}
	
//	public double stringToDouble(String s) {
//		return Double.parseDouble(s);
//	}
//	
//	private double intTodouble(int n) {
//		return double.valueOf(n);
//	}
//	
//	public double totalCalculation() {
//		int intAns = stringToInt(towingFee) + stringToInt(mileageFee);
//		
//		return intTodouble(intAns) + "
//	}
}