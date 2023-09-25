package by.practice.simple_class02.main;

public class Test2 {

	private int first;
	private int second;

	public Test2(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public Test2() {
		first = 10;
		second = 33;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}
}
