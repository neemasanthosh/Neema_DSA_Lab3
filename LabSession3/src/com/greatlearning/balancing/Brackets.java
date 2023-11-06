package com.greatlearning.balancing;

import java.util.Stack;

public class Brackets {
	public boolean isBalancedBrackets(String input) {

		if (input == null || input.isBlank()) {
			System.out.println("Empty input string");
			return false;
		}
		Stack<Character> stack = new Stack<Character>();

		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}

			switch (ch) {
			case ')':
				if (stack.pop() != '(') {
					return false;
				}
				break;

			case '}':
				if (stack.pop() != '{') {
					return false;
				}
				break;

			case ']':
				if (stack.pop() != '[') {
					return false;
				}
				break;
			default:
				System.out.println("Invalid character in input string");
				return false;
			}
		}
		return (stack.isEmpty());

	}
}
