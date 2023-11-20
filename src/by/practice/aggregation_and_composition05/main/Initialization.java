package by.practice.aggregation_and_composition05.main;

import java.util.Arrays;

public class Initialization {

	private TouristPackage[] trip;

	public Initialization() {
		setTrip(new TouristPackage[10]);
	}

	public void init() {
		getTrip()[0] = new TouristPackage("Хургада", TypeOfRecreation.Отдых, "Авиаперелет", Food.AI, 7);
		getTrip()[1] = new TouristPackage("Шарм Эль Шейх", TypeOfRecreation.Отдых, "Авиаперелет", Food.AI, 10);
		getTrip()[2] = new TouristPackage("Кругосветка", TypeOfRecreation.Круиз, "Лайнер", Food.UAI, 127);
		getTrip()[3] = new TouristPackage("Норвежзские фьорды", TypeOfRecreation.Круиз, "Автобус", Food.FB, 8);
		getTrip()[4] = new TouristPackage("Флоренция", TypeOfRecreation.Экскурсии, "Автобус", Food.RO, 6);
		getTrip()[5] = new TouristPackage("Будапешт", TypeOfRecreation.Экскурсии, "Поезд", Food.RO, 7);
		getTrip()[6] = new TouristPackage("Зеленогорск", TypeOfRecreation.Лечение, "Поезд", Food.HB, 14);
		getTrip()[7] = new TouristPackage("Азербайджан", TypeOfRecreation.Лечение, "Автобус", Food.FB, 14);
		getTrip()[8] = new TouristPackage("Берлин", TypeOfRecreation.Шопинг, "Автобус", Food.BB, 3);
		getTrip()[9] = new TouristPackage("Белосток", TypeOfRecreation.Шопинг, "Автобус", Food.BB, 3);

	}

	public TouristPackage[] getTrip() {
		return trip;
	}

	public void setTrip(TouristPackage[] trip) {
		this.trip = trip;
	}

	public void showList() {
		for (TouristPackage tp : trip)
			System.out.println(tp);
	}

	public void showType() {
		System.out.println(Arrays.asList(TypeOfRecreation.values()));
	}

	public void showTransport() {
		System.out.println("[Автобус, Авиаперелет, Поезд, Лайнер]");
	}

	public void showNutrition() {
		System.out.println(Arrays.asList(Food.values()));
	}

}
