package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		
		System.out.println("1부터 100까지 홀수의 합은 " + odd + "입니다.");
		System.out.println("1부터 100까지 짝수의 합은 " + even + "입니다.");
	}

}
