package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {

	private final String name;
	private final ArrayList<Address> addresses = new ArrayList<Address>();

	public Business(String businessName) {
		name = businessName;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address businessAddress) {
		addresses.add(businessAddress);
	}
}