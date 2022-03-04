package assignment3;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = null;
		
		
		int MenuChoice=0;
		
		while(MenuChoice!=3) {
			
			
			System.out.println("*********Menu***********");
			System.out.println("1.Enter Data\n"
					+ "2.Display Data\n"
					+ "3.Exit");
			MenuChoice = sc.nextInt();
			
			switch(MenuChoice) {
			
			case 1:
				System.out.println("Enter empid, name, salary");
				int empid = sc.nextInt();
				String name = sc.next();
				double salary = sc.nextDouble();
				
				employee = new Employee(empid, name, salary);
				break;
			
			case 2:
				System.out.println(employee.toString());
				break;
				
			case 3:
				System.out.println("See you Later!!!");
				break;
			default:
				System.out.println("Invalid choice!!!");
			
			}
			
			
			
		}

	}

}
