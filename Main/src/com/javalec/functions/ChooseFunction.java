package com.javalec.functions;

import java.util.Scanner;

public class ChooseFunction {
	public ChooseFunction() {
		
	}
	
	public int chooseFunction() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n ** 원하는 기능을 선택 하세요 \n");
		System.out.println("1. 덧셈, 뺄셈");
		System.out.println("2. 곱셈, 나눗셈");
		System.out.println("3. 범위의 합계 구하기");
		System.out.println("4. 범위의 곱셈 구하기");
		System.out.println("5. 범위의 구구단 구하기");
		System.out.println("6. 종료");
		
		int selectedFunction = scan.nextInt();
		System.out.println("\n ==> 선택 : " + selectedFunction);
		
		return selectedFunction;
		
	}
	
	
}
