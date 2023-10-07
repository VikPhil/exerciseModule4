/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое 
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по 
 * умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и 
 * метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности 
 * класса.
 * */
package by.practice.simple_class05.main;

public class Main {

	public static void main(String[] args) {
		Logic log = new Logic();
		Counter c1 = new Counter(); // счетчик по умолчанию
		Counter c2 = new Counter(10, 0, 45); // счетчики в произвольном порядке
		Counter c3 = new Counter(56, 10, 56);
		
		/*
		 * текущее состояние счетчиков
		 */
		System.out.println(c1.getCurrentView()); 
		System.out.println(c2.getCurrentView()); 
		System.out.println(c3.getCurrentView());
		
		System.out.println("Счетчик 'c2'");
		log.counterRangeIncrement(c2); // увеличиваем на единицу
		
		System.out.println("Счетчик 'c3'");
		log.counterRangeDecrement(c3); // уменьшаем на единицу
		
		/*
		 * состояние счетчиков после всех операций 
		 */
		System.out.println(c2.getCurrentView());
		System.out.println(c3.getCurrentView());
	}

}
