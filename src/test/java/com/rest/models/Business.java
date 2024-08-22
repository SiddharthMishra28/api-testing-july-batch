package com.rest.models;

import java.util.List;

public class Business {
	
	private String businessId;
	private String businessName;
	private String businessLocation;
	
	private List<Customer> customers;
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessLocation() {
		return businessLocation;
	}
	public void setBusinessLocation(String businessLocation) {
		this.businessLocation = businessLocation;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	@Override
	public String toString() {
		return "Business [businessId=" + businessId + ", businessName=" + businessName + ", businessLocation="
				+ businessLocation + ", customers=" + customers + "]";
	}
	
	
}
