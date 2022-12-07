 import java.util.Scanner;
 import java.lang.Math;
 public class AreaOfCircle
 {
 public static void main(String[] args)
 {
 double r,Area,Circumference;
 {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Radius ");
		    r=s.nextInt();
			
	    Circumference = 2 * Math.PI * r;
         Area = Math.PI * r * r;

        System.out.println("Circumference is = " + Circumference);
        System.out.println("Area is = " + Area);
    }
}
 
 
 }