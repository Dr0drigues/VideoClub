package com.formation.tp1.training.center;

import java.util.HashSet;
import java.util.Set;

public class Department {
	private final String name;
	private final TrainingCenter trainingCenter;

	private final Set<Office> offices = new HashSet<>();

	private Set<Trainer> trainers;

	public Department(String name, TrainingCenter trainingCenter,
			Set<Office> offices) {
		super();
		this.name = name;
		this.trainingCenter = trainingCenter;
		for (Office office : offices) {
			addOffice(office);
		}

	}

	private void addOffice(Office office) {
		offices.add(office);
		office.setDepartment(this);
	}

	public void describe() {
		System.out.println("I am a department, my name is " + name);
		System.out.println("I have " + offices.size() + " offices");
	}

	public TrainingCenter getTrainingCenter() {
		return trainingCenter;
	}

	public Set<Trainer> getTrainers() {
		return trainers;
	}

}
