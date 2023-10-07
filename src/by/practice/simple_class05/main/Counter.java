package by.practice.simple_class05.main;

public class Counter {
	private int meaning;
	private int startMeaning;
	private int endMeaning;
	
	public Counter() {
		setMeaning(0);
		setStartMeaning(0);
		setEndMeaning(99);
	}
	
	public Counter(int meaning, int startMeaning, int endMeaning) {
		this.meaning = meaning;
		this.startMeaning = startMeaning;
		this.endMeaning = endMeaning;
	}
	
	/*
	 * Получить текущее состояние
	 * */
	public Counter getCurrentView() {
		return this;
	}
	
	public int getMeaning() {
		return meaning;
	}

	public void setMeaning(int meaning) {
		this.meaning = meaning;
	}

	public int getStartMeaning() {
		return startMeaning;
	}

	public void setStartMeaning(int startMeaning) {
		this.startMeaning = startMeaning;
	}

	public int getEndMeaning() {
		return endMeaning;
	}

	public void setEndMeaning(int endMeaning) {
		this.endMeaning = endMeaning;
	}
	
	@Override
    public String toString() {
        return  "Значение: " + meaning + '\n' +
                "Начало диапазона: " + startMeaning + '\n' +
                "Конец диапазона: " + endMeaning + '\n';
    }
	
}
