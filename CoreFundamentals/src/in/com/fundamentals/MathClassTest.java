package in.com.fundamentals;

import java.util.Scanner;

public class MathClassTest {
	int x,y;
	Scanner sd = new Scanner(System.in);

	public static void main(String[] args) {
		
		MathClassTest ref=new MathClassTest();
		
		//System.out.println("Max Number between x & y is :- " + ref.MathMax()+"\n");
		
		//System.out.println("Min Number between x & y is :- " + ref.MathMin()+"\n");
		
		System.out.println("Square root of x is :- " + ref.MathSquareroot());
		
		 }

	public int MathMax()
	{
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Please Enter first number");
		 x=sd.nextInt();		
		 System.out.println("Please enter second number");
		 y=sd.nextInt();
		 
		 return Math.max(x, y);
	}
	public int MathMin()
	{
	
		System.out.println("Please Enter first number");
		 x=sd.nextInt();		
		 
		 return Math.min(x, y);
	}
	public double MathSquareroot()
	{
	
		System.out.println("Please Enter a number");
		 x=sd.nextInt();	
		 
		 return Math.sqrt(x);
	}
}

