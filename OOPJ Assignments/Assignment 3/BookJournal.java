import java.util.Scanner;
class BookJournal
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
System.out.println("Please enter total pages of book1:");
int n=input.nextInt();
System.out.println("enter price:");
double p=input.nextDouble();
System.out.println("enter publisher name:");
String s=input.next();
Book B1=new Book(n,p,s);
System.out.println("Book1 is created");


System.out.println("Next enter details of book2");
System.out.println("Please enter total pages of book2:");
int n1=input.nextInt();
System.out.println("enter price:");
double p1=input.nextDouble();
System.out.println("enter publisher name:");
String s1=input.next();
Book B2=new Book(n1,p1,s1);
System.out.println("Book2 is created");

System.out.println("Next enter details of book3");
System.out.println("Please enter total pages of book3:");
int n2=input.nextInt();
System.out.println("enter price:");
double p2=input.nextDouble();
System.out.println("enter publisher name:");
String s2=input.next();
Book B3=new Book(n2,p2,s2);
System.out.println("Book3 is created");

System.out.println("Next enter details of Journal1");
System.out.println("Please enter total pages of Journal1:");
int nj1=input.nextInt();
System.out.println("enter price:");
double pj1=input.nextDouble();
System.out.println("enter publisher name:");
String sj1=input.next();
Journal J1=new Journal(nj1,pj1,sj1);
System.out.println("Journal1 is created");

System.out.println("Next enter details of Journal2");
System.out.println("Please enter total pages of Journal2:");
int nj12=input.nextInt();
System.out.println("enter price:");
double pj12=input.nextDouble();
System.out.println("enter publisher name:");
String sj12=input.next();
Journal J2=new Journal(nj12,pj12,sj12);
System.out.println("Journal2 is created");

Library Lib=new Library();
Lib.add1(B1);
Lib.add2(B2);
Lib.add3(B3);
Lib.add1(J1);
Lib.add2(J2);

System.out.println("Books added to Library.");
Lib.printBookList();
System.out.println("--------------------------------------------------------------------");
System.out.println("Journals added to Library");
Lib.printJournalList();
}
}

abstract class Publication
{
	  int noOfpages;
	  double price;
	  String publname;

}
class Book extends Publication
{
	int noOfpages;
    double price;
    String publname;
	Book()
	{	
	}
    Book(int noOfpages,double price,String publname)
    {
      this.noOfpages=noOfpages;
      this.price=price;
      this.publname=publname;
    }
     
    void printBook()
    {
	System.out.println("Total pages:"+noOfpages+" Rs."+price+" Publisher: "+publname);
	
    }
}
class Journal extends Publication
{
	int noOfpages;
    double price;
    String publname;
	Journal()
	{		
	}
	Journal(int noOfpages,double price,String publname)
    {
      this.noOfpages=noOfpages;
      this.price=price;
      this.publname=publname;
    }
	void printJournal()
    {
	System.out.println("Total pages:"+noOfpages+" Rs."+price+" Publisher: "+publname);
	
    }
	
}

class Library   // contains a list of publications
{
	
	Journal[] Jarr=new Journal[2];
	Book[] Barr=new Book[3];
	//Book portion methods
	void add1(Book e)
	{	
	    Barr[0]=e;	
	}
	void add2(Book e)
	{
		Barr[1]=e;
	}
	void add3(Book e)
	{
		Barr[2]=e;
	}
	void printBookList()
	{
		System.out.println("The book details are: ");
		for(int i=0;i<3;i++)
		{
			System.out.print("Book"+(i+1)+" Details: ");
			Barr[i].printBook();
		}
	
	}
	//Jornal portion methods
	void add1(Journal e)
	{	
	    Jarr[0]=e;	
	}
	void add2(Journal e)
	{
		Jarr[1]=e;
	}
	void printJournalList()
	{
		System.out.println("The Journal details are: ");
		for(int i=0;i<2;i++)
		{
			System.out.print("Journal"+(i+1)+" Details: ");
			Jarr[i].printJournal();
		}
	
	}
}


/*

Please enter total pages of book1:
75
enter price:
456
enter publisher name:
gajala
Book1 is created
Next enter details of book2
Please enter total pages of book2:
89
enter price:
123
enter publisher name:
chetana
Book2 is created
Next enter details of book3
Please enter total pages of book3:
56
enter price:
258
enter publisher name:
rahul
Book3 is created
Next enter details of Journal1
Please enter total pages of Journal1:
56
enter price:
85
enter publisher name:
ajit
Journal1 is created
Next enter details of Journal2
Please enter total pages of Journal2:
5
enter price:
23
enter publisher name:
vivek
Journal2 is created
Books added to Library.
The book details are:
Book1 Details: Total pages:75 Rs.456.0 Publisher: gajala
Book2 Details: Total pages:89 Rs.123.0 Publisher: chetana
Book3 Details: Total pages:56 Rs.258.0 Publisher: rahul
--------------------------------------------------------------------
Journals added to Library
The Journal details are:
Journal1 Details: Total pages:56 Rs.85.0 Publisher: ajit
Journal2 Details: Total pages:5 Rs.23.0 Publisher: vivek

*/