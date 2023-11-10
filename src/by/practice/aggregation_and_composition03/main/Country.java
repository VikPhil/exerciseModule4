package by.practice.aggregation_and_composition03.main;

public class Country {

	private String countryName;
	private City capital;
	private Region[] regions;
	private double countryArea;

	public Country() {

	}

	public Country(String countryName, City capital, Region[] regions, double countryArea) {
		this.setCountryName(countryName);
		this.setCapital(capital);
		this.setRegions(regions);
		this.setCountryArea(countryArea);
	}

	/*
	 * Вывод столицы
	 */
	public void showTheCapital() {
		System.out.println("Столица: " + getCountryName() + " - " + getCapital());
	}

	/*
	 * Вывод количества областей
	 */
	public void showTheNumberOfRegions() {
		System.out.println("Количество областей: " + getRegions().length);
	}

	/*
	 * Площадь государства
	 */
	public void showArea() {
		System.out.println("Площадь страны: " + getCountryArea());
	}

	/*
	 * Вывод областных центров
	 */

	public void showRegionalCenters() {
		for (Region r : regions)
			System.out.print(r);
		System.out.println();
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	public double getCountryArea() {
		return countryArea;
	}

	public void setCountryArea(double countryArea) {
		this.countryArea = countryArea;
	}
}
