package com.javalec.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		System.out.println(str1);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int intNum2 = scan.nextInt();
		
		
		System.out.println("입력하신 " + intNum1 + "과 " + intNum2 + "의 합은 " + (intNum1 + intNum2) + "입니다.");
		
	}
}
