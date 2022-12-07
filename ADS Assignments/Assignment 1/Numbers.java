

/*
Q5.
Given is the code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4

*/
import java.util.*;
class Numbers
{
	static void printNumber(int n)
	{
		if(n<=0)
		{
			return;
		}
		else
		{
			printNumber(n-1);
			System.out.print(" "+n);
		}
	}	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Integer n : ");
		int n=s.nextInt();
		System.out.print("Numbers from 1 to n :");
		printNumber(n);
	}
}
/*
Integer n : 5
Numbers from 1 to n : 1 2 3 4 5
*/