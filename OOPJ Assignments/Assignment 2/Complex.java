/*
Question 3

Write a class to represent complex numbers with necessary constructors. 
Write member functions to add, multiply 
two complex numbers. There should be three constructors: 
(i) to initialize real and imaginary parts to 0; 
(ii) to initialize imaginary part to 0 but to initialize the real part to user defined value; 
(iii) to initialize the real part and the imaginary part to user defined values. 
Also, write a main() function to 
(i) create two complex numbers 3+2i and 4-2i; 
(ii) to print the sum and product of those numbers
*/
class Complex
{
    float real;
    float imaginary;

    public Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(float real) {
        this.real = real;
        this.imaginary = 0;
    }
    
    public Complex()
    {
        real = imaginary = 0;
    }

    public Complex add(Complex c) {
        Complex t=new Complex();
        t.real =real + c.real;
        t.imaginary =imaginary+ c.imaginary;
        return t;
    }
	public Complex multiply(Complex c) {
        Complex t=new Complex();
        t.real =real * c.real;
        t.imaginary =imaginary* c.imaginary;
        return t;
    }
    
    public void print() {
        
        System.out.println(real+ " + i"+imaginary);
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        
        Complex c3=c1.add(c2);
        
        System.out.print("Sum of The Complex Numbers : ");
        c3.print();

        c3 = c1.multiply(c2);
        System.out.print("Product of The Complex Numbers : ");
        c3.print();
    }
}
/*
Sum of The Complex Numbers : 7.0 + i0.0
Product of The Complex Numbers : 12.0 + i-4.0
*/