package com.javalec.base;

import java.util.Scanner;

import com.javalec.calcs.AddAndSubstract;
import com.javalec.calcs.MultiAndDivide;
import com.javalec.calcs.RangeGugu;
import com.javalec.calcs.RangeMultiple;
import com.javalec.calcs.RangeSum;
import com.javalec.functions.ChooseFunction;
import com.javalec.functions.EnterStartEndNums;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ChooseFunction cf = new ChooseFunction();
		EnterStartEndNums esen = new EnterStartEndNums();
		AddAndSubstract as = new AddAndSubstract();
		MultiAndDivide md = new MultiAndDivide();
		RangeSum rs = new RangeSum();
		RangeGugu rg = new RangeGugu();
		RangeMultiple rm = new RangeMultiple();

		while (true) {
			int selectedFunction = cf.chooseFunction();
			if (selectedFunction == 6) {
				break;
			}

			switch (selectedFunction) {
			case 1: {
				int[] startEndArr = esen.returnArray();
				as.print(startEndArr);
			}
				break;

			case 2: {
				int[] startEndArr = esen.returnArray();
				md.print(startEndArr);
			}
				break;

			case 3: {
				int[] startEndArr = esen.returnArray();
				rs.print(startEndArr);
			}
				break;

			case 4: {
				int[] startEndArr = esen.returnArray();
				rm.print(startEndArr);
			}
				break;

			case 5: {
				rg.esenPrint();
			}
				break;

			default:
				System.out.println("1~6 사이의 번호를 선택해주세요 ");
				break;
			}
		}

	}
}
