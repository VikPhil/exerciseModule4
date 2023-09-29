/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * */
package by.practice.simple_class03.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		Logic logic = new Logic();
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			logic.inputData(student[i], sc);
		}

		sc.close();

		System.out.println("Студенты с лучшими результатами");
		for (Student s : student)
			logic.outputData(s);
	}
}
