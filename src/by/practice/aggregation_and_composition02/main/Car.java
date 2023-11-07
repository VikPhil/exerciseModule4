package by.practice.aggregation_and_composition02.main;

public class Car {
	private Wheel[] wheels;
	private Engine engine;
	private String makeOfCar;
	private double fuelQuantity;
	private double maxTank; // Объем бака

	public Car() {

	}

	public Car(Wheel[] wheels, Engine engine, String makeOfCar, double maxTank, double fuelQuantity) {
		this.setWheels(wheels);
		this.setEngine(engine);
		this.setMakeOfCar(makeOfCar);
		this.setMaxTank(maxTank);
		this.setFuelQuantity(fuelQuantity);
	}

	/*
	 * Вывод марки автомобиля
	 */
	public void showMakeOfCar() {
		System.out.println("Марка автомобиля: " + getMakeOfCar());
	}

	/*
	 * Ехать
	 */
	public void run() {
		engine.start();
		System.out.println("Поехали!");
	}

	/*
	 * Заправить
	 */
	public void tankFilled() {
		if (getFuelQuantity() == getMaxTank()) {
			System.out.println("Бак полон.");
		} else if (getFuelQuantity() < getMaxTank() && getFuelQuantity() >= 0) {
			System.out.println("До полного бака нужно заправить: " + (getMaxTank() - getFuelQuantity()) + " литров");
		} else
			System.out.println("Недопустимое значение уровня топлива!");
	}
	/*
	 * Замена колеса
	 */
	public void wheelReplacement() {
		int index = 1;
		boolean isChange = false; 
		int flag = Create.changeWheel(getWheels(), 3); // ставим другое колесо
		
		
		for(Wheel w: wheels) 
			System.out.println("Колесо $" + index++ + '\n' + w);
		
		for(int i = 0; i < getWheels().length; i++) {
			
			if (flag < 0 || flag >= getWheels().length) // Проверка диапазона массива
				break;
			
			if(getWheels()[i].equals(getWheels()[flag])) { 
				index = i+1;
				System.out.println("Колесо номер " + index + " нужно заменить");
				System.out.println("МЕНЯЕМ!\n");
				if(flag-1 > 0) {
					getWheels()[flag] = getWheels()[--i];
					isChange = true;
					break;
				} else if(flag + 1 < getWheels().length) {
					getWheels()[flag] = getWheels()[++i];
					isChange = true;
					break;
				}
			}
		}
		index = 1;
		if(isChange) 
			for(Wheel w: wheels) 
				System.out.println("Колесо $" + index++ + '\n' + w);

	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getMakeOfCar() {
		return makeOfCar;
	}

	public void setMakeOfCar(String makeOfCar) {
		this.makeOfCar = makeOfCar;
	}

	public double getFuelQuantity() {
		return fuelQuantity;
	}

	public void setFuelQuantity(double fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}

	public double getMaxTank() {
		return maxTank;
	}

	public void setMaxTank(double maxTank) {
		this.maxTank = maxTank;
	}
	
	@Override
	public String toString() {
        return "Марка автомобиля: " + makeOfCar + '\n' +
        	   "Объем топливного бака: " + maxTank + '\n' +
        	   "Двигатель: \n" + engine +
        	   "Кол-во колес: " + wheels.length + '\n';
        		
    }
}
