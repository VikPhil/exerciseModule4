/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 * */
package by.practice.aggregation_and_composition02.main;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(new Wheel[4], new Engine(60, 6, 1.1f), "Тойота", 50, 23.7);
		car.showMakeOfCar();
		car.run();
		car.tankFilled();
		Create.createWheels(car);
		car.wheelReplacement();
	}

}