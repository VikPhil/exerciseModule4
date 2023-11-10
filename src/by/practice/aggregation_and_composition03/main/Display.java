package by.practice.aggregation_and_composition03.main;

public class Display {
	public void show() {
		Country GreatBritain = new Country("Великобритания", new City("Лондон"), new Region[4], 242495);
		Country Brasilia = new Country("Бразилия", new City("Бразилиа"), new Region[5], 8515767);
		Country Belarus = new Country("Беларусь", new City("Минск"), new Region[6], 207595);

		Init.setRegion(GreatBritain, Init.regionalCenterEngland, Init.regionalEngland);
		Init.setRegion(Brasilia, Init.regionalCenterBrasilia, Init.regionalBrasilia);
		Init.setRegion(Belarus, Init.regionalCenterBelarus, Init.regionalBelarus);

		GreatBritain.showTheCapital();
		GreatBritain.showTheNumberOfRegions();
		GreatBritain.showArea();
		GreatBritain.showRegionalCenters();

		Brasilia.showTheCapital();
		Brasilia.showTheNumberOfRegions();
		Brasilia.showArea();
		Brasilia.showRegionalCenters();

		Belarus.showTheCapital();
		Belarus.showTheNumberOfRegions();
		Belarus.showArea();
		Belarus.showRegionalCenters();

	}
}
