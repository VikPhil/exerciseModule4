package by.practice.aggregation_and_composition02.main;

public class Wheel {
	private int width;
	private int height;
	private int diameter;
	private String season;

	public Wheel() {

	}

	public Wheel(int width, int height, int diameter, String season) {
		this.setWidth(width);
		this.setHeight(height);
		this.setDiameter(diameter);
		this.setSeason(season);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        Wheel wheel = (Wheel)o;
        return width == wheel.width &&
        	   height == wheel.height &&
        	   diameter == wheel.diameter &&
        	   season.equals(wheel.season);
        	   
    }
	
	@Override
	public String toString() {
        return "Ширина шины: " + width + '\n' +
        	   "Отн. высоты профиля к ширине(%): " + height + '\n' +
        	   "Посадочный диаметр(в дюймах): " + diameter + '\n' +
        	   "Сезон: " + season + '\n';
        		
    }

}
