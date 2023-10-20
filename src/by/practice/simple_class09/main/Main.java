/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими 
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 * */
package by.practice.simple_class09.main;

public class Main {

	public static void main(String[] args) {
		
		ListBooks lbooks = new ListBooks(new Book[5]);
		
		Initialisation init = new Initialisation(lbooks);
		init.initBooks();
		
		lbooks.showBooks();
		
		new Logic(lbooks).searchAuthor();
		new Logic(lbooks).searchPublisher();
		new Logic(lbooks).searchYearPublication();

	}

}
