/*
question 7

Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/

import java.util.Scanner;
import java.lang.Math;

class Demo
{
	public static int a;
	public static int b;
	
	
	
	Demo()
	{
		
	}
	Demo(int a, int b)
	{
		
		this.a=a;
		this.b=b;
	}

	public static int add(int a,int b)
	{
		
		int sum = a + b;
		return sum;
	
		
	}
	public static int subtract(int a,int b)
	{
		
		int sub = a - b;
		return sub;
	
		
	}
	public static int multiply(int a ,int b)
	{
		
		int mul = a * b;
		return mul;
		
		
	}
	public static int power(int a,int b)
	{
		
		int pow =(int) (Math.pow(a,b));
		return pow;
	
		
	}





}

class MathOperation
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two nos to perform MathOperations: ");
		System.out.println("Enter 1st no.: ");
		int a1 = sc.nextInt();
		System.out.println("Enter 2nd no.");
		int b1= sc.nextInt();
		
		
		System.out.println("Sum of two no : "+Demo.add(a1,b1));
		System.out.println("Substraction of two no.: "+Demo.subtract(a1,b1));
		System.out.println("Multiplication of two no: "+Demo.multiply(a1,b1));
		System.out.println("Power: "+Demo.power(a1,b1));
		
	
	
	}

}

