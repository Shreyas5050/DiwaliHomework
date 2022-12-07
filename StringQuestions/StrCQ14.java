//14. How to reverse words in a sentence without using a library method?

import java.util.Scanner;

public class StrCQ14
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
       
	String[] strArray = s1.split("\\s");			
	
	for(int i=strArray.length-1 ; i>=0 ; i--)
	{
	
			System.out.print(strArray[i]+" ");
	
	}
}
}	