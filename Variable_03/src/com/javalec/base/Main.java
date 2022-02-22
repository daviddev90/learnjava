package com.javalec.base;

public class Main {
	public static void main(String[] args) {
		int i1 = 10;
		double d1 = i1; // 묵시적 형변환: 작은 데이터타입이 큰 데이터타입에 흡수되는 것
		System.out.println("d1의 데이터는 "+ d1 + " 입니다."); //10.0
		
		// -----------------------------------
		
		double d2 = 10.8;
		int i2 = (int) d2; // 명시적 형변환
		System.out.println("i1의 데이터는 "+ i2 + " 입니다."); //10 > 데이터 손실
	}
}
