package in.com.fundamentals;

import java.util.Scanner;

public class SwitchCase {
	
	public void Day(int value)
	{
		int day=value;
		
		switch (day) {
		case 1:
			System.out.print("Today is monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednessday");
			break;
		case 4:
			System.out.println("Today is Thrusday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("Tehre is no match");
		}
	}
	

	public static void main(String[] args) {
		
SwitchCase sc=new SwitchCase();
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to find day");
int dayValue=s.nextInt();
sc.Day(dayValue);
	}

}
