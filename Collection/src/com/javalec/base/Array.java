package com.javalec.base;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] names = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		//000의 신장을 입력하세요! - 5명
		//평균신장은: 
		//가장 큰 학생은 누구고 키
		//가장 작은 학생은 누구고 키
		
		int[] heights = new int[5];
		int sum = 0;
		int maxIdx = 0;
		int minIdx = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < heights.length; i++) {
			System.out.print(names[i] + "의 신장을 입력하세요! ");
			int height = in.nextInt();
			
			sum += height;
			
			if(i == 0 || min > height) {
				min = height;
				minIdx = i;
			}
			if(max < height) {
				max = height;
				maxIdx = i;
			}
		}
		
		
		System.out.println("평균신장은: " + (double) sum/heights.length);
		System.out.println("가장 큰 학생은 " + names[maxIdx] + "이고 그 학생의 키는 " + max);
		System.out.println("가장 작은 학생은 " + names[minIdx] + "이고 그 학생의 키는 " + min);
		
		
		
	}

}
