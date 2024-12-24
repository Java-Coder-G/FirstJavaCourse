package com.example.helloworld;

public class MultiplicationTable {
	void print() {
		System.out.printf("The multiplication table of %d is: " , 5).println();
		
		for ( int i = 1 ; i <=10; i++) {
			System.out.printf(" % d x %d = %d",  5, i, 5*i).println();
		}
		
		
	}
	void print(int table) {
		System.out.printf("The multiplication table of %d is:", table).println();
		for (int i = 1 ; i<11; i++) {
			System.out.printf("%d x %d = %d", table, i, table*i).println();
		}
		
	}
	void print(int table, int from, int to) {
		System.out.printf("Printing the table of %d", table).println();
		for (int i = from; i <= to ; i++) {
			System.out.printf( " %d x %d = %d", table, i, table*i).println();
		}
		
	}
	

}
