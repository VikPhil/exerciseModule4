package by.practice.aggregation_and_composition05.main;

public class TouristPackage {
	private String city;
	private TypeOfRecreation type;
	private String transport;
	private Food nutrition;
	private int days;

	public TouristPackage() {

	}

	public TouristPackage(String city, TypeOfRecreation type, String transport, Food nutrition, int days) {
		this.setCity(city);
		this.setType(type);
		this.setTransport(transport);
		this.setNutrition(nutrition);
		this.setDays(days);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public TypeOfRecreation getType() {
		return type;
	}

	public void setType(TypeOfRecreation type) {
		this.type = type;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Food getNutrition() {
		return nutrition;
	}

	public void setNutrition(Food nutrition) {
		this.nutrition = nutrition;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	@Override
	public String toString() {

		return "Город: " + getCity() + '\n' + 
			   "Тип путевки: " + getType() + '\n' + 
			   "Транспорт: " + getTransport() + '\n' +
			   "Тип питания: " + getNutrition() + '\n' +
			   "Количество дней: " + getDays() + '\n';

	}
}
