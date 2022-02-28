package assignment2;

class Date{
	private int day,month,year;
	
	public Date() {}
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month= month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

public class DateMain {

	public static void main(String[] args) {
		
		Date date = new Date(28, 2, 2022);
		
		System.out.println(date.toString());
		
		Date date2 = new Date(10, 12, 1996);
		System.out.println(date2.toString());

	}

}
