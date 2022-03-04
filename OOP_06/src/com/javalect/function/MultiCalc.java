package com.javalect.function;

public class MultiCalc {
	
	int firstNum;
	int secondNum;

	public MultiCalc() {
		// TODO Auto-generated constructor stub
	}

	public void calc(int choiceNumber, int first, int second) {
		firstNum = first;
		secondNum = second;
		
		switch (choiceNumber) {
		case 1:
			add();
			break;

		case 2:
			substract();
			break;

		case 3:
			multiple();
			break;

		default:
			break;
		}
	}

	private void add() {
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}

	private void substract() {
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}

	private void multiple() {
		System.out.println(firstNum + " X " + secondNum + " = " + (firstNum * secondNum));
	}
}
