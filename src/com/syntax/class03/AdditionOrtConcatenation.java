package com.syntax.class03;

public class AdditionOrtConcatenation {//concatenation meaning is link thing together

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		
		System.out.println(a+b+c+d);//30HelloHi
	    System.out.println(a+c+b+d);//10Hello20Hi
	    System.out.println(c+d+a+b);//HelloHi1020
	    System.out.println(c+d+(a+b));//HelloHi30
	    
	    //string +any thing = string
	    //unless string +()= string +the other type
	    
	    boolean boo= true;
	    System.out.println(c+boo);//Hellotrue
	    
	    
	    int num1=10;
	    int num2=11;
	    System.out.println(num1+num2);

	}

}
