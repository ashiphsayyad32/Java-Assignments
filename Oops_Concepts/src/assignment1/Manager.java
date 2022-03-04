package assignment1;

public class Manager extends Employee
{
	
	private double allowance;
	
	
	public Manager() {}

	public Manager(int empid, String name, double salary, double allowance) {
		super(empid, name, salary);
		this.allowance = allowance;
	}

	
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary()+allowance;
	}
	
	

	
}
