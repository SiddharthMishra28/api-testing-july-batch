package com.api.test.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.api.test.utils.TestUtils;

public class Hooks {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Method...");
		TestUtils.readConfig();
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Method...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method...");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...");
	}	
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Method...");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Method...");
	}
}
