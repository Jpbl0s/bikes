package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.util.Date;

public class Bike {

	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;
	private Date purchaseDate;
	private boolean contact;
	
	public Bike() {
		
	}
	
	public Bike(String name, String email, String phone, String model, String serialNumber,
			BigDecimal purchasePrice, Date purchaseDate, boolean contact) {
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.model=model;
		this.serialNumber=serialNumber;
		this.purchasePrice=purchasePrice;
		this.purchaseDate=purchaseDate;
		this.contact=contact;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public boolean isContact() {
		return contact;
	}

	public void setContact(boolean contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", email=" + email + ", phone=" + phone + ", model=" + model + ", serialNumber="
				+ serialNumber + ", purchasePrice=" + purchasePrice + ", purchaseDate=" + purchaseDate + ", contact="
				+ contact + "]";
	}
	
	
	
	
}
