package com.example.helloworld;

public class Main {
	
	public static void main(String []args) {
		System.out.println("Hello Java world");
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		table.print(9);
		table.print(7, 5, 10);
	}

}
