package assignment1;

public class SalesManager extends Employee
{
	private double commision;
	
	public SalesManager() {}

	public SalesManager(int empid, String name, double salary, double commision) {
		super(empid, name, salary);
		this.commision = commision;
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary()+commision;
	}
}
