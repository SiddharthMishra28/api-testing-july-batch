package com.api.test.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.test.config.Hooks;
import com.api.test.models.request.Register;
import com.api.test.utils.TestUtils;

public class LoginTest extends Hooks{
	
	public TestUtils testUtils = new TestUtils();
	
	@Test(dataProvider = "testdata")
	public void register_new_user_test(String userName, String email, String Password) {
		Register register = new Register();
		register.setUsername(userName);
		register.setEmail(email);
		register.setPassword(Password);
		testUtils.postRequest(null, register, "/api/register");
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() {
		return testUtils.readExcel("register");
	}
}
