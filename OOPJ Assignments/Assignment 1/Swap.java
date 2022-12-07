import java.util.Scanner;

public class Swap{
	
	public static void main(String args[]){
		System.out.print("Enter the Number 1 : ");
		Scanner sc = new Scanner(System.in);	
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		Scanner bc = new Scanner(System.in);
		int num2 = bc.nextInt();
		
		
		System.out.println("Befor Swap");
		System.out.println("Number1 = "+num1);
		System.out.println("Number2 = "+num2);
		
		num1 = num1 -num2;
		num2 =num1 + num2;
		num1 = num2 - num1;
		
		System.out.println("After Swap");
		System.out.println("Number1 = "+num1);
		System.out.println("Number2 = "+num2);
	}
	
}