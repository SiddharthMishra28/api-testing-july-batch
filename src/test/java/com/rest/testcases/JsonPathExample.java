package com.rest.testcases;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
//import static com.jayway.jsonpath.JsonPath.*;

import io.restassured.path.json.JsonPath;

public class JsonPathExample {
	
	public String responsePayload = "{\r\n"
			+ "  \"id\": \"https://docs.atlassian.com/jira/REST/schema/error-collection#\",\r\n"
			+ "  \"title\": \"Error Collection\",\r\n"
			+ "  \"type\": \"object\",\r\n"
			+ "  \"properties\": {\r\n"
			+ "    \"errorMessages\": {\r\n"
			+ "      \"type\": \"array\",\r\n"
			+ "      \"items\": {\r\n"
			+ "        \"type\": \"string\"\r\n"
			+ "      }\r\n"
			+ "    },\r\n"
			+ "    \"errors\": {\r\n"
			+ "      \"type\": \"object\",\r\n"
			+ "      \"patternProperties\": {\r\n"
			+ "        \".+\": {\r\n"
			+ "          \"type\": \"string\"\r\n"
			+ "        }\r\n"
			+ "      },\r\n"
			+ "      \"additionalProperties\": false\r\n"
			+ "    },\r\n"
			+ "    \"status\": { \r\n"
			+ "      \"type\": \"integer\"\r\n"
			+ "    }\r\n"
			+ "  },\r\n"
			+ "  \"additionalProperties\": false\r\n"
			+ "}\r\n"
			+ "";
	
	// Groovy GPath
	@Test
	public void jsonPathExample1() {
		JsonPath path = new JsonPath(responsePayload);
		String title = path.getString("properties.errorMessages.items.type");
		System.out.println(title);
	}
	
	// Jayway JsonPath
	@Test
	public void jsonPathExample2() throws JsonMappingException, JsonProcessingException {
//		JsonNode node = new ObjectMapper().readTree(responsePayload);
//		String data = JsonPath.from(responsePayload).get("$..type");
//		System.out.println(data);
	}
}
