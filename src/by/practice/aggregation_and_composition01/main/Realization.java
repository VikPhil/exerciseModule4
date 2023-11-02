package by.practice.aggregation_and_composition01.main;

import java.util.Scanner;

public class Realization {
	public void show() {
		Scanner sc = new Scanner(System.in);
		Text txt = new Text();
		String str = " ";

		while (true) {

			Sentence sen = new Sentence();

			System.out.print("Введите предложение (для конца ввода поставьте '>' через пробел): ");

			while (!sc.hasNext(">")) {

				sen.addWord(new Word(sc.next()));

			}

			txt.addSentence(sen);

			System.out.print("Хотите ввести еще одно предложение (y/n)?");

			sc.next();

			if (sc.hasNext("n")) {
				sc.next();
				break;
			}

			sc.next();

		}
		
		System.out.println("Введите заголовок (для конца ввода поставьте '>' через пробел): ");
		while (!sc.hasNext(">"))
			str += sc.next() + " ";

		txt.setTitle(str);
		sc.close();

		txt.showTitle();
		txt.showText();
	}
}
