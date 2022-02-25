package com.javalec.quiz07;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 시작하는 숫자를 정하세요 : ");
		int startNo = scanner.nextInt();
		System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
		int endNo = scanner.nextInt();
		System.out.print("3. 원하는 나머지 값은? : ");
		int leftNo = scanner.nextInt();
		
		int countLeft = 0;
		int max = 0;
		int min = endNo;
		int sum = 0;
		if(startNo > endNo) {
			int tempNo = startNo;
			startNo = endNo;
			endNo = tempNo;
		}
		
		if(leftNo > endNo || leftNo < startNo) {
			System.out.println("나머지 값은 첫 숫자와 끝 숫자 사이여야 합니다.");
		}else if(leftNo > 9){
			System.out.println("나머지 값은 10보다 작아야 합니다.");
		}else {
			for(int i = startNo; i <= endNo; i++) {
				if(i % 10 == leftNo) {
					sum += i;
					if(i>max) {
						max = i;
					}
					if(i<min) {
						min = i;
					}
					countLeft ++;
				}
			}
			double avg = (double) sum / countLeft;

			System.out.println(startNo + "부터 " + endNo +"까지의 범위 중 나머지가 " + leftNo+"인 숫자의 갯수는 "+countLeft+"개 이고 합은 "+sum+"입니다.");
			System.out.println("그리고 나머지가 " + leftNo + "인 숫자의 평균은 " + avg + "이고,");
			System.out.println("나머지가 " +leftNo + "인 숫자 중 최대숫자는 " + max + "이고 최소 숫자는 " + min + "입니다.");
		}
		
		
	}

}
