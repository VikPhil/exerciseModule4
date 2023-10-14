package by.practice.simple_class07.main;

public class Triangle {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	public Triangle() {
		
	}
	
	public Triangle(double sideOne, double sideTwo, double sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}
	
	@Override
	 public String toString() {
       return "Треугольник со сторонами: " + '|' + sideOne +  '|'
       		+ sideTwo + '|'
       		+ sideThree + '|';
	}
}
