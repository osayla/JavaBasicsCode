package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {//main ctrl+space
	
		int i=100;
		double d=100;
		
		System.out.println(i);//100
		System.out.println(d);//100.0 widening
		
		//casting is converting 1 type into another 
		//widening implicit automatic small to biger data type numeric byte to short to in to long to float to double
		
		//narrowing explicit manual big to short 
        int x=(int)99.99;//we narrowing
        System.out.println(x);//99
		
        
        byte b=(byte)130;
        System.out.println(b);
        
		
	}

}
