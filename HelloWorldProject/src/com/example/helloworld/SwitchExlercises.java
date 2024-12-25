package com.example.helloworld;

public class SwitchExlercises {
	int dayNumber;
	int monthNumber;
	
	public static boolean isWeekly(int dayNumber) {
		if (dayNumber >=0 && dayNumber <=6) {
		return true;}
		return false;
	}
	public static String determineDayOfMonth(int monthNumber) {
		
		switch(monthNumber) {
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return " Not a Month ";
		}
		}
	
	public static String determineDayOfWeek(int dayNumber) {
	switch(dayNumber) {
	case 1: return "Sunday";
	case 2: return "Monday";
	case 3: return "Tuesday";
	case 4: return "Wednesday";
	case 5: return "Thursday";
	case 6: return "Friday";
	case 7: return "Saturday";
	default: return " Not a  Day ";
	}
		
		
	}

}
