package com.formation.tp1.training.center;

public abstract class Person {
	private final String name;
	private Office office;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getNom() {
		return name;
	}

	public void describe() {
		System.out.println("I am a " + this.getClass().getSimpleName()
				+ ", my name is " + name);

	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

}
