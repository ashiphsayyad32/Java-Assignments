package Assignments;

import temp.Employee;

public class EmployeeArray {

	public static void main(String[] args) {
		
		Employee []emp = new Employee[4];
		
		emp[0]= new Employee(1, "Ashiph", 10000);
		emp[1]= new Employee(2, "Mayur", 20000);
		emp[2]= new Employee(3, "Wasim", 30000);
		emp[3]= new Employee(4, "Shivam", 40000);
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("No of Objects Created are : "+Employee.count);
		

	}

}
