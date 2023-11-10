package by.practice.aggregation_and_composition03.main;

public class City {
	private String cityName;

	public City() {

	}

	public City(String cityName) {
		this.setCityName(cityName);
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return cityName;
	}
}
