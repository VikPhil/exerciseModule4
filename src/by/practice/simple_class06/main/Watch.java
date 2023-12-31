package by.practice.simple_class06.main;

public class Watch {

	private int hour;
	private int minute;
	private int second;
	
	public Watch() {
		
	}
	
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	@Override
	 public String toString() {
        return "Текущее время: " + hour +  ':'
        		+ minute + ':'
        		+ second + '\n';
	}

}
