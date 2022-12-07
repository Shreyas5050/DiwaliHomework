
/*
Q10.
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz



*/

import java.util.*;
class RemoveConsecutiveDuplicates
{
		
public static String removeDups(String s)
{
    if ( s.length() <= 1 ) return s;
    if( s.substring(1,2).equals(s.substring(0,1)) ) 
		return removeDups(s.substring(1));
    else 
		return s.substring(0,1) + removeDups(s.substring(1));
}



		 
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(removeDups(str));
	}
}
/*
gaajala
gajala
*/