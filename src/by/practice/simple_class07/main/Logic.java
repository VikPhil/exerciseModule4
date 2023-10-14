package by.practice.simple_class07.main;

public class Logic {

	public double getSquareTriangle(Triangle tr) {

		double square;
		double pHalf;

		pHalf = getPerimeterTriangle(tr) / 2;

		square = Math.sqrt(pHalf * (pHalf - tr.getSideOne()) * (pHalf - tr.getSideTwo()) * (pHalf - tr.getSideThree()));

		return square;
	}

	public double getPerimeterTriangle(Triangle tr) {

		return tr.getSideOne() + tr.getSideTwo() + tr.getSideThree();

	}

}
