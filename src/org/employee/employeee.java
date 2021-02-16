package org.employee;

import java.util.Scanner;

public class employeee {
	
	public static void main(String[] args) {
		
	Scanner	sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		String city = sc.next();
		System.out.println(city);
		System.out.println("enter employee id ");
		int empId = sc.nextInt();
		System.out.println("employee id is" +empId);
		System.out.println("enter employee salary ");
		float empSalary = sc.nextFloat();
		System.out.println("employee salary is" +empSalary);
		System.out.println("enter employee phone number ");
		long empPhone = sc.nextLong();
		System.out.println("employee phno is" +empPhone );
		System.out.println("eter employee email");
		String email = sc.next();
				System.out.println("email id is "+ email);
		
				
	}
}
