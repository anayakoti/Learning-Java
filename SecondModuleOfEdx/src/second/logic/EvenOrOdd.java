package second.logic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner console=new Scanner(System.in);
      System.out.println("Type a number");
      int numberTyped=console.nextInt();
      if((numberTyped%2)==0)
      {
    	  System.out.println("even");
      }else if((numberTyped%3)==0)
      {
    	  System.out.println("Odd");
      }
      
      else {
    	  System.out.println("It is not Either Even or ODD");
      }
	}

}
