import java.util.*;

class SpecialCoding3
{


public static void main(String[] args) {
	
	int count=0;
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();


	{
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='L'||s.charAt(i)=='U')
			count++;
		else if(s.charAt(i)=='D'||s.charAt(i)=='R')
				count--;
		}

		
	}

	if(count==0)
			System.out.println("true");
		else 
			System.out.println("false");

}

}