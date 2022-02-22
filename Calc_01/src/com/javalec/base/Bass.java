package com.javalec.base;

public class Bass {
	public static void main(String[] args) {
		// 연산자 종류별 출력
		int i = 10, j = 2, k = 5;
		
		System.out.println("덧셈 : " + i + " + " + j + " = " + ( i + j ));
		System.out.println("뺄셈 : " + i + " - " + j + " = " + ( i - j ));
		System.out.println("곱셈 : " + i + " * " + j + " = " + ( i * j ));
		System.out.println("나눗셈 : " + i + " / " + j + " = " + ( i / j ));
		System.out.println("나머지 : " + i + " % " + j + " = " + ( i % j ));
		
		System.out.println("<--- 자동 증감 연산자 --->");
		System.out.println("증가 : " + (i++)); // i를 출력하고 i값을 증가시킴
		System.out.println(i); //위에서 i가 1 증가되었기 때문에 11 출력
		System.out.println("감소 : " + (i--)); // i를 출력하고 i값을 감소시킴
		System.out.println(i); // i는 1 감소된 10
		
		System.out.println("<--- 줄여 쓰는 연산자 --->");
		System.out.println("i에 100을 더하기 : " + (i += 100)); //i = i + 100과 같은 의미
		
		i = 10;
		System.out.println("<--- 동등비교 관계 연산자 --->");
		System.out.println("i == j :" + (i == j)); //false 출력
		System.out.println("i != j :" + (i != j)); //true 출력

		System.out.println("<--- 비교 관계 연산자 --->");
		System.out.println("i > j :" + (i > j)); //true 출력
		System.out.println("i < j :" + (i < j)); //false 출력
		
		System.out.println("i >= j :" + (i >= j)); //true 출력
		System.out.println("i <= j :" + (i <= j)); //false 출력
		
		System.out.println("<--- 논리 연산자 --->");
		System.out.println(i + ">" + j + "&&" + j + ">" + k + " : " + ((j>j) && (j>k)));
		//true, false이기 때문에 최종 false를 반환
		System.out.println(i + ">" + j + "||" + j + ">" + k + " : " + ((j>j) || (j>k)));
		//하나라도 True이기 때문에 최종 true 반환
		
		System.out.println("<--- 삼항 연산자 --->");
		System.out.println("삼항 연산 결과 (k == 5 ? 1 : 2) " + (k == 5 ? 1 : 2));
		//k가 5면 1을 출력하고 아니면 2를 출력해라
				
		
		int intNum1 = 24;
		// intNum1이 짝수인지 홀수인지 판단하여 intNum: 짝수/홀수 로 표기하기
	    System.out.println(intNum1 % 2 == 0 ? "intNum1 : 짝수" : "intNum1 : 홀수");
	    
	    System.out.println(intNum1 % 3 == 0 ? "intNum1은 3의 배수" : "intNum1 은 3의 배수가 아님");
	    
	    System.out.println((intNum1 % 4 == 0) && (intNum1 % 6 == 0) ? "True" : "False"); //bool이 아니라 문자열 True False를 일부러 쓴 것
		
	}
}
