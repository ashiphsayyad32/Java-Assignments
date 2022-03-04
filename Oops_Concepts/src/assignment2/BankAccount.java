package assignment2;

public class BankAccount {

	private int account_no;
	private String name;
	
	
	public BankAccount() {}


	public BankAccount(int account_no, String name) {
		super();
		this.account_no = account_no;
		this.name = name;
	}


	public int getAccount_no() {
		return account_no;
	}


	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "BankAccount [account_no=" + account_no + ", name=" + name + "]";
	}

	
	
	
}
