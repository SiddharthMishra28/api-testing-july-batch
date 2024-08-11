package com.rest.demo;

public class Engine {
	
	private String make;
	private String model;
	private long capacityInCc;
	
	public String getMake() {
		return make;
	}
	public Engine setMake(String make) {
		this.make = make;
		return this;
	}
	public String getModel() {
		return model;
	}
	public Engine setModel(String model) {
		this.model = model;
		return this;
	}
	public long getCapacityInCc() {
		return capacityInCc;
	}
	public Engine setCapacityInCc(long capacityInCc) {
		this.capacityInCc = capacityInCc;
		return this;
	}
	
	
}
