package in.com;

public class ThisKeyWord {
	
	public void defaultParameterize(){
        System.out.println("Default method");
    }
    public void OneParameterized(int var){
        System.out.println("One parameterize method");
    }
    public void twoParameterize(int var1,int var2){
        this.fourParameterize(1,2,3,4);
        this.defaultParameterize();
        this.OneParameterized(1);
        this.threeParameterized(1,2,3);
        System.out.println("Two parameterized method");
    }

    public void threeParameterized(int var1,int var2 ,int var3){
        System.out.println("Three parameterize method");
    }
    public void fourParameterize(int var1,int var2,int var3,int var4){
        System.out.println("Four parameterize method");
    }

	public static void main(String[] args) {
		
		ThisKeyWord obj=new ThisKeyWord();
        obj.twoParameterize(1,2);
		

	}

}
