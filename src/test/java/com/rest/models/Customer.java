package com.rest.models;

import java.util.Map;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private Map<String, Address> addresses;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public Map<String, Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", addresses=" + addresses + "]";
	}
	
	
}
