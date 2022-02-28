package assignment3;

import java.util.Scanner;

public class CalculateSumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int input = sc.nextInt();
		int number = input;
		
		int sum=0;
		int rem=0;
		
		while(number>0) {
			rem=number%10;
			sum+=rem;
			number = number/10;
		}
		
		System.out.println("Sum of digits of "+input+" is "+sum);
		

	}

}
