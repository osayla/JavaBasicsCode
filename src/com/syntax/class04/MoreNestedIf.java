package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
	  boolean didRepl=true;
	  int assignments;
	  if(didRepl) {
		  System.out.println("How many assignment have you done");
		  
		  assignments=17;
		  if (assignments>15) {
			  System.out.println("You did a great job");
		}else if (assignments>10) {
			System.out.println("You did a good job");}
		else {
			System.out.println("Please complete all repl assignment");
		}
		  
		 }else {
		  System.out.println("You should complete your repil hw");
	  }
	  

	}

}
