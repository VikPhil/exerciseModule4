package by.practice.simple_class10.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sorting {

	private Scanner sc;
	private ListAirline airline;
	private String destination;
	private String day;
	private String time;
	private SimpleDateFormat format = new SimpleDateFormat("HH:mm");

	public Sorting() {
	}

	public Sorting(ListAirline airline) {
		this.airline = airline;
	}

	/*
	 * список рейсов для заданного пункта назначения
	 */
	public void searchByDestination() {
		boolean found = false;
		sc = new Scanner(System.in);

		System.out.print("Введите пункт назначения:");
		destination = sc.nextLine();

		for (int i = 0; i < airline.getAirlines().length; i++) {
			if (airline.getAirlines()[i].getDestination().equalsIgnoreCase(destination)) {
				System.out.println(airline.getAirlines()[i]);
				found = true;
			}
		}
		if (found == false)
			System.out.println("В этот пункт назначения рейсов нет.");

	}

	/*
	 * список рейсов для заданного дня недели
	 */
	public void searchByDayOfTheWeek() {
		boolean found = false;
		sc = new Scanner(System.in);

		System.out.print("Введите день недели:");
		day = sc.nextLine();

		for (int i = 0; i < airline.getAirlines().length; i++) {
			if (airline.getAirlines()[i].getDayWeek().name().equalsIgnoreCase(day)) {
				System.out.println(airline.getAirlines()[i]);
				found = true;
			}
		}
		if (found == false)
			System.out.println("На данный день рейсов нет");
	}

	/*
	 * список рейсов для заданного дня недели, время вылета для которых больше
	 * заданного
	 */
	public void searchWeekAndTime() throws ParseException {
		boolean found = false;
		sc = new Scanner(System.in);

		System.out.print("Введите день недели:");
		day = sc.nextLine();
		
		System.out.print("Введите время в формате (00:00):");
		time = sc.nextLine();

		for (int i = 0; i < airline.getAirlines().length; i++) {
			if (airline.getAirlines()[i].getDayWeek().name().equalsIgnoreCase(day)) {
				if (airline.getAirlines()[i].getDepartureTime().compareTo(format.parse(time)) > 0) {
					System.out.println(airline.getAirlines()[i]);
					found = true;
				}
			}
		}

		if (found == false)
			System.out.println("На данный день, и для заданного времени(позже) рейсов нет.");
	}

}
