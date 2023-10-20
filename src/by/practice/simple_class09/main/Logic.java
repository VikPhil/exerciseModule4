package by.practice.simple_class09.main;

import java.util.Scanner;

public class Logic {

	public Scanner sc = new Scanner(System.in);;
	private String author;
	private String publisher;
	private int yearPublication;
	private ListBooks books;

	public Logic() {

	}

	public Logic(ListBooks books) {
		this.books = books;
	}

	/*
	 * Cписок книг по автору
	 */
	public void searchAuthor() {

		boolean found = false;

		System.out.print("Введите автора на выбор\n[Кинг Стивен, Митчелл Дэвид, Лагин Л, Коул Аллан]: ");
		setAuthor(sc.nextLine());

		for (int i = 0; i < books.getBook().length; i++) {
			if (books.getBook()[i].getAuthor().equalsIgnoreCase(author)) {
				System.out.println(books.getBook()[i]);
				found = true;
			}
		}

		if (found == false)
			System.out.println("В базе таких авторов нет.");
	}

	/*
	 * Список книг выпущенных заданным издательством
	 */
	public void searchPublisher() {
		boolean found = false;

		System.out.print("Введите издательство\n[Эксмо, АСТ МОСКВА, Юнацтва]: ");
		setPublisher(sc.nextLine());

		for (int i = 0; i < books.getBook().length; i++) {
			if (books.getBook()[i].getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(books.getBook()[i]);
				found = true;
			}
		}

		if (found == false)
			System.out.println("В базе нет такого издательства.");
	}

	/*
	 * Список книг выпущенных после заданного года
	 */
	public void searchYearPublication() {
		boolean found = false;

		System.out.print("Введите год публикации: ");
		while (!sc.hasNextInt()) {
			System.out.println("Неверные данные.");
			System.out.println("Введите число.");
			sc.nextLine();
		}
		setYearPublication(sc.nextInt());

		for (int i = 0; i < books.getBook().length; i++) {
			if (books.getBook()[i].getYearPublication() >= yearPublication) {
				System.out.println(books.getBook()[i]);
				found = true;
			}
		}

		if (found == false)
			System.out.println("В базе нет книг, введенного года.");
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}
}
