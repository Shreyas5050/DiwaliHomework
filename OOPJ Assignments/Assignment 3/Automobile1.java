/*


Question 4

Create a base class Automobile. An Automobile contains data members make, type., maxSpeed, 
price, mileage, registrationNumber etc. with their reader/writer methods. Now create two sub-classes 
Track and Car. Track has data members capacity, hoodType, noOfWheels etc. Car has data 
members noOfDoors, seatingCapacity and their reader/writer methods. Create a main() function to 
demonstrate this.
*/


class Automobile
{
	String make;
	String type;
	int maxSpeed;
	int price;
	String mileage;
	String registrationNumber;
	
	void reader(String make,String type,int maxSpeed,int price,String mileage,String registrationNumber)
	{
		this.make=make;
		this.type=type;
		this.maxSpeed=maxSpeed;
		this.price=price;
		this.mileage=mileage;
		this.registrationNumber=registrationNumber;
		
	}
	
	void writer()
	{
		System.out.println();
		System.out.print(make+" "+type+" "+maxSpeed+" "+price+" "+mileage+" "+registrationNumber+" ");
	
	}	
	
}

class Track extends Automobile
{
	String capacity;
	String hoodType;
	int noOfWheels;
	
	
	void reader(String make,String type,int maxSpeed,int price,String mileage,String registrationNumber,String capacity,String hoodType,int noOfWheels)
	{
		super.reader(make,type,maxSpeed,price,mileage,registrationNumber);
		super.writer();
		this.capacity=capacity;
		this.hoodType=hoodType;
		this.noOfWheels=noOfWheels;
		writer();
	}
	
	void writer()
	{
		System.out.print(capacity+" "+hoodType+" "+noOfWheels);
	}	
	
	
}

class Car extends Automobile
{
	int noOfDoors;
	int seatingCapacity;
	
	
	void reader(String make,String type,int maxSpeed,int price,String mileage,String registrationNumber,int noOfDoors,int seatingCapacity)
	{
		super.reader(make,type,maxSpeed,price,mileage,registrationNumber);
		super.writer();
		this.noOfDoors=noOfDoors;
		this.seatingCapacity=seatingCapacity;
		writer();
	}
	
	void writer()
	{
		System.out.print(noOfDoors+" "+seatingCapacity);
	}	
	
}

class Automobile1
{
	public static void main(String [] args)
	{
		Automobile a = new Automobile();
		a.reader("Audi","Sedan",224,10000000,"6km/litre","UP 70 DB 1456");
		a.writer();
		
		Track t = new Track();
		t.reader("Lambhorghini","Sedan",250,15000000,"4km/litre","UP 70 DB 2568","23L","Hatch",5);
		
		
		Car c = new Car();
		c.reader("Hyundai","Sedan",265,20000000,"15km/litre","UP 70 DB 8598",2,2);
		
	}
}