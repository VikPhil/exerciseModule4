package by.practice.simple_class04.main;

import java.util.Scanner;

public class Logic {

	/*
	 * Сортировка по номерам поездов по возрастанию
	 */
	public static void trainNumberSorting(Train[] train) {

		Train temp = new Train();

		for (int i = 0; i < train.length; i++) {
			for (int j = 0; j < train.length - 1; j++) {
				if (train[j].getTrainNumber() > train[j + 1].getTrainNumber()) {
					temp = train[j];
					train[j] = train[j + 1];
					train[j + 1] = temp;
				}
			}

		}
	}

	/*
	 * Вывод информации поезда, по номеру
	 */
	public static void informationOutput(Train[] train) {

		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер поезда: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введите число!");
			sc.nextLine();
		}
		number = sc.nextInt();

		for (Train t : train) {
			if (t.getTrainNumber() == number)
				System.out.print(t.toString());
		}

		System.out.println();
	}

	/*
	 * Сортировка по времени и пункту назначения
	 */
	public static void timeAndDestinationSorting(Train[] train) {

		Train temp = new Train();

		for (int i = 0; i < train.length - 1; i++) {
			for (int j = i + 1; j < train.length; j++) {
				if (train[i].getDestination().compareTo(train[j].getDestination()) > 0) {
					temp = train[i];
					train[i] = train[j];
					train[j] = temp;
				}
				if (train[i].getDestination().compareTo(train[j].getDestination()) == 0) {
					if (train[i].getSendingTime().compareTo(train[j].getSendingTime()) > 0) {
						temp = train[i];
						train[i] = train[j];
						train[j] = temp;
					}
				}
			}
		}

	}
}
