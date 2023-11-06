package com.greatlearning.balancing;

public class Driver {

	public static void main(String[] args) {
		Brackets ob = new Brackets();
		String input = "([[{}]])";
		if (ob.isBalancedBrackets(input)) {
			System.out.println("The entered String has Balanced Brackets");
		} else
			System.out.println("The entered String do not contain Balanced Brackets");
	}
}
