package com.javalec.quiz06;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학점을 숫자로 입력하세요 : ");
		int score = scanner.nextInt();
		int scoreFirst = score / 10;
		String alphabet = "";
		
		switch (scoreFirst) {
		case 10:
		case 9: 
			alphabet = "A";
			break;
		case 8:
			alphabet = "B";
			break;
		case 7:
			alphabet = "C";
			break;
		case 6:
			alphabet = "D";
			break;
		
		default:
			alphabet = "F";
			break;
		}
		
		System.out.println("귀하의 학점은 " + alphabet + "입니다.");
	}
}
