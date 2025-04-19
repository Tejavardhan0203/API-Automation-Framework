package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	// forgot password tests
	@Test(description = "verify forgot password test")
	public void forgotPasswordTest() {
		//change for Second PR
		AuthService authService = new AuthService();
		Response response=authService.forgotPassword("tejavardhan.9898@gmail.com");
		System.out.println(response.asPrettyString());
		
	}
	
}
