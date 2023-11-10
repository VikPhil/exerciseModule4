package by.practice.aggregation_and_composition03.main;

public class Init {

	public static String[] regionalCenterEngland = { "Лондон", "Кардифф", "Эдинбург", "Белфаст" };
	public static String[] regionalCenterBrasilia = { "Бразилиа", "Ресифи", "Манаус", "Сан-Паулу", "Порту-Алегри" };
	public static String[] regionalCenterBelarus = { "Минск", "Гомель", "Витебск", "Гродно", "Могилев", "Брест" };

	public static String[] regionalEngland = { "Англия", "Шотландия", "Уэльс", "Северная Ирландия" };
	public static String[] regionalBrasilia = { "Цнтр.Зап.рег.", "Сев.Вос.рег.", "Северный рег.", "Юг.Вос.рег.",
			"Южн. рег." };
	public static String[] regionalBelarus = { "Минская обл.", "Гомельская обл.", "Витебская обл.", "Гродненская обл.",
			"Могилевская обл.", "Брестская обл." };

	public static void setRegion(Country country, String[] regionalCenter, String[] region) {
		for (int i = 0; i < country.getRegions().length; i++) {
			country.getRegions()[i] = new Region(new City(regionalCenter[i]), region[i]);
		}
	}
}