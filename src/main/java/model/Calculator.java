package model;

public class Calculator {
	public float calculate(String f_operand, String operator, String s_operand) throws ArithmeticException {
		float num1 = Float.parseFloat(f_operand);
		float num2 = Float.parseFloat(s_operand);
		switch (operator) {
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				if (num2 == 0) {
					throw new ArithmeticException("Division by zero");
				}
				return num1 / num2;
			default:
				return 0;
		}
	}
}
