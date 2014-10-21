package com.formation.tp1.training.center;

import java.util.HashSet;
import java.util.Set;

public class TrainingCenter {
	private final Set<Department> departments = new HashSet<>();
	private final Set<Room> rooms;

	public TrainingCenter(Set<Room> rooms) {
		super();
		this.rooms = rooms;
	}
	
	public void addDepartment(Department department){
		departments.add(department);		
	}

	public void descibe() {
		System.out.println("I am a training Center with " + departments.size() + "departments and " + rooms.size() + " rooms.");
		for (Department department : departments) {
			department.describe();
		}
		
		for(Room room : rooms){
			room.describe();
		}
		
	}

}
