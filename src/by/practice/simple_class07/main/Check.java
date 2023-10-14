/*
 * Класс проверяет существует ли треугольник
 * */
package by.practice.simple_class07.main;

public class Check {
	public static boolean isTriangle(Triangle tr) {

		if (tr.getSideOne() + tr.getSideTwo() > tr.getSideThree()
				&& tr.getSideOne() + tr.getSideThree() > tr.getSideTwo()
				&& tr.getSideTwo() + tr.getSideThree() > tr.getSideOne())
			return true;
		else
			return false;
	}
}
