/*
Question 6


A bookshop maintains the inventory of books that are being sold at the shop. The list includes details such 
as author, title, publisher, cost and stock position. Whenever a customer wants a book, the sales person 
inputs the title and author and the system searches the list and displays whether it is available or not. If it is 
not, an appropriate message is displayed. If it is, then the system displays the book details and details and 
requests for the number of copies required. If the required copies are available, the total cost of the 
requested copies is displayed, otherwise the message requires copies not in stock is displayed. Design a 
system using a class called Book with suitable member methods and constructors. 
*/
import java.util.Scanner;
class Main
{
	String author;
	String title;
	int cost;
	int stockPosition;
	String publisherName;
	
	
	
	Main()
	{
	}
		
void printDetails()
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title name of the book");
		title=sc.nextLine();
	
	switch(title)
	{
			case "Twilight" :
			System.out.println("Enter the author name");
			author=sc.nextLine();
					
				switch(author)
				{
					case "Stephenie Meyer" :
					stockPosition=2;
					publisherName="Meyer";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is" 	+publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						case 1: 
						cost = 400;
						System.out.println("Cost of book is Rs " +cost);
						break;
						
						default :
						System.out.println("Required copies are not in stack");
					}
						
					
					break;
					
						default:
						System.out.println("Wrong Input");
				}
			
			break;
		
			case "One indian girl" :
			System.out.println("Enter the author name");
			author=sc.nextLine();
				switch(author)
				{
					case "Chetan Bhagat" :
					
					stockPosition=5;
					publisherName="Chetan Bhagat";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is" +publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						case 1: 
						cost = 500;
						System.out.println("Cost of book is Rs " +cost);
						break;
						
						default :
						System.out.println("Requested copies are not allowed");
					}
					break;
					
					default: 
					System.out.println("Wrong Input");
				}
				break;
				
		case "Making india awesome" :
					System.out.println("Enter the author name");
					author=sc.nextLine();
					
				switch(author)
				{
					case "Chetan Bhagat" :
					
					stockPosition=8;
					publisherName="Chetan Bhagat";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is " +publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						
						case 1: 
						cost = 600;
						System.out.println("Cost of book is Rs " +cost);
						
						break;
						default :
						System.out.println("Requested copies are not allowed");
					}
					
					break;
					
					default: 
					System.out.println("Wrong Input");
				}
			break;
			
			default :
			System.out.println("Not Available");
	}
}
}
		

class Book6
{
	public static void main(String[] args)
	{
		
		Main m = new Main();
		m.printDetails();
	}
}