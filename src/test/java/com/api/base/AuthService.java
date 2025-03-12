package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/api/auth/";
	//response generation login	
	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}
	
//response generation forgot password	
	public Response forgotPassword(String email) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", email);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}
	
	public Response signUp(SignupRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}
}
