package by.practice.simple_class07.main;

import java.util.Scanner;

public class Input {

	private Triangle tr;

	public Input() {

	}

	public Input(Triangle tr) {
		this.tr = tr;
	}

	public void inputDate() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите стороны треугольника");

		System.out.print("[1]: ");
		tr.setSideOne(sc.nextDouble());
		System.out.print("[2]: ");
		tr.setSideTwo(sc.nextDouble());
		System.out.print("[3]: ");
		tr.setSideThree(sc.nextDouble());
	}

}
