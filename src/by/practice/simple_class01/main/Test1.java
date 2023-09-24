package by.practice.simple_class01.main;

import java.util.Scanner;

public class Test1 {

	private int width = 10;
	private int height = 70;

	private Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.print("ширина: " + width + " длина: " + height);
	}

	public void setNewWidth() {

		System.out.print("Введите ширину: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
		}
		width = sc.nextInt();

	}

	public void setNewHeight() {
		System.out.print("Введите длину: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
		}
		height = sc.nextInt();
	}

	public int getSum() {
		return width + height;
	}

	public int getMax() {
		return width > height ? width : height;
	}

}
