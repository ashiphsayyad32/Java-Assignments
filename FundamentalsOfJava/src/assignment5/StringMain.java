package assignment5;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		
		System.out.println(str.length());
		
		int mid_index = str.length()/2;
		
		if(mid_index%2==0) {
			System.out.println("Middle char of "+str+" is "+str.charAt(mid_index));
		}
		else {
			System.out.println("Middle char of "+str+" is "+str.charAt(mid_index-1)+str.charAt(mid_index));
		}

	}

}
