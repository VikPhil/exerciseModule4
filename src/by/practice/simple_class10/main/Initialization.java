package by.practice.simple_class10.main;

import java.text.ParseException;

public class Initialization {

	private ListAirline airline;

	public Initialization() {
	};

	public Initialization(ListAirline airline) {

		this.airline = airline;

	}

	public void initAirline() throws ParseException {
		airline.getAirlines()[0] = new Airline("Париж", 1, "Боинг777", "08:00", Week.ПОНЕДЕЛЬНИК);
		airline.getAirlines()[1] = new Airline("Лондон", 2, "АН-124", "18:35", Week.СУББОТА);
		airline.getAirlines()[2] = new Airline("Минск", 3, "Ту-154", "06:20", Week.ПОНЕДЕЛЬНИК);
		airline.getAirlines()[3] = new Airline("Минск", 4, "Ил-96", "11:00", Week.СУББОТА);
		airline.getAirlines()[4] = new Airline("Челябинск", 5, "Ил-96", "14:10", Week.ЧЕТВЕРГ);
		airline.getAirlines()[5] = new Airline("Лондон", 5, "Боинг777", "14:10", Week.ВТОРНИК);
	}
}
