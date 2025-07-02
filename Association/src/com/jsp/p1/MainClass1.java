package com.jsp.p1;

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		Employee e1 = new Employee("John", 9876543210l, "Sales", 45000.0, "john@gmail.com", 121, "Dr Raj Road", "JP Nagar", "Bengaluru", 500041);
		e1.addr.viewAddress();
		
		System.out.println();
		System.out.println("----------------------------------");
		Employee e2 = new Employee("KD", 9876543432l, "Janitor", 15000.0, "kd@gmail.com", 36, "Cox Town", "Frazer Road", "Bengaluru", 500021);
		e2.addr.viewAddress();
	}

}
