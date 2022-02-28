package com.javalec.bas2;

import java.util.Scanner;

public class Quiz3 {
	Scanner in = new Scanner(System.in);
	int[] arr = new int[5];
	
	while(true) {
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 현황");
		System.out.println("4. 종료");
		System.out.print("번호를 선택하세요!");
		
		int act = in.nextInt();
		
		if(act == 1) {
			System.out.print("고객번호 : ");
			int customer = in.nextInt();

			System.out.print("금액 : ");
			int amount = in.nextInt();
			
			
			
		}else if(act == 2) {
			System.out.print("고객번호 : ");
			int customer = in.nextInt();
			
		}else if(act ==3) {
			
		}else if(act ==4) {
			System.out.println(">>>> Thank You <<<<");
			break;
		}else {
			System.out.println("1~4번을 눌러주세");
		}
	}
}
