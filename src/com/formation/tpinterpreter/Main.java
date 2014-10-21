package com.formation.tpinterpreter;

public class Main {
	public static void main(String[] args) {
		NumericValue seven = new NumericValue(7);
		NumericValue five = new NumericValue(5);
		NumericValue six = new NumericValue(6);

		Addition addition = new Addition(five, six);
		Addition mainAddition = new Addition(seven, addition);

		System.out.println(mainAddition.interpret());
	}
}
