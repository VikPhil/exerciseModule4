package by.practice.simple_class10.main;

import java.text.ParseException;

public class Display {

	public Display() throws ParseException {
		ListAirline airline = new ListAirline(new Airline[6]);
		Initialization init = new Initialization(airline);
		init.initAirline();

		airline.showAirline();

		new Sorting(airline).searchByDestination();
		new Sorting(airline).searchByDayOfTheWeek();
		new Sorting(airline).searchWeekAndTime();
	}

}
