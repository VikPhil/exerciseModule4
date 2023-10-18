package by.practice.simple_class08.main;

import java.util.Scanner;

public class Input {

	static Scanner sc = new Scanner(System.in);

	public static int start() {
		System.out.print("Введите начало диапазона карты:");
		while (!sc.hasNextInt()) {
			System.out.print("Введите число!");
			sc.nextLine();
		}
		return sc.nextInt();
	}

	public static int end() {
		System.out.print("Введите конец диапазона карты:");
		while (!sc.hasNextInt()) {
			System.out.print("Введите число!");
			sc.nextLine();
		}
		return sc.nextInt();
	}

}
