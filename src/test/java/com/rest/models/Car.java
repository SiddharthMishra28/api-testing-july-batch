package com.rest.models;

public class Car {
	
	private String make;
	private String model;
	private int engineCapacity;
	private Engine engine;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
