package com.javalec.base;

public class CalcSum {
	//Field (Property)
	
	//Constructor
	public CalcSum() {
		
	}
	
	public int sum(int startNum, int endNum) {
		int sum = 0;
		for (int i = startNum; i<=endNum; i++) {
			sum += i;
		}
		return sum;
	}
	
}
