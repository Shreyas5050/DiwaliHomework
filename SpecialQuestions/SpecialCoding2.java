import java.util.*;
class SpecialCoding2
{
	public static boolean isCapitalized(String s)
	{
		if(s==null)
			return false;
		boolean flag=true;

		for(int i=1;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(0)))
			{
				if(Character.isUpperCase(s.charAt(i)))
					flag=false;
			}


		}

		return flag;

}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(isCapitalized(s)); 
	}
}