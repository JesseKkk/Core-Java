package interfaces;

import java.util.*;

public class EmployeeSortTest
{
	public static void main(String[] args)
	{	
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 30000);
		staff[1] = new Employee("Carl Cracker", 50000);
		staff[2] = new Employee("Tommy Tester", 40000);
		
		Arrays.sort(staff);
		
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary="+ e.getSalary());
	}
}