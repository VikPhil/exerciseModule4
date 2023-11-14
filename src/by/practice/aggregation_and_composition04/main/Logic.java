package by.practice.aggregation_and_composition04.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Logic {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Поиск счета
	 */
	public static void searchingAccount(Client client) {

		boolean temp = false;

		System.out.print("Введите номер счета: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введите число.");
			sc.nextLine();
		}

		int number = sc.nextInt();
		for (Account acc : client.getAccounts()) {
			if (number == acc.getNumber()) {
				System.out.print(acc);
				temp = true;
				break;
			}
		}
		if (temp == false)
			System.out.println("Такого счета не существует.");
	}

	/*
	 * Сортировка счета по номеру
	 */
	public static void sortAccount(Client client) {
		System.out.println("После сортировки (номер счета) по возрастанию.");
		Arrays.sort(client.getAccounts(), Comparator.comparing(Account::getNumber));
	}

	/*
	 * Общая сумма по счетам
	 */
	public static void fullAmount(Client client) {
		double sum = 0;
		for (Account acc : client.getAccounts()) {
			sum += acc.getBalance();
		}
		System.out.println("Сумма на всех счетах: " + sum + "$");
	}

	/*
	 * Сумма на счетах с положительным балансом
	 */
	public static void positiveAmount(Client client) {
		double sum = 0;
		for (Account acc : client.getAccounts()) {
			if (!acc.isBlocked())
				sum += acc.getBalance();
		}
		System.out.println("Сумма на счетах c положительным балансом: " + sum + "$");
	}

	/*
	 * Сумма на счетах с отрицательным балансом
	 */
	public static void negativeAmount(Client client) {
		double sum = 0;
		for (Account acc : client.getAccounts()) {
			if (acc.isBlocked())
				sum += acc.getBalance();
		}
		System.out.println("Сумма на счетах c отрицательным балансом: " + sum + "$");
	}
}
