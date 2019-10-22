package odd.even;

import java.util.Scanner;

public class GameWithFingersAgainstComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Lets play a Game called \"Odds\" or \"Evens");
       
       Scanner console=new Scanner(System.in);
       System.out.println("Please turn the Capslock ON");
       System.out.println("----------------");
       System.out.println("Enter your name?");
       String userName=console.nextLine();
       System.out.print("Hi "+userName);
       System.out.println(" Which do you Choose (O)dds or (E)vens?");
       String gameInput=console.nextLine();
       if(gameInput.equals("E")||(gameInput.equals("O")))
       {
       if(gameInput.equals("E"))
       {
    	   System.out.println(userName+" has picked evens!"+" The Computer will be Odds.");
       }else {
    	   System.out.println(userName+" has picked odds! The computer will be Evens");
    	   
       }
       }else {
    	   System.out.println("You have choosen Neither Even nor Odd. Sorry! You cannot Play the game");
       }
	}

}
