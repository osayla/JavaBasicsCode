package com.syntax.class02;


public class HomeWork2 {

	public static void main(String[] args) {
	//part1	
		float a=6.5f;
		float b=3.1f;
		float add, sub, mult, div;
		
		add=a+b;
		sub=a-b;
		mult=a*b;
		div=a/b;
		
		System.out.println("the addition of 2 numbers "+a+" and "+b+" is equal to "+add);
		System.out.println("the subtraction of 2 numbers "+a+" and "+b+" is equal to "+sub);
		System.out.println("the multiplication of 2 numbers "+a+" and "+b+" is equal to "+mult);
		System.out.println("the divison of 2 numbers "+a+" and "+b+" is equal to "+div);
		
		//part2
		float number=3.9f;
		float square;
		square=number*number;
		System.out.println("the square of the "+number+" is "+square);
		
		//part3
		int width=5;
		int height=8;
		int area, perimeter;
		area=width*height;
		perimeter= 2*(width+height);
		System.out.println("the perimeter of a rectangle with width "+width+" and "+height+
				" is equal to "+perimeter+" and the area is "+area);
		
		
		
		
		
		
		
		
	}

}
