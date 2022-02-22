package com.javalec.base;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		// Scanner를 이용해 입력 받기
		Scanner scanner = new Scanner(System.in);
		
		//Console에서 Data 가져오기
		System.out.print("숫자를 입력하세요!"); //print 뒤에 ln이 없으면 줄바꿈을 하지 않음
		int intNum1 = scanner.nextInt();
		
		//가져온 데이터를 출력하기
	    System.out.println("입력한 숫자는 " + intNum1 + "입니다.");
	    
	    //입력하신 숫자는 짝수입니다. 홀수입니다.
	    if(intNum1 % 2 == 0) {
	    	System.out.println("입력한 숫자는 짝수입니다.");
	    }else {
	    	System.out.println("입력한 숫자는 짝수입니다.");
	    }
	}
}
