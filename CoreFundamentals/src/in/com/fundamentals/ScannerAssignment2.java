package in.com.fundamentals;

import java.util.Scanner;

public class ScannerAssignment2 extends ScannerAssignment1 {

	public static void main(String[] args) {
		
		ScannerAssignment1 sa=new ScannerAssignment1 ();
		Scanner sc=new Scanner(System.in);
		
		int x1,x2,x3,x4,x5,x6;
		System.out.print("Enter value for x1 & x2:-"+" ");
		x1=sc.nextInt();
		x2=sc.nextInt();
		int multiresult1=sa.multiply(x1, x2);
		System.out.println("Value of multiplication (x1*x2):-"+" "+multiresult1+"\n");
		
		System.out.print("Enter value for x3:-");
		x3=sc.nextInt();
		int subresult=sa.sub(multiresult1, x3);
		System.out.println("Value of substraction ((x1*x2)-x3):-"+" "+subresult+"\n");
		
		System.out.println("Enter value for x4:-");
	    x4=sc.nextInt();
		 int addresult=sa.add(subresult,x4);
		System.out.println("Value of  adddition (((x1*x2)-x3)+x4)):-"+" "+addresult+"\n");
		
		System.out.println("Enter value for x5:-");
	   	 x5=sc.nextInt();
		 int subresult2=sa.sub(addresult,x5);
		 
		System.out.println("Value of  substraction ((((x1*x2)-x3)+x4))-x5):-"+" "+subresult2+"\n");
		
		System.out.println("Enter value of x6");
		x6=sc.nextInt();
		 int divresult=sa.div(subresult2,x6);
		System.out.println("Value of second multiplication (((((x1*x2)-x3)+x4))-x5)/x6):-"+" "+divresult+"\n");
		
		
		

	}

}
