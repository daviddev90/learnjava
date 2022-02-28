package com.javalec.base;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//입력할 숫자보다 1개 더 많은 배열 크기 생
		System.out.println("입력할 숫자의 갯수? : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		
		//숫자를 입력받음
		System.out.println(n + "개의 숫자를 입력하세요!:");
		for (int i=0; i<n; i++) {
			System.out.print((i+1) + "의 숫자: ");
			arr[i] = in.nextInt();
		}
		
		//삽입할 숫자의 위치와 값 입력받음
		System.out.print("몇 번째의 숫자를 삭제하시겠습니까? :");
		int where = in.nextInt();
		
		int[] newArr = new int[n-1];
		
		for(int i = 0; i < (where - 1); i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(arr[4]);
		for (int i = (where - 1); i < newArr.length - 1; i++) {
			//삽입될 녀석이 들어갈 자리에서부터 한칸씩 뒤로 옮
			newArr[i] = arr[i+1];
		}
		
		System.out.println("------ 결과 ------");
		for(int i=0; i< newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}

}