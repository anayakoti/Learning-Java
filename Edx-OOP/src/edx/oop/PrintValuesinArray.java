package edx.oop;

import java.util.Scanner;
import java.util.Arrays;

public class PrintValuesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console=new Scanner(System.in);
		System.out.println("Enter number of elements you want to insert in an Array:");
		int userInput=console.nextInt();
		
		String phoneNumbers[]=new String[userInput];
		//System.out.println(phoneNumbers.length);
		for (int i=0; i!=userInput;i++) {
			
			Scanner inputPhoneNumbers=new Scanner(System.in);
			System.out.println("Enter the PhoneNumber:");
			String  telephoneNumbers=inputPhoneNumbers.nextLine();
			phoneNumbers[i]=telephoneNumbers;
			
		
		}
		System.out.println("Elements in a an Array are:");
		System.out.println("-------------");
		System.out.println(Arrays.toString(phoneNumbers));
		Arrays.fill(phoneNumbers, "911");
	System.out.println("After using the new array.fill():");
	System.out.println(Arrays.toString(phoneNumbers));
		
	}

}
