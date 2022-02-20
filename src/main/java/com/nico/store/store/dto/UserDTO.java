package com.nico.store.store.dto;

public class UserDTO {

	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String avatar;
	private Boolean disable;
	
	public UserDTO() {
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Boolean getDisable() {
		return disable;
	}
	public void setDisable (Boolean disable) {
		this.disable = disable;
	}

}
