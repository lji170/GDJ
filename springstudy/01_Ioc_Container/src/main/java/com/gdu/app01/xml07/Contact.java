package com.gdu.app01.xml07;

public class Contact {

	// field
	private String address;
	private String email;
	private String tel;
	
	// constructor
	public Contact(String adderess, String email, String tel) {
		super();
		this.address = adderess;
		this.email = email;
		this.tel = tel;
	}
	
	// method
	public void info( ) {
		System.out.println("주소: " + address);
		System.out.println("주소: " + email);
		System.out.println("주소: " + tel);
	}
	
}
