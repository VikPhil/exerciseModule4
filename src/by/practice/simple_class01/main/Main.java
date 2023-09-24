/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих 
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 * */
package by.practice.simple_class01.main;

public class Main {
	public static void main(String[] args) {

		Test1 ts = new Test1();

		System.out.println("Начальные значения");
		ts.display();

		System.out.println();
		System.out.println("Sum: " + ts.getSum());
		System.out.println("Max: " + ts.getMax());

		ts.setNewWidth();
		ts.setNewHeight();

		System.out.println("Новые значения: ");
		ts.display();

		System.out.println();
		System.out.println("Sum: " + ts.getSum());
		System.out.println("Max: " + ts.getMax());
	}
}
