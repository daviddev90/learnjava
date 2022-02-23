package com.javalec.quiz04;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {

		//스캐너를 선언
		Scanner scanner = new Scanner(System.in);
		
		//신장을 입력받는다. 입력받을 때는 int지만 나중에 double로 바꿔야 계산 가능
		System.out.print("신장(cm)을 입력하세요 : ");
		int intHeight = scanner.nextInt();
		
		//몸무게를 입력받는다. int라도 상관없다.
		System.out.print("몸무게(kg)을 입력하세요 : ");
		int weight = scanner.nextInt();
		
		//키를 잘못(미터단위로)했을 가능성을 차단하기 위함
		if(intHeight < 5 || weight < 5 || intHeight > 500 || weight > 500) {
			System.out.println("5~500 사이의 숫자를 입력해주세요.");
		}else {
			//height을 int에서 double로 바꾼다.
			double height = intHeight;
			
			//BMI 계산법을 적용한다.
			double bmi = weight / (height * height / 10000);
			System.out.println("당신의 BMI지수는 " + String.format("%.2f", bmi) + "입니다");
			
			if(bmi > 25) {
				System.out.println("체중을 많이 감량하셔야 합니다.");
			}else if(bmi > 23) {
				System.out.println("체중을 약간 감량하셔야 합니다.");
			}else if(bmi > 18.5) {
				System.out.println("체중이 적당합니다.");
			}else {
				System.out.println("체중을 늘리셔야 합니다.");
			}
		}
	}
}
