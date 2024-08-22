package com.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	
	private String houseNo;
	@JsonProperty("locality")
	private String apartment;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String locality) {
		this.apartment = locality;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + apartment + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
}
