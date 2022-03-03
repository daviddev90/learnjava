package com.javalec.calcs;

public class RangeSum {
	public RangeSum() {
		
	}
	
	public void print(int[] range) {
		int startNum = range[0];
		int endNum = range[1];
		int[] newRange = {startNum, endNum};
		newRange = ifStartBiggerChange(newRange);
		int sum = calcRangeSum(range);
		System.out.println(range[0] + "에서 " + range[1] + "까지의 합계는 " + sum + "입니다.");
		
	}
	
	private int calcRangeSum(int[] range) {
		int sum = 0;
		
		for (int i = range[0]; i<=range[1]; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	private int[] ifStartBiggerChange(int[] inputRanges) {
		if(inputRanges[0] > inputRanges[1]) {
			int temp = inputRanges[0];
			inputRanges[0] = inputRanges[1];
			inputRanges[1] = temp;
			return inputRanges;
		}else {
			return inputRanges;
		}
	}
}
