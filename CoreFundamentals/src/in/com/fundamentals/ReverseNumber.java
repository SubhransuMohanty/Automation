package in.com.fundamentals;

public abstract class ReverseNumber {

	
	public static void main(String[] args) {
		
	int n,rev,data1,data2,data3;
	n=569;
	
	data1=n/100;
	n=n%100;
	
	data2=n/10;
	data3=n%10;
	
	
	rev=data3*100+data2*10+data1;
	System.out.println(rev);
	
		
	}
	
}
