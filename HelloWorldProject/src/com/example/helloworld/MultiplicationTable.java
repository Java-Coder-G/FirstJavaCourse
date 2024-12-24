package com.example.helloworld;

public class MultiplicationTable {
	void print() {
		print(5);
		
		
	}
	void print(int table) {
		print(table, 1, 10);
		
	}
	void print(int table, int from, int to) {
		System.out.printf("Printing the table of %d", table).println();
		for (int i = from; i <= to ; i++) {
			System.out.printf( " %d x %d = %d", table, i, table*i).println();
		}
		
	}
	

}
