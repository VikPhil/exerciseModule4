package by.practice.simple_class10.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
	private String destination;
	private int flightNumber;
	private String typeOfPlane;
	private Date departureTime;
	private Week dayWeek;
	private SimpleDateFormat format = new SimpleDateFormat("HH:mm");

	public Airline() {
	}

	public Airline(String destination, int flightNumber, String typeOfPlane, String time, Week dayWeek) throws ParseException {
		
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfPlane = typeOfPlane;
		this.departureTime = format.parse(time);
		this.dayWeek = dayWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfPlane() {
		return typeOfPlane;
	}

	public void setTypeOfPlane(String typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Week getDayWeek() {
		return dayWeek;
	}

	public void setDayWeek(Week dayWeek) {
		this.dayWeek = dayWeek;
	}

	@Override
	public String toString() {
		
		return  "Пункт назначения: " + destination + 
				"\nНомер рейса: " + flightNumber + 
				"\nТип самолета: " + typeOfPlane + 
				"\nВремя вылета: " + format.format(departureTime) + 
				"\nДень недели: "+ dayWeek + 
				'\n';
				
	}
}
