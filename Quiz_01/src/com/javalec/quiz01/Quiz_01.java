package com.javalec.quiz01;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt();
		
		if(price > 8000) {
			System.out.println("너무 비쌉니다.");
		}else if(price > 5000) {
			System.out.println("조금 비쌉니다.");
		}else if(price > 3000) {
			System.out.println("적당한 금액 입니다.");
		}else {
			System.out.println("싼 편 입니다.");
		}
		
	}

}
