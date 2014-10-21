package com.formation.tpinterpreter;

public class NumericValue implements Expression {
	private final int value;

	public NumericValue(int value) {
		super();
		this.value = value;
	}

	@Override
	public int interpret() {
		return value;

	}

}
