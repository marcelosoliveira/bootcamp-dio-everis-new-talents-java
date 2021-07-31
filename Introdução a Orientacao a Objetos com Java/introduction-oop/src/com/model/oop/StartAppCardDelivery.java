package com.model.oop;

public class StartAppCardDelivery {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setZipCode("13950-000");
		
		Client client = new Client();
		try {
			client.addAddress(address);
			client.setDocument("35161811846");
			System.out.println(client);			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
