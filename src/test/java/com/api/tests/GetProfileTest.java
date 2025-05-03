package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.ProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileTest {

	@Test(description= "retreiving user profile")
	public void getProfile() {
		//get profile seervice
		LoginRequest loginRequest= new LoginRequest("teja9898" ,"teja9898");
		AuthService authService= new AuthService();
		Response response=authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		String token=loginResponse.getToken();
		
		ProfileManagementService getProfile = new ProfileManagementService();
		response=getProfile.userProile(token);
		System.out.println(response.getBody().asString());
		UserProfileResponse userProfileResponse= response.as(UserProfileResponse.class);
		
	}
}
