package in.com.fundamentals;

import java.util.Scanner;

public class ScannerAssignment1 {
	
	public  int add(int param1,int param2)
	{
		 //int addresult= param1+param2;
		 
		 return param1+param2;
	}
	public int sub(int param1,int param2)
	{
		 int subresult= param1-param2;
		 
		 return subresult;
	}
	public int multiply(int param1,int param2)
	{
		 int multiresult= param1*param2;
		 
		 return multiresult;
	}
	public int div(int param1,int param2)
	{
		 int divresult= param1/param2;
		 
		 return divresult;
	}

	public static void main(String[] args) {
		
		ScannerAssignment1 sa=new ScannerAssignment1 ();
		Scanner sc=new Scanner(System.in);
		
		int x1,x2,x3,x4,x5,x6;
		System.out.print("Enter value for x1 & x2:-"+" ");
		x1=sc.nextInt();
		x2=sc.nextInt();
		int addresult1=sa.add(x1, x2);
		System.out.println("Value of first addition (x1+x2):-"+" "+addresult1+"\n");
		System.out.print("Enter value for x3:-");
		x3=sc.nextInt();
		int addresult2=sa.add(addresult1, x3);
		System.out.println("Value of second addition (x1+x2)+x3:-"+" "+addresult2+"\n");
		System.out.print("Enter value for x4:-");
		 x4=sc.nextInt();
		 int subresult1=sa.sub(addresult2,x4);
		System.out.println("Value of  substraction (((x1+x2)+x3)-x4):-"+" "+subresult1+"\n");
		
		System.out.print("Enter value for x5:-");
		x5=sc.nextInt();
		 int divresult1=sa.div(subresult1,x5);
		System.out.println("Value of  division ((((x1+x2)+x3)-x4)/x5):-"+" "+divresult1+"\n");
		
		System.out.print("Enter value for x6:-");
		x6=sc.nextInt();
		 int multiplyresult1=sa.multiply(divresult1,x6);
		System.out.println("Value of  multiplication (((((x1+x2)+x3)-x4)/x5)*x6):-"+" "+multiplyresult1+"\n");
		
		
		
	}

}
