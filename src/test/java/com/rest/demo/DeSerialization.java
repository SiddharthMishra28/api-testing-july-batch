package com.rest.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rest.models.Login;
import com.rest.models.Token;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeSerialization {

//	public static void main(String[] args) throws JsonProcessingException {
//		Login login = new Login();
//		login.setEmail("test@gmail.com");
//		login.setPassword("password1");
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
//		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//		String payload = ow.writeValueAsString(login);
//		RestAssured.baseURI = "http://140.238.166.121:3000";
//		Response res = RestAssured.given()
//					.contentType(ContentType.JSON)
//					.body(payload)
//					.when()
//					.post("/api/login")
//					.then()
//					.extract().response();
////		System.out.println(res.asPrettyString());
//		
//		// JSONPATH
//		// DESERIALIZE JSON TO Java object
//		Token authToken = mapper.readValue(res.getBody().asString(), Token.class);
//		System.out.println(authToken.getToken());
//	}
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String response = "{\r\n"
				+ "  \"businessId\" : \"1\",\r\n"
				+ "  \"businessName\" : \"JSW Steel pvt ltd\",\r\n"
				+ "  \"businessLocation\" : \"Jharkhand\",\r\n"
				+ "  \"customers\" : [ {\r\n"
				+ "    \"customerId\" : \"1\",\r\n"
				+ "    \"customerName\" : \"test customer\",\r\n"
				+ "    \"customerEmail\" : \"customer1@test.com\",\r\n"
				+ "    \"customerPhone\" : \"2343242432\",\r\n"
				+ "    \"addresses\" : {\r\n"
				+ "      \"addr2\" : {\r\n"
				+ "        \"houseNo\" : \"1101\",\r\n"
				+ "        \"locality\" : \"Kharadi\",\r\n"
				+ "        \"area\" : \"PMC\",\r\n"
				+ "        \"city\" : \"Pune\",\r\n"
				+ "        \"state\" : \"Maharashtra\",\r\n"
				+ "        \"country\" : \"India\",\r\n"
				+ "        \"pinCode\" : \"411042\"\r\n"
				+ "      },\r\n"
				+ "      \"addr1\" : {\r\n"
				+ "        \"houseNo\" : \"1101\",\r\n"
				+ "        \"locality\" : \"Kharadi\",\r\n"
				+ "        \"area\" : \"PMC\",\r\n"
				+ "        \"city\" : \"Pune\",\r\n"
				+ "        \"state\" : \"Maharashtra\",\r\n"
				+ "        \"country\" : \"India\",\r\n"
				+ "        \"pinCode\" : \"411042\"\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  } ]\r\n"
				+ "}";
		ObjectMapper mapper = new ObjectMapper();
		com.rest.models.Business steelBusiness = mapper.readValue(response, com.rest.models.Business.class);
		System.out.println(steelBusiness.getCustomers());
	}

}
