package by.practice.aggregation_and_composition02.main;

public class Create {

	/*
	 * Создаем колеса
	 */
	public static void createWheels(Car car) {
		for (int i = 0; i < car.getWheels().length; i++)
			car.getWheels()[i] = new Wheel(176, 55, 15, "Зима");
	}

	/*
	 * Меняем какое либо колесо для проверки
	 */
	public static int changeWheel(Wheel[] wheels, int numberOfWeel) {
		if (numberOfWeel > wheels.length || numberOfWeel <= 0)
			return -1;

		numberOfWeel--;

		wheels[numberOfWeel] = new Wheel(170, 55, 15, "Лето");
		return numberOfWeel;
	}
}
