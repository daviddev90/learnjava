package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 숫자를 입력해주세요");
		int start = scanner.nextInt();
		
		System.out.print("끝 숫자를 입력해주세요");
		int end = scanner.nextInt();
		int temp = 0;
		String frontTxt = start + "부터 " + end;
		
		int odd = 0;
		int even = 0;
		
		if(start < 0 || end < 0) {
			System.out.println("숫자는 0보다 커야 합니다.");
		}else {
			if(start > end) { //시작 숫자가 더 클 경우 앞뒤 변
				temp = start;
				start = end;
				end = temp;
				
				for(int i = start; i <= end; i++) {
					if(i % 2 == 0) {
						even += i;
					}else {
						odd += i;
					}
				}
				double avg = (double)(odd + even)/(end - start + 1);
				System.out.println(frontTxt + "까지 홀수의 합은 " + odd + "이고 짝수의 합은 " + even + "이고 전체 평균은 " + avg + "입니다.");
			}
			
		}
	}
}
