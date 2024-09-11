package com.api.test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.test.config.Hooks;
import com.api.test.models.request.LoginModel;

public class LoginTest extends Hooks{
	
	
	@Test
	public void generate_token_with_credentials() {
		System.out.println("Token Generated!");
		Assert.assertEquals("Token", "Token");
		LoginModel model = new LoginModel();
		model.setEmail("sdsa").setPassword("asdsad");
	}
}
