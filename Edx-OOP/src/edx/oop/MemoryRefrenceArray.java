package edx.oop;

import java.util.Arrays;

public class MemoryRefrenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//We are seeing how array is referencing its address
		
		String names[]=new String[3];
		names[0]="Anudeep";
		names[1]="Ankith";
		names[2]="Sai";
		
		System.out.println(Arrays.deepToString(names));
		method1(names);
		System.out.println(Arrays.deepToString(names));
	}
    //Created a method and passing Array as parameter and how it affects the main 
	private static void method1(String[] wholenewName) {
		// TODO Auto-generated method stub
		for(int i=0; i<wholenewName.length;i++)
		{
			wholenewName[i]=wholenewName[i] +" :FirstName";
		}
	}

}
