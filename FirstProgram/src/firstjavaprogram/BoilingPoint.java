
package firstjavaprogram;
import java.util.Scanner;

public class BoilingPoint {
    public static void main(String args[]){
        System.out.println("Enter the CelCius Value");
        Scanner UserInput=new Scanner(System.in);
        int celcius=UserInput.nextInt();
        //Testing if the Temperature is above boiling Point or not
        if(celcius>=100){
            System.out.println("The temperature input has reaced the Boiling Point");
            
        }
        else{
            System.out.println("The temperature input has not reached the Boiling Point");
        }
        
    }
}
