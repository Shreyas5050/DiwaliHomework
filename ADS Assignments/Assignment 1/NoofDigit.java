
/*
Q6.
Given the code to find out and return the number of digits present in a number recursively. 
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/

import java.util.*;
class NoofDigit
{
	 static int digit=0;
	static int findDigitNumbers(int num)
	{
		

		if(num/10==0)
			return digit+1;
		else 
		{
			num=num/10;
			digit++;
			return findDigitNumbers(num-1);
		}
		
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. :: ");
		int num=sc.nextInt();
		System.out.println(findDigitNumbers(num));
	}
}
/*
Enter a no. :: 5647
4
*/