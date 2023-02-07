package in.com.fundamentals;

public class AssignmentTwo {

	public static void main(String[] args) {
		//Creating AssignmentOne class ref_variable and calling methods to impliment in AssignmentTwo class

      AssignmentOne as=new AssignmentOne();
      int div_result=as.division(10,2);
      System.out.println("Division Result"+":-"+div_result);

      int sub_result =as.subtraction(div_result,2);
      System.out.println("Substraction result"+":-"+sub_result);

      int add_result=as.addition(sub_result,2);
      System.out.println("Addition Value"+":-"+add_result);

      sub_result=as.subtraction(add_result,2);
      System.out.println("Substraction result"+":-"+sub_result);

      int multi_result=as.multiplication(sub_result,2);
      System.out.println("Multiplication Result"+":-"+multi_result);

	}

}
