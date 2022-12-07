import java.util.Scanner;

public class Temperature  
 {  
   public static void main (String args[])  
    { float f, c; 
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Temperature in Fahreheit ");
		    f=s.nextInt();
      
          c  = 5*(f-32)/9;  
          System.out.println("Temperature in celsius is: "+c);  
    }}  