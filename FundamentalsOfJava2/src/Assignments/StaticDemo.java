package Assignments;

class Demo{
	static int count;
	
	static {
		count = 5;
	}
	
	public static void display() {
		System.out.println("This is static method");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Demo.count = count;
	}
	
}


public class StaticDemo {

	public static void main(String[] args) {
		
		System.out.println(Demo.count);
		
		Demo.display();
	}

}
