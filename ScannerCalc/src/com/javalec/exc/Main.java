package com.javalec.exc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++){
            String star = "";
            for(int j = n-1; j>= 0; j--){
                star += " ";
            }
            for(int j = 1; j<= i; j++){
                star += "*";
            }
            System.out.println(star);
        }
	}

}
