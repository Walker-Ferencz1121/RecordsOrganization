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
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	//@GeneratedValue(strategy =  GenerationType.AUTO)
	private long id;
	
	@Column(name = "towing_fee")
	private double towingFee;
	
	@Column(name = "mileage_fee")
	private double mileageFee;
	
	public Total() {
		
	}

	public Total(long id, double towingFee, double mileageFee) {
		super();
		this.id = id;
		this.towingFee = towingFee;
		this.mileageFee = mileageFee;
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
	
	public double total() {
		return towingFee + mileageFee;
	}
}