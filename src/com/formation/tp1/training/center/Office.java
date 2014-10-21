package com.formation.tp1.training.center;

import java.util.HashSet;
import java.util.Set;

public class Office extends Room {
	private Set<Person> persons = new HashSet<>();
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Office(int number, int numberOfSeats) {
		super(number, numberOfSeats);
	}

	public void addPerson(Person person) {
		if (getNumberOfSeats() < persons.size() + 1) {
			throw new IllegalStateException("Pas assez de sièges, nbr seats : "
					+ getNumberOfSeats() + ", ");
		}

		persons.add(person);
	}

	public void removePerson(Person person) {
		persons.remove(person);
	}

	@Override
	public void describe() {
		super.describe();
		System.out.println("I have " + persons.size() + " persons");
		for (Person person : persons) {
			person.describe();
		}
	}

}
