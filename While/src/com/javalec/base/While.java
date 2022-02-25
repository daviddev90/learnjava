package com.javalec.base;

public class While {

	public static void main(String[] args) {
		//1부터 100까지 합을 구하기
//		int i = 0;
//		int total = 0;
//		
//		
//		while(true) {
//			total += i;
//			i++;
//			if(i > 100) {
//				break;
//			}
//		}
//		
//		System.out.println("1부터 100까지의 합은 " + total + "입니다.");
//		
//		for(int j = 0; j <= 100000; j++) {
//			if(j == 10) {
//				System.out.println("Find");
//				break;
//			}
//		}
		
		
		for(int j = 0; j <= 15; j++) {
			if(j == 10) {
				continue; //아래로 흘러가지 않고 반복문을 다시 수행
			}
			System.out.println(j);
		}
	}

}
