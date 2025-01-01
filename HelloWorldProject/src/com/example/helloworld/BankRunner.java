package com.example.helloworld;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		Employee emp = new Employee();
		
		emp.setName("Gajendra");
		emp.setEmail("Gajendra.pathak@rtx.com");
		emp.setPhoneNumber("454657657657");
		
		emp.setEmployer("Larson");
		emp.setSalary(50000);
		emp.setTitle("Agent");
		emp.setEmployeeGrade('A');
		System.out.println(emp);
	}

}
