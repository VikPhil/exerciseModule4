package by.practice.simple_class07.main;

public class Output {

	private Logic logic;

	public Output() {

	}

	public Output(Logic logic) {
		this.logic = logic;
	}

	public void outputDate(Triangle tr) {

		System.out.println(tr);
		
		if (Check.isTriangle(tr)) {
			System.out.println("Периметр треугольника: " + logic.getPerimeterTriangle(tr));
			System.out.printf("Площадь треугольника: %.2f", logic.getSquareTriangle(tr));
		}else 
			System.out.println("С такими значениями треугольника не существует.");
			
	}

}
