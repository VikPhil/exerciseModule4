/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов 
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен 
 * пользователем. Добавьте возможность сортировки массива по пункту назначения, причем поезда с 
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 * */
package by.practice.simple_class04.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {

		Train[] train = new Train[5];

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		train[0] = new Train("Минск", 1, sdf.parse("08:00"));
		train[1] = new Train("Витебск", 4, sdf.parse("08:30"));
		train[2] = new Train("Минск", 2, sdf.parse("07:00"));
		train[3] = new Train("Гомель", 3, sdf.parse("10:20"));
		train[4] = new Train("Минск", 5, sdf.parse("10:00"));

		System.out.println("Сортировка поездов по номерам");
		Logic.trainNumberSorting(train);
		for (Train t : train) {
			System.out.print(t.toString());
			System.out.println();
		}

		System.out.println("Вывод информации по номеру поезда");
		Logic.informationOutput(train);

		System.out.println("Сортировка по пунктам назначения и времени, если одинаковый пункт");
		Logic.timeAndDestinationSorting(train);
		for (Train t : train) {
			System.out.print(t.toString());
			System.out.println();
		}

	}

}
