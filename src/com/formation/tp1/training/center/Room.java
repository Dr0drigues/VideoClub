package com.formation.tp1.training.center;

public abstract class Room {
	private final int number;
	private final int numberOfSeats;
	
	public Room(int number, int numberOfSeats) {
		super();
		this.number = number;
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumber() {
		return number;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void describe() {
		System.out.println("I am a " + this.getClass().getSimpleName() + ", my number is "+ number + ", I have " + numberOfSeats + " seats");
		
	}

	
}
