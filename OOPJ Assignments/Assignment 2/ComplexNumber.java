import java.util.*;
class ComplexNumber
{
int real;
int imag;

ComplexNumber()
{
	real=0;
	imag=0;
}
ComplexNumber(int real)
{
	this.real=real;
	this.imag=0;
}
ComplexNumber(int real,int imag)
{
		this.real=real;
		this.imag=imag;
}




static void add(String num1,String num2)
	{
		int a,b,c,d;
		if(num1.indexOf('+')==1 & num2.indexOf('+')==1)
		{
		 a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
		 b= Integer.parseInt(num1.substring(num1.indexOf('+')+1,(num1.length()-1)));
		 c=Integer.parseInt(num2.substring(0,num2.indexOf('+')));
		 d= Integer.parseInt(num2.substring(num2.indexOf('+')+1,(num2.length()-1)));
		
		int real=a+c;
		int imag=b+d;
		ComplexNumber n=new ComplexNumber(real,imag);
		System.out.println("Sum="+n.real+"+("+n.imag +")i");
		}

		else if (num1.indexOf('-')==1 & num2.indexOf('-')==1) 
		{
		 	a=Integer.parseInt(num1.substring(0,num1.indexOf('-')));
		 	b= Integer.parseInt(num1.substring(num1.indexOf('-'),(num1.length()-1)));
		 	c=Integer.parseInt(num2.substring(0,num2.indexOf('-')));
		 	d= Integer.parseInt(num2.substring(num2.indexOf('-'),(num2.length()-1)));
			int real=a+c;
			int imag=(-(b+d));
			ComplexNumber n=new ComplexNumber(real,imag);
			System.out.println("Sum="+n.real+"+("+n.imag +"i)");
		}
		else if (num1.indexOf('-')==1 & num2.indexOf('+')==1) 
		{
		 	a=Integer.parseInt(num1.substring(0,num1.indexOf('-')));
		 	b= Integer.parseInt(num1.substring(num1.indexOf('-'),(num1.length()-1)));
		 	c=Integer.parseInt(num2.substring(0,num2.indexOf('+')));
		 	d= Integer.parseInt(num2.substring(num2.indexOf('+')+1,(num2.length()-1)));
			int real=a+c;
			int imag=(b)+d;
			ComplexNumber n=new ComplexNumber(real,imag);
			System.out.println("Sum="+n.real+"+("+n.imag +")i");
		}

		else if (num1.indexOf('+')==1 & num2.indexOf('-')==1) 
		{
		 	a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
		 	b= Integer.parseInt(num1.substring(num1.indexOf('+')+1,(num1.length()-1)));
		 	c=Integer.parseInt(num2.substring(0,num2.indexOf('-')));
		 	d= Integer.parseInt(num2.substring(num2.indexOf('-'),(num2.length()-1)));
			int real=a+c;
			int imag=b+d;
			ComplexNumber n=new ComplexNumber(real,imag);
			System.out.println("Sum="+n.real+"+("+n.imag +")i");
		}


}




	static void mul(String num1,String num2)
	{
		int a,b,c,d;
		if(num1.indexOf('+')==1 & num2.indexOf('+')==1)
		{
		 a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
		 b= Integer.parseInt(num1.substring(num1.indexOf('+')+1,(num1.length()-1)));
		 c=Integer.parseInt(num2.substring(0,num2.indexOf('+')));
		 d= Integer.parseInt(num2.substring(num2.indexOf('+')+1,(num2.length()-1)));
		int real=a*c-b*d;
		int imag=a*d+b*c;
			ComplexNumber n=new ComplexNumber(real,imag);
		System.out.println("Product ="+n.real+"+"+"("+n.imag +")i");

		}
		else if (num1.indexOf('-')==1 & num2.indexOf('-')==1) 
		{ a=Integer.parseInt(num1.substring(0,num1.indexOf('-')));
		 b= Integer.parseInt(num1.substring(num1.indexOf('-'),(num1.length()-1)));
		 c=Integer.parseInt(num2.substring(0,num2.indexOf('-')));
		 d= Integer.parseInt(num2.substring(num2.indexOf('-'),(num2.length()-1)));
		
		 int real=a*c-b*d;
		int imag=a*d+b*c;
		ComplexNumber n=new ComplexNumber(real,imag);
		System.out.println("Product ="+n.real+"+"+"("+n.imag +")i");

		}

		else if (num1.indexOf('-')==1 & num2.indexOf('+')==1) 
		{ a=Integer.parseInt(num1.substring(0,num1.indexOf('-')));
		 b= Integer.parseInt(num1.substring(num1.indexOf('-'),(num1.length()-1)));
		 c=Integer.parseInt(num2.substring(0,num2.indexOf('+')));
		 d= Integer.parseInt(num2.substring(num2.indexOf('+')+1,(num2.length()-1)));
		
		 int real=a*c+b*d;
		int imag=(a*d)+(b*c);
		ComplexNumber n=new ComplexNumber(real,imag);
		
		System.out.println("Product ="+n.real+"+"+"("+n.imag +")i");

		}


		else if (num1.indexOf('+')==1 & num2.indexOf('-')==1) 
		{ a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
		 b= Integer.parseInt(num1.substring(num1.indexOf('+')+1,(num1.length()-1)));
		 c=Integer.parseInt(num2.substring(0,num2.indexOf('-')));
		 d= Integer.parseInt(num2.substring(num2.indexOf('-'),(num2.length()-1)));
		
		 int real=a*c+b*d;
		int imag=b*c+a*d;
		ComplexNumber n=new ComplexNumber(real,imag);
		
		System.out.println("Product ="+n.real+"+"+"("+n.imag +")i");

		}

				

	}

	
public static void main(String args[])
{
	ComplexNumber sum,mul;
	System.out.println("Enter the first complex Number(a+bi):");
	Scanner sc=new Scanner(System.in);
	String num1=sc.nextLine();
	
	System.out.println("Enter the Second complex Number(c+di):");
	String num2=sc.nextLine();
	add(num1,num2);
	
	mul(num1,num2);
	



}


}
