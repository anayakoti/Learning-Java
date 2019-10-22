//In thsi program user will give the number and console will print the 10 Multiples of that number

package second.logic;

import java.util.Scanner;

public class LoopFor {
public static void main(String args[])


{
	
	
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the Table you want:");
		
		int tableNumber=console.nextInt();
		System.out.println("");
		
		for(int i=1; i<=10;i++) {
		System.out.println(+tableNumber+"*"+i+" = "+(tableNumber*i));

	}

	 
}


}
