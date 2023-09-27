package by.practice.simple_class03.main;

public class Student {
	private String surname;
	private int group;
	public int[] rating = new int[5];

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getRating() {
		return rating;
	}

}
