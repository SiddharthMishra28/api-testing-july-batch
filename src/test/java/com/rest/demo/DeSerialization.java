package com.rest.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rest.models.Login;
import com.rest.models.Token;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeSerialization {

	public static void main(String[] args) throws JsonProcessingException {
		Login login = new Login();
		login.setEmail("test@gmail.com");
		login.setPassword("password1");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String payload = ow.writeValueAsString(login);
		RestAssured.baseURI = "http://140.238.166.121:3000";
		Response res = RestAssured.given()
					.contentType(ContentType.JSON)
					.body(payload)
					.when()
					.post("/api/login")
					.then()
					.extract().response();
//		System.out.println(res.asPrettyString());
		
		// JSONPATH
		// DESERIALIZE JSON TO Java object
		Token authToken = mapper.readValue(res.getBody().asString(), Token.class);
		System.out.println(authToken.getToken());
	}

}
