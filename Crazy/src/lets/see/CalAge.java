package lets.see;

import java.util.Scanner;

public class CalAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number=new Scanner(System.in);
	    System.out.println("On what day of the month were you born?");
	    String day=number.nextLine();
	        System.out.println("What is the name of the month in which you were Born?");
	    String month=number.nextLine();
	    System.out.println("During what year were you born?");
	    String year=number.nextLine();
	    System.out.println("You were born on " +month +" "+day+","+" "+year+"."+" Your'e mighty old!");
	    

	}
	
	
	
	

}
