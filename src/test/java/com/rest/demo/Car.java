package com.rest.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Car {
	
	private String make;
	private String model;
	private String type;
	private String cost;
	private Engine engine;
	
	public String getMake() {
		return make;
	}
	public Car setMake(String make) {
		this.make = make;
		return this;
	}
	public String getModel() {
		return model;
	}
	public Car setModel(String model) {
		this.model = model;
		return this;
	}
	public String getType() {
		return type;
	}
	public Car setType(String type) {
		this.type = type;
		return this;
	}
	public String getCost() {
		return cost;
	}
	public Car setCost(String cost) {
		this.cost = cost;
		return this;
	}
	
	private Car SetEngine(Engine engine) {
		this.engine = engine;
		return this;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Car i20 = new Car();
		Engine fiatEngine = new Engine();
		fiatEngine.setMake("FIAT").setModel("f25").setCapacityInCc(1100);
		i20.setMake("hyundai").setModel("i20").setType("hatchback").SetEngine(fiatEngine);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String payload = ow.writeValueAsString(i20);
		System.out.println(payload);
	}
	
}
