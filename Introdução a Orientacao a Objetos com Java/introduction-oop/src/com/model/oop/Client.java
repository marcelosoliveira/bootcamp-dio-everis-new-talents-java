package com.model.oop;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
	
	private List<Address> address;

	
	public Client() {
	}
	
	private List<Address> getAddress() {
		if (address == null) this.address = new ArrayList<Address>();
		return address;
	}
	
//	public void setAddress(List<Address> address) {
//		if (address == null) this.address = new ArrayList<Address>();
//		this.address = address;
//	}
	
	public void addAddress(Address address) {
		if (address == null) throw new NullPointerException("address is not null!");
		if (address.getZipCode() == null) throw new NullPointerException("Zip code is not null!");
		
		getAddress().add(address);
	}

	@Override
	public String toString() {
		return "Client" + super.toString() + address + "]";
	}

    
	
}
