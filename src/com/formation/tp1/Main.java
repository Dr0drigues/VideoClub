package com.formation.tp1;

import java.util.HashSet;
import java.util.Set;

import com.formation.tp1.training.center.Department;
import com.formation.tp1.training.center.InterimTrainer;
import com.formation.tp1.training.center.Office;
import com.formation.tp1.training.center.PermanentTrainer;
import com.formation.tp1.training.center.Room;
import com.formation.tp1.training.center.Trainer;
import com.formation.tp1.training.center.TrainingCenter;
import com.formation.tp1.training.center.TrainingRoom;

public class Main {
	public static void main(String[] args) {
		Office computerSciencesOffice = new Office(3, 3);
		Office accountingOffice1 = new Office(4, 1);
		Office accountingOffice2 = new Office(5, 2);

		Set<Room> rooms = new HashSet<>();
		rooms.add(new TrainingRoom(1, 50));
		rooms.add(new TrainingRoom(2, 20));
		rooms.add(computerSciencesOffice);
		rooms.add(accountingOffice1);
		rooms.add(accountingOffice2);

		Set<Office> officesForComputerSciencesDepartment = new HashSet<>();
		officesForComputerSciencesDepartment.add(computerSciencesOffice);

		Set<Office> officesForAccountingDepartment = new HashSet<>();
		officesForAccountingDepartment.add(accountingOffice1);
		officesForAccountingDepartment.add(accountingOffice2);

		TrainingCenter trainingCenter = new TrainingCenter(rooms);

		Department computerSciencesDepartment = new Department("Informatique",
				trainingCenter, officesForComputerSciencesDepartment);
		Department accountingDepartment = new Department("Accounting",
				trainingCenter, officesForAccountingDepartment);

		trainingCenter.addDepartment(computerSciencesDepartment);
		trainingCenter.addDepartment(accountingDepartment);

		Trainer computerSciencesInterimTrainer = new InterimTrainer("John",
				computerSciencesDepartment);
		Trainer computerSciencesPermanentTrainer = new PermanentTrainer(
				"Carrie", computerSciencesDepartment);

		computerSciencesOffice.addPerson(computerSciencesInterimTrainer);
		computerSciencesOffice.addPerson(computerSciencesPermanentTrainer);

		Trainer accountingPermanentTrainerJames = new PermanentTrainer("James",
				accountingDepartment);
		Trainer accountingPermanentTrainerPaula = new PermanentTrainer("Paula",
				accountingDepartment);

		accountingOffice1.addPerson(accountingPermanentTrainerJames);
		accountingOffice2.addPerson(accountingPermanentTrainerPaula);

		trainingCenter.descibe();

	}

}
