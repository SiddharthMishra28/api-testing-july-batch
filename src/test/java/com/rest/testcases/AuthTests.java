package com.rest.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rest.models.Register;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthTests {
	
	@Test
	public void registerTest() {
		Register register = new Register();
		register.setEmail("abctest@test.com");
		register.setPassword("abcd1234");
		register.setUsername("user5");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		try {
			String payload = ow.writeValueAsString(register);
			System.out.println(payload);
			RestAssured.baseURI = "http://140.238.166.121:3000";
			Response res = RestAssured.given()
						.contentType(ContentType.JSON)
						.body(payload)
						.when()
						.post("/api/register")
						.then()
						.extract().response();
			System.out.println(res.getBody().asPrettyString());
			Assert.assertEquals(res.getStatusCode(), 201);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
