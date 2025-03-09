package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class SignupTest {

	@Test(description= "verfiying signup")
	public void signUpTest() {
		
		SignupRequest signUpRequest = new SignupRequest.Builder().userName("teja0203").password("tej0203").firstName("tej")
														.lastName("ad").email("tej2323@gmail.com").mobileNumber("7894561230").build();
									
		AuthService authService = new AuthService();
		Response response=authService.signUp(signUpRequest);
		
		Assert.assertEquals(response.statusCode(), 200);
		
	}
	
}
