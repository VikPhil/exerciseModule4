package by.practice.aggregation_and_composition02.main;

public class Engine {
	private int power;
	private int numberOfCylinders;
	private float cylinderVolume;

	public Engine() {

	}

	public Engine(int power, int numberOfCylinders, float cylinderVolume) {
		this.setPower(power);
		this.setNumberOfCylinders(numberOfCylinders);
		this.setCylinderVolume(cylinderVolume);
	}

	public void start() {
		System.out.println("Завели двигатель.");
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public float getCylinderVolume() {
		return cylinderVolume;
	}

	public void setCylinderVolume(float cylinderVolume) {
		this.cylinderVolume = cylinderVolume;
	}
	
	@Override
	public String toString() {
        return "Мощность двигателя: " + power + " л.с." + '\n' +
        	   "Количество цилиндров: " + numberOfCylinders + '\n' +
        	   "Объем цилиндра: " + cylinderVolume + '\n';
    }
}
