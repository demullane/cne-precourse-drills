package com.galvanize;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String userStreet, String userCity, String userState, String userZip) {
		street = userStreet;
		city = userCity;
		state = userState;
		zip = userZip;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public void setStreet(String userStreet) {
		street = userStreet;
	}

	public void setCity(String userCity) {
		city = userCity;
	}

	public void setState(String userState) {
		state = userState;
	}

	public void setZip(String userZip) {
		zip = userZip;
	}

	@Override public String toString() {
		StringBuilder result = new StringBuilder();

	    result.append(street + ", ");
	    result.append(city + ", ");
	    result.append(state + " ");
	    result.append(zip);

	    return result.toString();
	}

}