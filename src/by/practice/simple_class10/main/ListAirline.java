package by.practice.simple_class10.main;

public class ListAirline {
	private Airline[] airlines;

	public ListAirline() {
	}

	public ListAirline(Airline[] airlines) {
		this.airlines = airlines;
		new Initialization(this);
	}

	public Airline[] getAirlines() {
		return airlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	public void showAirline() {
		for (Airline a : airlines)
			System.out.println(a);
	}
}
