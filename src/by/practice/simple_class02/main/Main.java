/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей
 * экземпляра класса.
 * */
package by.practice.simple_class02.main;

public class Main {

	public static void main(String[] args) {
		Test2 tTemp = new Test2();
		Test2 tParam = new Test2(100, 87);

		System.out.println("Параметры по умолчанию: " + tTemp.getFirst() + " " + tTemp.getSecond());
		System.out.println("Конструктор с входными: " + tParam.getFirst() + " " + tParam.getSecond());

		tTemp.setFirst(220);
		tTemp.setSecond(98);

		System.out.println("Измененные параметры: " + tTemp.getFirst() + " " + tTemp.getSecond());
	}

}
