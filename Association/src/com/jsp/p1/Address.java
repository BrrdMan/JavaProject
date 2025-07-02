package com.jsp.p1;

public class Address {
	
	int houseNo;
	String streetName;
	String landmark;
	String city;
	int pincode;
	
	public Address(int houseNo, String streetName, String landmark, String city, int pincode) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
	}

	public void viewAddress() {
		System.out.println("houseNo= " + houseNo + ", \nstreetName= " + streetName + ", \nlandmark= " + landmark + ", \ncity= "
				+ city + ", \npincode =" + pincode);
		
		System.out.println("houseNo= " + houseNo + ", \nstreetName= " + streetName + ", \nlandmark= " + landmark + ", \ncity= "
				+ city + ", \npincode =" + pincode);
	}
		
	
}
