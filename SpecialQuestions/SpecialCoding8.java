/* Given a string and the ability to delete at most one character, return whether or not it can
form a palindrome. */

import java.util.*;
class SpecialCoding8
{
	static boolean isPalindrome(String s,int start,int end)
	{
		if(s.length()==1)
			return true;

		

		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;

		}

		return isPalindrome(s,start+1,end-1);

	}

static String removeChar(String s,int i)
{

	return s.substring(0,i)+s.substring(i+1,s.length());

}


public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1[]=new String[s.length()];

for (int i=0;i<s.length();i++)
{
	s1[i]=removeChar(s,i);
	

}

for(int i=0;i<s1.length;i++)
{
	if(isPalindrome(s1[i],0,s1[i].length()-1))
		{	System.out.println("Palindrome");
			break;
		}
		



}







}

}