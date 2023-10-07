package by.practice.simple_class05.main;

public class Logic {

	public void counterRangeIncrement(Counter counter) {

		while (counter.getMeaning() < counter.getEndMeaning() && counter.getMeaning() >= counter.getStartMeaning()) {
			Arithmetic.incrementMeaning(counter);
			System.out.println(counter.getMeaning());
		}
	}

	public void counterRangeDecrement(Counter counter) {
		while (counter.getMeaning() > counter.getStartMeaning() && counter.getMeaning() <= counter.getEndMeaning()) {
			Arithmetic.decrementMeaning(counter);
			System.out.println(counter.getMeaning());
		}
	}

}
