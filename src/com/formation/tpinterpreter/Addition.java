package com.formation.tpinterpreter;

public class Addition implements Expression {
	private final Expression left;
	private final Expression right;

	public Addition(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret() {
		return left.interpret() + right.interpret();

	}
}
