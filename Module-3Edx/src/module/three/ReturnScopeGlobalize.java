package module.three;

public class ReturnScopeGlobalize {
//In this Program we can see how return statement will pass the Information from a method to Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=5;
     method1(x);
	}
	
	
	
	
	//Starting Method
	public static void method1(int x) {
		x=x*5;
		
		System.out.println("The computed value of X inside a method is:"+x);
	}
	
	

}
