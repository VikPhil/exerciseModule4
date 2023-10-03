package by.practice.simple_class04.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
	private String destination;
	private int trainNumber;
	private Date sendingTime;
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	
	public Train() {
		
	}
	
	public Train(String destination, int trainNumber, Date sendingTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.sendingTime = sendingTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getSendingTime() {
		return sendingTime;
	}

	public void setSendingTime(Date sendingTime) {
		this.sendingTime = sendingTime;
	}
	
	@Override
    public String toString() {
        
		return  "Город: " + destination + '\n' +
                "Номер поезда: " + trainNumber + '\n' +
                "Время отправления: " + sdf.format(sendingTime);
    }
	
}
