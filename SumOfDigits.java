package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//int num = 345;
		//int temp = num%10;
		
		//System.out.println(temp);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scanner.nextInt();
		int sum = 0;
		
		while (num>0)
		{
			sum = sum+num%10;
			num = num/10;
		}
		
		System.out.println("Sum of digists is : " +sum);
	}

}
