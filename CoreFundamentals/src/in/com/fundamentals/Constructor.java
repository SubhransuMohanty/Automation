package in.com.fundamentals;

public class Constructor {

	    public  Constructor(){
	        this(1,2,3);
	        System.out.println("Default Constructor\n");

	    }
	    public Constructor(int var){
	        this();
	        System.out.println("One parameterize constructor\n");
	    }
	    public Constructor(int var1,int var2){

	        this(1,2,3,4);
	        System.out.println("Two parameterize contructor\n");
	    }
	    public Constructor(int var1,int var2,int var3){
	        System.out.println("Three parameterize Constructor\n");
	    }
	    public Constructor(int var1,int var2,int var3,int var4){
	        this(1);
	        System.out.println("Four parameterized Constructor\n");
	    }

	    public static void main(String[] args) {
	    	
	    	Constructor obj=new Constructor(1,2);
		
	   }
		

	}


