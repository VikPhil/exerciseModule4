package by.practice.simple_class06.main;

import java.util.Scanner;

/*
 * Класс проверяет правильность ввода данных
 * */
public class Check {
	public static Scanner sc = new Scanner(System.in); 
	
	public static int checkingTheRangeMinSec(int num) {
		
		sc.nextLine();
		return num >= 60 ? num = 0 : num;

	}
	
	public static int checkingTheRangeHour(int num) {
		
		sc.nextLine();
		return num >= 24 ? num = 0 : num;

	}
	
	public static int checkingTheInput() {
		
		while(!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc.nextLine();
		}
		
		return sc.nextInt();
	}
}
