package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i =1; i<=5; i++) {
    	 System.out.println("Hello"+" ");
    	 if (i==3) {
    	 break;// if i add break it will run only on time
     }}
     boolean summer= true;
     int temp= 95;
     while(summer) {
    	 System.out.println("It is hot");// infinity
    	 if(temp<70) {
    		System.out.println("It is not hot any more"); 
    	 
    	 break;// if i added break it will run it one time
    	
    	 } 
    	 
     }
	}

}
