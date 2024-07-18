package com.rest.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicHttpDemo {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";
//		Response res = RestAssured.get("/api/users?page=2");
//		System.out.println(res.getBody().asPrettyString());
//		System.out.println("###############################");
//		System.out.println(res.statusCode());
		
//		Response res = RestAssured.given()
//									.param("page", 2)
//									.get("/api/users");
//		System.out.println(res.asPrettyString());
//		System.out.println(res.statusCode());
		
		String data = "{\r\n"
				+ "    \"name\": \"abcd\",\r\n"
				+ "    \"job\": \"manager\"\r\n"
				+ "}";
		Response res = RestAssured.given()
							.contentType("application/json")
							.body(data)
							.when()
							.post("/api/users");
		System.out.println(res.statusCode());
		System.out.println(res.body().asPrettyString());
	}
}
