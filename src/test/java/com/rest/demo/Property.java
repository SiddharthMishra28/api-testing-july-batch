package com.rest.demo;

public class Property {
	
	private int listing_id;
	private String propertyTitle;
	private String description;
	private String price;
	private String currency;
	private String city;
	private String country;
	private String address;
	private String latitude;
	private String longitude;
	private int host_id;
	private String created_at;
	private String updated_at;
	
	public int getListing_id() {
		return listing_id;
	}
	public void setListing_id(int listing_id) {
		this.listing_id = listing_id;
	}
	public String getTitle() {
		return propertyTitle;
	}
	public void setTitle(String title) {
		this.propertyTitle = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getHost_id() {
		return host_id;
	}
	public void setHost_id(int host_id) {
		this.host_id = host_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Property [listing_id=" + listing_id + ", title=" + propertyTitle + ", description=" + description + ", price="
				+ price + ", currency=" + currency + ", city=" + city + ", country=" + country + ", address=" + address
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", host_id=" + host_id + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}
