package com.javalec.test1;

import java.util.Scanner;

public class ArrayQuiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer(0 ~ 9) : ");
		int n = in.nextInt();
		int sum = 0;
		
		while(n>0) {
			sum += n % 10;
			n = n / 10;
		}
		
		System.out.println("Sum of digits = " + sum);
	}

}