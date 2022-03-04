package assignment1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager manager = new Manager(1, "Ashiph", 20000, 2000);
		
		System.out.println("Manager "+manager.getName()+" Salary is "+manager.calculateSalary());

		
		SalesManager sales = new SalesManager(2, "Mayur", 23000, 1000);
		System.out.println("SalesManger "+sales.getName()+" SalesManager is "+sales.calculateSalary());
	}

}
