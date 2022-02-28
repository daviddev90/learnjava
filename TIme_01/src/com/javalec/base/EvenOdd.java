package com.javalec.base;

public class EvenOdd {
	public EvenOdd() {
		
	}
	
	public String evenOdd(int num) {
		String str = "";
		int checkNum = num % 2;
		if(checkNum == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
}
