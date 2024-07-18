package com.rest.demo;

public class Phone {
	
	private String make;
	private String model;
	private String color;
	private String networkType;
	private int ramCapacity;
	
	public String getMake() {
		return make;
	}
	public Phone setMake(String make) {
		this.make = make;
		return this;
	}
	public String getModel() {
		return model;
	}
	public Phone setModel(String model) {
		this.model = model;
		return this;
	}
	public String getColor() {
		return color;
	}
	public Phone setColor(String color) {
		this.color = color;
		return this;
	}
	public String getNetworkType() {
		return networkType;
	}
	public Phone setNetworkType(String networkType) {
		this.networkType = networkType;
		return this;
	}
	public int getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	
	
}
