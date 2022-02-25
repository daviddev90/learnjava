package com.javalec.quiz08;


public class Quiz08 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				if((dan*i) %2 == 0) {
					System.out.print(dan + " X " + i + " = " + dan*i);
					
					if(dan == 9) {
						System.out.print("\t");
					}else {
						System.out.print("\n");
					}
				}else {
					System.out.print("\t\t");
					
					if(dan == 9) {
						System.out.print("\n");
					}
				}
				
			}
		}
	}
}
