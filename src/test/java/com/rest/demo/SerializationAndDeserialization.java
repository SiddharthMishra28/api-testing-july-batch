package com.rest.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SerializationAndDeserialization {

	public static void main(String[] args) throws JsonProcessingException {
//		Phone iphone = new Phone();
//		iphone.setColor("Blue").setMake("Apple").setModel("Iphone 15")
//		   .setNetworkType("GSM 5G").setRamCapacity(4);
		Business ecomm = new Business();
		ecomm.setName("Amazon");
		ecomm.setDescription("Large scale multivendor ecommerce site!");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String payload = ow.writeValueAsString(ecomm);
		RestAssured.baseURI = "http://155.248.240.185:3000";
		Response res = RestAssured.given()
					.contentType(ContentType.JSON)
					.body(payload)
					.when()
					.post("/businesses")
					.then()
					.extract().response();
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
					
	}
}
