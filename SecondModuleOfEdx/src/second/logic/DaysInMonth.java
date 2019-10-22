package second.logic;

import java.util.Scanner;

//Write a method named daysInMonth that accepts a month (an integer between 1 and 12) 
//as a parameter and returns the number of days in that month in this year. 
//For example, the call daysInMonth(9) would return 30 because September has 30 days. 
//Assume that the code is not being run during a leap year (that February always has 28 days).

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int numberOfdaysInJan=31;
      int numberOfdaysInFeb=28;
      int numberOfdaysInMarch=31;
      int numberOFdaysInApril=30;
      int numberOFdaysInMay=31;
      int numberOFdaysInJune=30;
      int numberOFdaysInJuly=31;
      int numberOFdaysInAugust=31;
      int numberOFdaysInSpetember=30;
      int numberOFdaysInOctober=31;
      int numberOFdaysInNovember=30;
      int numberOFdaysInDecember=31;
      
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the Month's number:");
      int numberForMonth=input.nextInt();
      method1(numberForMonth);
	

	}
	
	public static void method1(int numberForMonth) {
	if((numberForMonth==1)||(numberForMonth==3)||(numberForMonth==5) ||(numberForMonth==7) ||(numberForMonth==8)||(numberForMonth==10)||(numberForMonth==12))
	{
		System.out.println("31");
				
			}else if((numberForMonth==4)||(numberForMonth==6)||(numberForMonth==9||(numberForMonth==11))) {
				System.out.println("30");
			}else if((numberForMonth==2)) {
				System.out.println("28");
			}
	}
	
}





