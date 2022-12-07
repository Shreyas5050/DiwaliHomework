/*
Question2

Write a class for Account containing data members accountNumber, holderName, balance and add 
constructors and necessary accessor/modifier functions for these data members. Now create two class 
SavingsAccount and CurrentAccount extending from this class. SavingsAccount will have a member 
variable interestRate and member function calculateYearlyInterest. Write another class Manager that 
contains a list Account. Also write a main() function to create an instance of Manager class. Add two 
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print 
the details of all accounts. 
*/





import java.util.Scanner;
class Account
{
	int accountNumber;
	String holderName;
	int balance;

	Account()
	{
	}

	Account(int accountNumber,String holderName,int balance)
	{
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
		printDetails();
	}

	void printDetails()
	{
		System.out.print("Account Number: "+accountNumber+" "+"Account Holder Name: " +holderName+ " "+"Balance: "+balance);
	}
}

class SavingsAccount extends Account
{
	double interestRate;

	SavingsAccount(){}

	SavingsAccount(int accountNumber,String holderName,int balance , double interestRate)
	{
		super(accountNumber,holderName,balance);
		this.balance=balance;
		this.interestRate=interestRate;
		calculateYearlyInterest();
	}

	void calculateYearlyInterest()
	{
		interestRate=interestRate*balance;
		System.out.printf("Balance After Yearly Interest: %.2f\n", interestRate);

	}
}

class CurrentAccount extends Account
{
	double interestRate;

	CurrentAccount(){}

	CurrentAccount(int accountNumber,String holderName,int balance , double interestRate)
	{
	super(accountNumber,holderName,balance);
	this.balance=balance;
	this.interestRate=interestRate;
	calculateYearlyInterest();

	}

	void calculateYearlyInterest()
	{
	interestRate=interestRate*balance;
	System.out.printf("Balance After Yearly Interest: %.2f\n", interestRate);
	}
}

class Manager
{
	
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Savings Account Holders");
		System.out.println("2 : Current Account Holders");
		System.out.println("Enter the input");
		int i = sc.nextInt();
		
		switch(i)
		{
		case 1 : 
			
		System.out.println("Enter the account number of 1st member of saving account");
		int a1=sc.nextInt();
		System.out.println("Enter the account holder name");
		String a2 = sc.next();
		System.out.println("Enter the balance of account");
		int a3 = sc.nextInt();
		
		System.out.println("Enter the account number of 2nd member of saving account");
		int a4=sc.nextInt();
		System.out.println("Enter the account holder name");
		String a5 = sc.next();
		System.out.println("Enter the balance of account");
		int a6 = sc.nextInt();
			
		SavingsAccount s1 = new SavingsAccount(a1,a2,a3,0.65);
		SavingsAccount s2 = new SavingsAccount(a4,a5,a6,0.65);
		break;
		
		case 2 :
		System.out.println("Enter the account number of 1st member of current account");
		int a7=sc.nextInt();
		System.out.println("Enter the account holder name");
		String a8 = sc.next();
		System.out.println("Enter the balance of account");
		int a9 = sc.nextInt();
		
		System.out.println("Enter the account number of 2nd member of current account");
		int a10=sc.nextInt();
		System.out.println("Enter the account holder name");
		String a11 = sc.next();
		System.out.println("Enter the balance of account");
		int a12 = sc.nextInt();
		
		System.out.println("Enter the account number of 3rd member of current account");
		int a13=sc.nextInt();
		System.out.println("Enter the account holder name");
		String a14 = sc.next();
		System.out.println("Enter the balance of account");
		int a15 = sc.nextInt();
		CurrentAccount c1 = new CurrentAccount(a7,a8,a9,0.56);
		CurrentAccount c2 = new CurrentAccount(a10,a11,a12,0.56);
		CurrentAccount c3 = new CurrentAccount(a13,a14,a15,0.56);
		break;
		
		default:
		System.out.println("Invalid Input");
		}
	}
}

class Main
{
	public static void main(String[] args)
	{
		Manager m = new Manager();
		m.setDetails();
	}
}