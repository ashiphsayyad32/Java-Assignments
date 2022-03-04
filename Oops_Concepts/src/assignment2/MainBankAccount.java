package assignment2;

public class MainBankAccount {

	public static void main(String[] args) {
		
		Saving saving = new Saving(1, "Ashiph", 10000);
		System.out.println(saving.toString());
		
		Current current = new Current(2, "Mayur", 10000);
		System.out.println(current.toString());

	}

}
