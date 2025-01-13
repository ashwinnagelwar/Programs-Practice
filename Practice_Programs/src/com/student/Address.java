package com.student;

public class Address {

	private int id;
	private String city;
	private String State;
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}
	public Address(int id, String city, String state, int pincode) {
		super();
		this.id = id;
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
