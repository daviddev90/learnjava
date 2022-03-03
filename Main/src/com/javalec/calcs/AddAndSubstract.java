package com.javalec.calcs;

import com.javelec.function.Case01;

public class AddAndSubstract {
	public AddAndSubstract() {
		
	}
	
	public void print(int[] startAndEndNums) {
		Case01 case1 = new Case01();
		
		case1.num1 = startAndEndNums[0];
		case1.num2 = startAndEndNums[1];
		
		case1.add();
		case1.minus();
	}
	
}
