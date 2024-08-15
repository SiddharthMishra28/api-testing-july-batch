package com.rest.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarDeserialization {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String apiResponse = "{\r\n"
				+ "  \"make\" : \"Chrysler\",\r\n"
				+ "  \"model\" : \"punto\",\r\n"
				+ "  \"engineCapacity\" : 1100,\r\n"
				+ "  \"engine\" : {\r\n"
				+ "    \"engineBrand\" : \"FIAT\",\r\n"
				+ "    \"engineType\" : \"Diesel\"\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "";
		
		ObjectMapper mapper = new ObjectMapper();
		Car newPuntoCar = mapper.readValue(apiResponse, Car.class);
		System.out.println(newPuntoCar.getEngineCapacity());
	}
}
