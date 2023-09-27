/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * */
package by.practice.simple_class03.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] student = new Student[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			inputData(student[i], sc);
		}

		sc.close();

		System.out.println("Студенты с лучшими результатами");
		for (Student s : student)
			outputData(s);
	}

	/*
	 * Вводим данные
	 */
	public static void inputData(Student student, Scanner sc) {

		System.out.print("ФИО студента: ");

		student.setSurname(sc.nextLine());

		System.out.print("№ группы: ");

		while (!sc.hasNextInt()) {
			System.out.println("Введите число!");
			sc.nextLine();
		}
		student.setGroup(sc.nextInt());

		System.out.println("Введите оценки: ");
		for (int i = 0; i < student.rating.length; i++) {

			System.out.print("[" + (i + 1) + "]");

			sc.nextLine(); // "костыль"
			while (!sc.hasNextInt()) {
				System.out.println("Введите число!");
				sc.nextLine();
			}

			student.rating[i] = sc.nextInt();

			/*
			 * Проверка ввода в диапазоне
			 */
			if (student.rating[i] < 1 || student.rating[i] > 10) {
				System.out.println("Введите оценку (1 - 10)");
				i--;
				continue;
			}
		}

		sc.nextLine(); // "костыль"
	}

	/*
	 * Функция выводит данные студентов с лучшими оценками
	 */
	public static void outputData(Student student) {

		int count = student.rating.length; // счетчик для фиксации студентов с наивысшим баллом (9,10)

		/*
		 * Ищем лучших
		 */
		for (int j = 0; j < student.rating.length; j++) {
			if (student.rating[j] == 9 || student.rating[j] == 10)
				count--;
			else
				count = student.rating.length;
		}

		if (count == 0) {
			System.out.println("Студент: " + student.getSurname());
			System.out.println("Группа: " + student.getGroup());
			System.out.println("Оценки: " + Arrays.toString(student.getRating()));
		}
	}

}
