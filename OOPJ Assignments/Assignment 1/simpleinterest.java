import java.util.Scanner;
class Simpleinterest 
{
public static void main(String args[])
{
		
		float si,x,y,z;
		
		System.out.println("enter the principle");
		Scanner p =new Scanner(System.in);
		x=p.nextInt();
		
		
		System.out.println("enter the rate");
		Scanner r =new Scanner(System.in);
		y=r.nextInt();
		
		System.out.println("enter the time");
		Scanner t =new Scanner(System.in);
		z=t.nextInt();
		
		si=(x*y*z)/100;
		System.out.println("simple interest is "+ si);
		
		
		

}



}