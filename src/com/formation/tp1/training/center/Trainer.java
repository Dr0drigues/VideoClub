package com.formation.tp1.training.center;

public abstract class Trainer extends Person {
	private final Department department;

	public Trainer(String name, Department department) {
		super(name);
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

}
