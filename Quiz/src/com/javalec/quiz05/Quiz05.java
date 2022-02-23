package com.javalec.quiz05;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("User id : ");
		String userID = scanner.next();
		
		System.out.print("Password : ");
		String pw = scanner.next();
		
		
		if(userID.equals("root") && pw.equals("1234")) {
			System.out.println("** 환영 합니다. **");
		}else {
			if(userID == "") {
				System.out.println("ID를 입력해주세요");
			}else if(pw == "") {				
				System.out.println("패스워드를 입력해주세요");
			}else {
				System.out.println("** 등록된 사용자가 아닙니다. **");
			}
		}
	}
}
