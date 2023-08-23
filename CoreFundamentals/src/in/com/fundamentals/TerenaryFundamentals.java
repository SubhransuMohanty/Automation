package in.com.fundamentals;

public class TerenaryFundamentals {
	
	
	 int Greater(int x,int y)
	
	{
		int a,b;
		a=x;
		b=y;
		
		return a>b?a:b;
		
	}
		
	


	public static void main(String[] args) {
		
		TerenaryFundamentals tf=new TerenaryFundamentals();
		System.out.println("Greater value is :-"+ " "+tf.Greater(0, 1));

	}

}
