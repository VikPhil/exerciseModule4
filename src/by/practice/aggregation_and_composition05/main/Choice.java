package by.practice.aggregation_and_composition05.main;

import java.util.Arrays;
import java.util.Comparator;

public class Choice {

	public void showChoice() {
		Logic logic = new Logic();
		Initialization in = new Initialization();
		in.init();

		Arrays.sort(in.getTrip(), Comparator.comparing(TouristPackage::getDays)); // сортируем по кол-ву дней

		display();

		while (!logic.sc.hasNextInt()) {
			System.out.println("Введите число!");
			logic.sc.nextLine();
		}

		int numb = logic.sc.nextInt();

		switch (numb) {
		case 1:
			logic.typeSelection(in);
			break;
		case 2:
			logic.typeTransport(in);
			break;
		case 3:
			logic.typeNutrition(in);
			break;
		case 4:
			logic.typeNumberDays(in);
			break;

		}

	}

	public void display() {
		System.out.println("Введите тип поиска из списка");
		System.out.println("1. По типу");
		System.out.println("2. По транспорту");
		System.out.println("3. По питанию");
		System.out.println("4. По дням");
	}
}
