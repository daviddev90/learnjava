package com.javalec.base;

public class Variable_01 {
	public static void main(String[] args) {
		int intNum1 = 10; //정수 테스트 값
		char char01 = 'A'; // 문자 테스트 값 
		
		System.out.println(intNum1);
		System.out.println(char01);
		
		//intNum1의 값을 100으로 변경하여 출력하기
		intNum1 = 100;
		System.out.println(intNum1);
		
		//상수 변수 정의하기
		final int fixedNum = 100; //final을 붙이면 이 변수는 새 값을 할당할 수 없다.
		System.out.println(fixedNum);
		
		//실수 출력하기
		float floatNum1 = 3.14f; // f를 꼭 붙여야 한다 > 요즘은 float를 쓰지 않는다.
		double doubleNum1 = 3.14; // 실수는 대부분 double로 출력한다.
		final double pi = 3.1415; // double도 역시 final로 상수를 만들 수 있다.
		System.out.println(floatNum1);
		System.out.println(doubleNum1);
		System.out.println(pi);
		
		//문자열 출력하기
		String str1 = "Good Morning"; // String은 Class로 만든 변수다! 그래서 첫 글자 S가 대문자.
		System.out.println(str1);
		
		//Boolean 출력하기(참 거짓)
		boolean bool1 = true;
		boolean bool2 = false;
		//Boolean의 값은 true와 false 단 2가지다.
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
