package trip.planner;

import java.util.Scanner;

public class TripPlanner {
public static void main(String args[]) {
//part1();//Calling the First part of the Method.
part2();//Calling the Second part of the Method.
}
	
	
	//Created one part of the project:Method1
	public static void part1() {

	System.out.println("Welcome to Vacation Planner!");
	System.out.println("What is your name?");
	Scanner console=new Scanner(System.in);
	
	String fullname=console.nextLine();
	System.out.print("Nice to meet you " +fullname +", "+ "Where are you travelling to? ");
	String city=console.nextLine();
	System.out.println("Great! "+city+" sounds like a great trip");
	System.out.println("**********");
	System.out.println();
	
}
	//End of the Method1
	
	//Creation of Method2
	
	public static void part2() {
		
	Scanner console=new Scanner(System.in);
	System.out.println("How many days are you going to spend travelling?");
	int days1=console.nextInt();
	System.out.println("How much Money, in USD, are you planning to spend on your trip?");
	int moneyUSA=console.nextInt();
	System.out.println("What is the three letter Currency symbol for your travel destination?");
	String inrSymbol=console.next();
	System.out.println("How many Indian Rupees are equal to one $1USD?");
	double moneyExchange=console.nextDouble();
	System.out.print("");
	
	int perDayinInr=(int) ((moneyUSA*moneyExchange)/days1);
	
	//End of the Logic of the Method part2, Now we have to print the message to the Screen
	
	System.out.println("If you are travelling for "+days1+" days that is same as "+(days1*24)+" hours or "+(days1*24*60)+ " minutes");
	System.out.println("If you are going to spend $"+moneyUSA +" USD that means per day you can spend up to $"+(moneyUSA/days1) +" USD");
	System.out.println("Your total budget in INR is "+(moneyUSA*moneyExchange)+ " INR, " +"Which per day is:"+"\'₹"+perDayinInr+"\' "+inrSymbol);
	System.out.println("**************");
	System.out.println("");
	
	
	}


	
	
	//End of the Method 2
	
	
	
	
}
