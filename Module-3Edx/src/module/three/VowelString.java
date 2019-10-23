package module.three;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets ask the user to enter a string
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a String:");
		String userInput=console.nextLine();
		String result=isVowel(userInput);
		System.out.println(result);
		
     
	}

	
	
	
	//Lets us start writing a method if a string is vowel or not
	
	
	
	public static String isVowel(String name)
	{
	  if(name.contains("a")||name.contains("e")|| name.contains("i")||name.contains("o")||name.contains("u"))
			  {
			  
		System.out.println("It is a Vowel because the name you entered has either a, e, i, o, or u");  
	  }else {
		  System.out.println("The name you have entered is not a Vowel");
	  }
		return name;
		
		
	}
}
