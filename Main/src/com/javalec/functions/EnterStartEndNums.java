package com.javalec.functions;

import java.util.Scanner;

public class EnterStartEndNums {
	public EnterStartEndNums() {

	}

	public int[] returnArray() {
		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자를 입력하세요: ");
		int startNum = scan.nextInt();
		System.out.print("끝 숫자를 입력하세요: ");
		int endNum = scan.nextInt();

		int[] arr = { startNum, endNum };

		return arr;
	}
}
