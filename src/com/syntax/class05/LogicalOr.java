package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*monday and friday > no class
		 * tuesday and wednesday > manual testing
		 * thrsday >review
		 * satueday and sunday > java
		 */
String day =("Monday");

if (day.equals("Monday") || day.equals("Friday")) {
	System.out.println("I have no class");
}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
	System.out.println("I have manual testing class");
}else if (day.equals("thrusday")) {
	System.out.println("I have review class");
}else if (day.equals("Saturday") || day.equals("Sunday")) {
	System.out.println("I have Java class");
}
		
		
		
		
		
		
		
		
		
		
	}

}
