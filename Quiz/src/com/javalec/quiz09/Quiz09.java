package com.javalec.quiz09;

public class Quiz09 {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int dan=2; dan<10; dan++) {
				if(i%2 == 0) {
					System.out.print(dan + " X " + i + " = " + dan*i);
				}else {
					System.out.print(dan + " X * = " + dan*i );
				}
				
				if(dan == 9) {
					System.out.print("\n");
				}else {
					System.out.print("\t");
				}
			}
		}
	}
}
