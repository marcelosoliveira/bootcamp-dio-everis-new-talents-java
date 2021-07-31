package com.model.oop;

public class Address {
	
	private Integer code;
	private TypeAddress typeAddress;
	private String address;
	private String number;
	private String complement;
	private String district;
	private String city;
	private String zipCode;
	private String state;
	
	
	public Address() {
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public TypeAddress getType() {
		return typeAddress;
	}


	public void setType(TypeAddress type) {
		this.typeAddress = type;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		return "Address [code=" + code + ", type=" + typeAddress + ", address=" + address + ", number=" + number
				+ ", complement=" + complement + ", district=" + district + ", city=" + city + ", zipCode=" + zipCode
				+ ", state=" + state + "]";
	}
	
	
	

}
