import java.util.*;
class Array4
{
	public static void reverseString(String s)
	{
		char temp;
		char arr[]=s.toCharArray();
		int first=0;
		int last=arr.length-1;		
			
		
	for(int i=0;i<arr.length;i++)
	{
		if(first<=last)
		{

			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			first++;
			last--;
		}	
		System.out.print(arr[i]);
	}
		
		
	}
				
	

	

	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:: ");
		String s=sc.nextLine();
		reverseString(s);
	}

}