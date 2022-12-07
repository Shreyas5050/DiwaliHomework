
/*
Question 6
Write a class Box that with three member-variables height, width and breadth. Write suitable 
constructors to initialize them. Add functions like getVolume and getArea that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.



*/
import java.util.Scanner;
 class Box1 {  
	int height,width,breadth;

    Box1(){

    }

    Box1(int h, int w, int b){
            height = h;
            width = w;
            breadth = b;
    }

    int getVolume(){
            return height* width* breadth;
    }

    int getArea(){
            return 2 * (height*width + width*breadth + breadth*height);
    }
 }
 public class Box{
    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height h1 and h2= ");
		int h1=sc.nextInt();
		int h2=sc.nextInt();
		
		System.out.println("Enter width w1 and w2= ");
		int w1=sc.nextInt();
		int w2=sc.nextInt();
		
		System.out.println("Enter breadth b1 and b2= ");
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		
            Box1 d1 = new Box1(h1,w1,b1);
            System.out.println("Volume of first box is "+ d1.getVolume());
            System.out.println("Surface Area of first box is "+ d1.getArea());

            Box1 d2 = new Box1(h2,w2,b2);
            System.out.println("Volume of second box is " + d2.getVolume());
            System.out.println("Surface Area of second box is " + d2.getArea());
    }

}
/*
Enter Height h1 and h2=
5
4
Enter width w1 and w2=
8
9
Enter breadth b1 and b2=
7
2
Volume of first box is 280
Surface Area of first box is 262
Volume of second box is 72
Surface Area of second box is 124
*/