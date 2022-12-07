//20. Write a program to remove a given character from String?
//    You need to write a Java method that will accept a String and a character to be removed and return a String, 
//	  which doesn't has that character e.g remove(String word, char ch).

import java.util.Scanner;

public class StrCQ20 
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
	
	System.out.println("Enter the charactr you want to remove");
    char c1 = sc.next().charAt(0); 
          
    char chArray1[] = s1.toCharArray();
		
		for(int i=0;i<chArray1.length;i++)
		{
			if(chArray1[i] != c1)
			{
			System.out.print(chArray1[i]);
			}
		}
}
}