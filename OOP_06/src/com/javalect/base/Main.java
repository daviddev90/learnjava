package com.javalect.base;

import java.util.Scanner;

import com.javalect.function.MultiCalc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choiceNumber, firstNum, secondNum;
		
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.print("\n번호를 선택 하세요 :");
		
		choiceNumber = scan.nextInt();
		System.out.print("첫번째 숫자를 입력하세요: ");
		firstNum = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		secondNum = scan.nextInt();
		
		MultiCalc multi = new MultiCalc();
		multi.calc(choiceNumber, firstNum, secondNum);
	}

}
