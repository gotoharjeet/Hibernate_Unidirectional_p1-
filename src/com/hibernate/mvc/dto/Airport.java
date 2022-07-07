package com.hibernate.mvc.dto;

public class Airport {
	private int unique_code;
	private String name;
	private String address;
	
	public Airport() {}

	
	
	public int getUnique_code() {
		return unique_code;
	}

	public void setUnique_code(int unique_code) {
		this.unique_code = unique_code;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
