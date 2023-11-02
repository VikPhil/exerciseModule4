package by.practice.aggregation_and_composition01.main;

import java.util.ArrayList;

public class Text {
	private ArrayList<Sentence> sentences = new ArrayList<Sentence>();

	private String title;

	public Text() {

	}

	/*
	 * Выводим заголовок
	 */
	public void showTitle() {
		System.out.println("Заголовок:" + getTitle());
	}

	/*
	 * Дополняем текст
	 */
	public void addSentence(Sentence sentence) {
		this.sentences.add(sentence);
	}

	/*
	 * Выводим текст
	 */
	public void showText() {
		StringBuilder sb = new StringBuilder();

		for (Sentence s : sentences) {
			sb.append(s.toString() + "\n");
		}

		System.out.println(sb.toString().trim());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
