package lets.see;

import java.util.Scanner;

public class testMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputBirthday();

	       }
	
	public static void inputBirthday(){
	   
	    Scanner console=new Scanner(System.in);
	    System.out.println("On what day of the month were you born?");
	    String day1=console.nextLine();
	        System.out.println("What is the name of the month in which you were Born?");
	    String month1=console.nextLine();
	    System.out.println("During what year were you born?");
	    String year1=console.nextLine();
	    System.out.println("You were born on " +month1+" "+day1+", "+year1+"."+" Your'e mighty old!");
	    
	             }
	
}



