package in.com.fundamentals;

public class AssignmentOne {
	
	public int addition(int param1,int param2)
    {
        int add;
        add=param1+param2;

        return add;
    }
    public int  subtraction(int param1,int param2)
    {
        int sub;
        sub= param1-param2;
        return sub;
    }
    public int multiplication(int param1,int param2)
    {
        int multi;
        multi=param1*param2;
        return multi;

    }
    public int division(int param1,int param2)
    {
        int div=param1/param2;
        return div;
    }

	public static void main(String[] args) {
		
		AssignmentOne cal=new AssignmentOne();

        int add_value1=cal.addition(10,2);
        int add_value2=cal.addition(add_value1,2);
        System.out.println("Addtion result"+":-"+add_value2);

        int sub_value1=cal.subtraction(add_value2,2);
        System.out.println("Substraction result"+":-"+sub_value1);

        int multi_value1=cal.multiplication(sub_value1,2);
        System.out.println("Multiplication value"+":-"+multi_value1);

        int div_value1=cal.division(multi_value1,2);
        System.out.println("division value"+":-"+div_value1);
		

	}

}
