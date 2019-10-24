package edx.oop;

import java.util.Scanner;

public class SSCmarksAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Enter how many subjects you want
		Scanner console=new Scanner(System.in);
		System.out.println("Enter your Fullname Please:");
		String fullName=console.nextLine();
		System.out.println("Enter How many Subjects you have for SSC?");
		int numberOfSubjects=console.nextInt();
		//Create an array to store the number of subjects
		
		
		String[] subjects=new String[numberOfSubjects];
		
		
		//Lets collect the names of the subjects.
		for(int i=0; i!=numberOfSubjects;) {
			System.out.println("Enter the Subject name ");
			if(i==7) {
				System.out.println("You have entered all 7 subjects");
			}
		Scanner input=new Scanner(System.in);
		subjects[i]=input.nextLine();
		 i++;
		 
		
		}
		System.out.println("--------------------------");
		//lets collect the marks
		
	  int marks[]=new int[numberOfSubjects];
	  
		for(int i=0; i!=numberOfSubjects;)
		{
			
	    System.out.println("Enter the marks for "+subjects[i]+ ":");
	   
	    Scanner marksinput=new Scanner(System.in);
		marks[i]=marksinput.nextInt();
			i++;
		
		}
		
		System.out.println("---------------------------------------------");
		
		
		//Now we have to do the sum marks 
		
		int totalMarks=0;
		for(int i=0; i!=numberOfSubjects; i++)
		{
			totalMarks+=marks[i];
		}
	
		
		//Print the report Card
		
		System.out.println("SCORE CARD OF: "+fullName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		System.out.println("SUBJECTS  | " +"  MARKS ");
		System.out.println("------------------------------");
		
	   for(int i=0; i<numberOfSubjects;i++)
	   {
		System.out.println(subjects[i]+"---->"+marks[i]); 
		System.out.println("");
		
	   }
	   System.out.println("``````````````````````````");
	   System.out.println("TOTAL:-------->"+totalMarks);
	   System.out.println("'''''''''''''''''''''''''''");
	}
	
	
	
	
	
	}


