/*
Q3.
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array. Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/






import java.util.*;
class FindIntegerInArray
{
	
	
	
	static int recSearch(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          
          return recSearch(arr, l+1, r, x);

     }
      
     
     public static void main(String[] args)
     {
     	System.out.print("Enter Length of Array :: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Array elements:: ");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter number to find :: ");
        int x = sc.nextInt();
         
        
        int index = recSearch(arr, 0, n-1, x);
        if (index != -1)
           System.out.println("Element " + x + " is present at index " +
                                                    index);
        else
            System.out.println("Element " + x + " is not present");
      }
 }
	
	
