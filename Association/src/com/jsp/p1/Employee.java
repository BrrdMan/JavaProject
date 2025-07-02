package com.jsp.p1;

public class Employee {
	
	private static int randnum = 10001;
	private static String prefix = "TYP";
	String empId;
	String name;
	long mobileNo;
	String designation;
	double salary;
	String email;
	
	Address addr;

	public Employee(String name, long mobileNo, String designation, double salary, String email,
			int houseNo, String streetName, String landmark, String city, int pincode) {
		this.empId = prefix + randnum++;
		this.name = name;
		this.mobileNo = mobileNo;
		this.designation = designation;
		this.salary = salary;
		this.email = email;
		addr = new Address(houseNo, streetName, landmark, city, pincode);
	}

}
