package by.practice.aggregation_and_composition01.main;

import java.util.ArrayList;

public class Sentence {
	private ArrayList<Word> words = new ArrayList<Word>();
	
	public Sentence() {
		
	}
	
	public void addWord(Word word) {
		this.words.add(word);
	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Word w: words) {
			sb.append(w.getWord() + " ");
		}
		
        return sb.toString().trim();
    }

}
