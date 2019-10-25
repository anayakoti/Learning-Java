
//In this Program we decalred 2D-array, declare the size and prompt the user to store values in the Nested Array
package edx.oop;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lets create a two dimensional Arrays
		
	String[][] phoneNumbers=new String[3][3];	
	
	
	for(int i=0;i<phoneNumbers.length;i++)
		
		
	{
		for(int j=0; j<phoneNumbers.length;){
			
		//Lets prompt the user to enter Numbers to Store in the 2-d Arrays
			Scanner console=new Scanner(System.in);
			System.out.println("Please Enter the Phone number");
			phoneNumbers[i][j]=console.nextLine();
			
			j++;
		}
	}
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~2D Arrays~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
	System.out.println(Arrays.deepToString(phoneNumbers));
	
	//System.out.println(phoneNumbers[0][2]);
	}

}
