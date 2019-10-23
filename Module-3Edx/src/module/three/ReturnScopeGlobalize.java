package module.three;

public class ReturnScopeGlobalize {
//In this Program we can see how return statement will pass the Information from a method to Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=5;
     method1(x);
     System.out.println("The Value of X inside the main is still :"+x);
     int y=6;
     System.out.println("Before return value of Y is :"+y);
     y=method2(y);
     System.out.println("The value of computed y returned from the method to main is now:  "+y);
	}
	
	
	
	
	//Starting Method
	public static void method1(int x) {
		x=x*5;
		
		System.out.println("The computed value of X inside a method is:"+x);
	}
	
	//Lets use the return to print the information of a variable within the method to a Main
	
	public static int method2(int y) {
		y=y*4;
		return y;
	}
	
	

}
