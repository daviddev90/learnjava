package com.javalec.base;

public class Calc {

	//main > ctrl + space > enter
	public static void main(String[] args) {
		
		//변수를 이용한 사칙연산
		int intNum1 = 100;
		int intNum2 = 20;
		
		System.out.println(intNum1 + intNum2); // 100 + 20
		System.out.println(intNum1 - intNum2); // 100 - 20
		
		intNum1 = 10;
		
		System.out.println(intNum1 * intNum2); // 10 * 20
		System.out.println(intNum1 / intNum2); // 10 / 20
		
		
		// 문자와 계산값을 같이 출력하
		System.out.println("덧셈 :" + (intNum1 + intNum2)); // 덧셈: 30
		
		System.out.println("덧셈 : " + intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println("뺄셈 : " + intNum2 + " - " + intNum1 + " = " + (intNum2 - intNum1));
		System.out.println("곱셈 : " + intNum1 + " * " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println("나눗셈 : " + intNum2 + " / " + intNum1 + " = " + (intNum2 / intNum1));
		
		
		// 상수를 이용한 사칙연산
		System.out.println(20+10); //30
		System.out.println(20-10); //10
		System.out.println(10*20); //200
		System.out.println(20/10); //2
		System.out.println(10/20); //0
	}
}

