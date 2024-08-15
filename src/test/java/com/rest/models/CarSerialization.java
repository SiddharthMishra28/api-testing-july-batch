package com.rest.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CarSerialization {
	public static void main(String[] args) throws JsonProcessingException {
		Engine fiatEngine = new Engine();
		fiatEngine.setEngineBrand("FIAT");
		fiatEngine.setEngineType("Diesel");
		Car punto = new Car();
		punto.setModel("punto");
		punto.setMake("Chrysler");
		punto.setEngineCapacity(1100);
		punto.setEngine(fiatEngine);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String payload = ow.writeValueAsString(punto);
		System.out.println(payload);
	}
}
