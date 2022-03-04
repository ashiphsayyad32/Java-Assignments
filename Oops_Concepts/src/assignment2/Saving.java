package assignment2;

public class Saving extends BankAccount
{
	
	private static double rate_of_interest;
	private double balance;
	static {
		rate_of_interest = 1.5;
	}
	
	public Saving() {}
	
	public Saving(int account_no, String name, double balance) {
		super(account_no, name);
		this.balance = balance;
	}

	public double actualSavingBalance() {
		return balance*rate_of_interest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Balance: "+balance+" Actual Saving Balance: "+actualSavingBalance();
	}

	
	
	
}
