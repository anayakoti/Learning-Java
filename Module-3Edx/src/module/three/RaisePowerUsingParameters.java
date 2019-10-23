package module.three;

import java.util.Scanner;

public class RaisePowerUsingParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets give the uset a chance to select the base and exponent
		
		Scanner console=new Scanner(System.in);
		System.out.println("Please do enter the Base Value: " );
		int userValue1=console.nextInt();
		System.out.println("Please do enter the Exponent Value: ");
		int userValue2=console.nextInt();
        method1(userValue1,userValue2);
	}
	
	
	//Lets us write a method here:
	
	public static void method1(int baseValue, int powerValue) {
		int answer=1;
		
	   for(int i = 1; i<=powerValue;i++) {
		   
		  answer=answer*baseValue;
		   
	   }
	   System.out.println(+baseValue+" raise to power "+powerValue +" is="+answer);
	}

}
