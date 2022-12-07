import java.lang.*;
import java.util.Scanner;
class Calender{

public static void main(String args[]){

Scanner s = new Scanner(System.in);
System.out.println("Enter the numbeer of days");
	int n = s.nextInt();

	int y, m, d;
	int temp = 0;

	
	y = n/365;		// Calculation of years
	
	temp = n%365;	// Calculation of months
	m = temp/30;
	
	d = temp % 30;	// Calculation of days
	
	System.out.println("Years = "+y);
	System.out.println("Month = "+m);
	System.out.println("Days = "+d);
	
}
}	





	