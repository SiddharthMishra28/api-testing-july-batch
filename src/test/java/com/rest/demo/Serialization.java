package com.rest.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rest.models.Address;
import com.rest.models.Customer;

public class Serialization {

//	public static void main(String[] args) throws JsonProcessingException {
//		Phone iphone = new Phone();
//		iphone.setColor("Blue").setMake("Apple").setModel("Iphone 15")
//		   .setNetworkType("GSM 5G").setRamCapacity(4);
//		Business ecomm = new Business();
//		ecomm.setName("Amazon");
//		ecomm.setDescription("Large scale multivendor ecommerce site!");
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
//		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//		String payload = ow.writeValueAsString(ecomm);
//		RestAssured.baseURI = "http://155.248.240.185:3000";
//		Response res = RestAssured.given()
//					.contentType(ContentType.JSON)
//					.body(payload)
//					.when()
//					.post("/businesses")
//					.then()
//					.extract().response();
//		System.out.println(res.asPrettyString());
//		System.out.println(res.statusCode());
//	}
//	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Address address1 = new Address();
		address1.setHouseNo("1101");
		address1.setApartment("Kharadi");
		address1.setArea("PMC");
		address1.setCity("Pune");
		address1.setState("Maharashtra");
		address1.setCountry("India");
		address1.setPinCode("411042");
		
		Address address2 = new Address();
		address2.setHouseNo("1101");
		address2.setApartment("Kharadi");
		address2.setArea("PMC");
		address2.setCity("Pune");
		address2.setState("Maharashtra");
		address2.setCountry("India");
		address2.setPinCode("411042");
		
		Customer customer1 = new Customer();
		customer1.setCustomerName("test customer");
		customer1.setCustomerId("1");
		customer1.setCustomerEmail("customer1@test.com");
		customer1.setCustomerPhone("2343242432");
		Map<String, Address> addressMap = new HashMap();
		addressMap.put("addr1", address1);
		addressMap.put("addr2", address2);
		customer1.setAddresses(addressMap);
		
		com.rest.models.Business business = new com.rest.models.Business();
		business.setBusinessId("1");
		business.setBusinessLocation("Jharkhand");
		business.setBusinessName("JSW Steel pvt ltd");
		business.setCustomers(List.of(customer1));
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String payload = ow.writeValueAsString(business);
		System.out.println(payload);
	}
}
