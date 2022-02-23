package com.javalec.base;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//선언문
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0; //사용자 입력 숫자
		String result = "";
		
		// 사용자 입력
		System.out.print("숫자를 입력하세요!");
		inputNumber = scanner.nextInt();
		
		//짝홀수 판단 : if문 사용
//		if(inputNumber % 2 == 0 ) {
//			result = "짝수";
//		}else {			
//			result = "홀수";
//		}
		
		//짝홀수 판단: switch문 사용
		switch(inputNumber % 2) {
		case 0:
			result = "짝수";
			break; //안 쓰면 아래로 계속 흘러감
		case 1:
			result = "홀수";
			break;
		default :
			break;
		}
		
		//화면 출력
		System.out.println("입력하는 숫자 " + inputNumber + "는 " + result + "입니다.");
	}

}
