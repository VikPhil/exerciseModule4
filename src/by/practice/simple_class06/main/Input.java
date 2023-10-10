package by.practice.simple_class06.main;
import java.time.LocalDateTime;

/*
 * Класс вводим данные на выбор для каждого значения часов
 * */
public class Input {
	
	private LocalDateTime time = LocalDateTime.now();
	
	public void setDefaultTime(Watch watch) {
		watch.setHour(time.getHour());
		watch.setMinute(time.getMinute());
		watch.setSecond(time.getSecond());
	}
	
	public void setTheTimeHour(Watch watch) {
		System.out.print("Часы: ");
		
		watch.setHour(Error.checkingTheRangeHour(Error.checkingTheInput()));
			
	}
	
	public void setTheTimeMinute(Watch watch) {
		System.out.print("Минуты: ");
		
		watch.setMinute(Error.checkingTheRangeMinSec(Error.checkingTheInput()));
			
	}
	
	public void setTheTimeSecond(Watch watch) {
		System.out.print("Секунды: ");
		
		watch.setSecond(Error.checkingTheRangeMinSec(Error.checkingTheInput()));
			
	}
	
}
