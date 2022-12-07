//Gross Salary = Basic + HRA + DA + Allow – PF


import java.util.Scanner;
class Gs
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employees's Salary: ");
			double basic_salary= sc.nextInt();
			
			double gs,hra,da;
			
			if (basic_salary < 10000)
			{
			 hra = 0.1 * basic_salary;
			 da = 0.9 * basic_salary;
			 
			gs= basic_salary + da + hra;
				System.out.println("Gross Salary of Employee = "+gs);
			}	
				else if(basic_salary >=	10000)
				{
					hra = 2000;
					da = 0.98 * basic_salary;
			 
					gs= basic_salary + da + hra;
					System.out.println("Gross Salary of Employee = "+gs);
				
				
				}
			else
			{
			 System.out.println("Invalid");
			
			}
			
			
			
		
		
		
		}

}