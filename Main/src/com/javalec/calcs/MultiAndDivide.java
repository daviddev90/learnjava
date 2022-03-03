package com.javalec.calcs;

import com.javalec.base.Case2;

public class MultiAndDivide {
	public MultiAndDivide() {
		
	}
	
	public void print(int[] startAndEndNums) {
		Case2 case2 = new Case2();
		case2.Case2Mul(startAndEndNums[0], startAndEndNums[1]);
		case2.Case2Div(startAndEndNums[0], startAndEndNums[1]);
	}
}
