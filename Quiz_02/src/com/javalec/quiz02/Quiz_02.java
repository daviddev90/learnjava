package com.javalec.quiz02;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요!");
		int scoreK = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요!");
		int scoreE = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요!");
		int scoreM = scanner.nextInt();
		
		//int를 미리 double로 바꿔야 소수점 아래가 출력된다
		double doubleScoreK = scoreK;
		double doubleScoreE = scoreE;
		double doubleScoreM = scoreM;
		
		double score_avg = (doubleScoreK + doubleScoreE + doubleScoreM) / 3;
		
		//점수 범위를 체크한다
		if(scoreK < 0 || scoreK >100 || scoreE < 0 || scoreE > 100 || scoreM >100 || scoreM < 0 ) {
			//하나라도 잘못 입력되었다면 아래 경고를 띄우고 결과를 알려주지 않는다.
			System.out.println("점수가 잘못 입력되었습니다.");
			
			//어떤 항목이 잘못 입력되었는지 알려준다.
			if(scoreK<0 || scoreK > 100) {
				System.out.println("국어 점수를 다시 입력하세요.");
			}
			if(scoreE<0 || scoreE > 100) {
				System.out.println("영어 점수를 다시 입력하세요.");
			}
			if(scoreM<0 || scoreM > 100) {
				System.out.println("수학 점수를 다시 입력하세요.");
			}
			
			
		}else {
			//다 잘 입력되었다면 평균점수를 알려준다.
			System.out.println("평균점수 : " + score_avg);
			
			//국어점수 수준을 알려준다 
			if(scoreK > score_avg) {
				System.out.println("국어 점수는 평균 보다 높습니다.");
			}else if(scoreK == score_avg) {
				System.out.println("국어 점수는 평균 점수 입니다.");
			}else {
				System.out.println("국어 점수는 평균 보다 낮습니다.");
			}
			
			//영어점수 수준을 알려준다
			if(scoreE > score_avg) {
				System.out.println("영어 점수는 평균 보다 높습니다.");
			}else if(scoreE == score_avg) {
				System.out.println("영어 점수는 평균 점수 입니다.");
			}else {
				System.out.println("영어 점수는 평균 보다 낮습니다.");
			}
			
			//수학점수 수준을 알려준다
			if(scoreM > score_avg) {
				System.out.println("수학 점수는 평균 보다 높습니다.");
			}else if(scoreM == score_avg) {
				System.out.println("수학 점수는 평균 점수 입니다.");
			}else {
				System.out.println("수학 점수는 평균 보다 낮습니다.");
			}
		}
	}
}
