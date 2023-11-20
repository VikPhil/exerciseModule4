package by.practice.aggregation_and_composition05.main;

import java.util.Scanner;

public class Logic {

	public Scanner sc = new Scanner(System.in);
	private String choice;
	private boolean isIt;

	/*
	 * Выбор путевки по типу
	 */
	public void typeSelection(Initialization trip) {

		setIt(false);

		System.out.println("Для отображения путевок по их типу введите на выбор");
		trip.showType();

		sc.nextLine();
		choice = sc.nextLine();

		for (TouristPackage tp : trip.getTrip()) {
			if (choice.equals(tp.getType().toString())) {
				System.out.println(tp);
				setIt(true);
			}
		}

		sc.close();
		if (!isIt())
			System.out.println("Извините, такого типа путевки мы не предоставляем.");
	}

	/*
	 * Выбор путевки по транспорту
	 */
	public void typeTransport(Initialization trip) {
		setIt(false);

		System.out.println("Выберите предпочитаемый вами транспорт из списка");
		trip.showTransport();

		sc.nextLine();
		choice = sc.nextLine();

		for (TouristPackage tp : trip.getTrip()) {
			if (choice.equals(tp.getTransport())) {
				System.out.println(tp);
				setIt(true);
			}
		}

		sc.close();
		if (!isIt())
			System.out.println("Извините, такого типа путевки мы не предоставляем.");
	}

	/*
	 * Выбор путевки по питанию
	 */
	public void typeNutrition(Initialization trip) {
		setIt(false);

		System.out.println("Выберите предпочитаемый вами тип питания из списка");
		trip.showNutrition();

		sc.nextLine();
		choice = sc.nextLine();

		for (TouristPackage tp : trip.getTrip()) {
			if (choice.equals(tp.getNutrition().toString())) {
				System.out.println(tp);
				setIt(true);
			}
		}

		sc.close();
		if (!isIt())
			System.out.println("Извините, такого типа путевки мы не предоставляем.");
	}

	/*
	 * По количеству дней
	 */
	public void typeNumberDays(Initialization trip) {
		setIt(false);

		int start;
		int end;

		System.out.println("Выберите количество дней из диапазона от (0 - 127)");
		System.out.print("От: ");

		sc.nextLine();
		while (!sc.hasNextInt()) {
			System.out.println("Введите число!");
			sc.nextLine();
		}
		start = sc.nextInt();

		sc.nextLine();

		System.out.print("До: ");

		while (!sc.hasNextInt()) {
			System.out.println("Введите число!");
			sc.nextLine();
		}
		end = sc.nextInt();

		for (int i = 0; i < trip.getTrip().length; i++) {
			if (trip.getTrip()[i].getDays() >= start && trip.getTrip()[i].getDays() <= end) {
				System.out.println(trip.getTrip()[i]);
				setIt(true);
			}
		}

		sc.close();
		if (!isIt())
			System.out.println("Извините, такого типа путевки мы не предоставляем.");
	}

	public boolean isIt() {
		return isIt;
	}

	public void setIt(boolean isIt) {
		this.isIt = isIt;
	}
}
