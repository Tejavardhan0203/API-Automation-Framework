package com.api.models.response;

public class UserProfileResponse {

	// java object to json
	private String username;
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	public UserProfileResponse() {
		
	}
	public UserProfileResponse(String username, String id, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "UserProfileResponse [username=" + username + ", id=" + id + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
