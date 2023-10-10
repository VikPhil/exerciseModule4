/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения 
 * времени на заданное количество часов, минут и секунд.
 * */
package by.practice.simple_class06.main;

public class Main {

	public static void main(String[] args) {
		
		Watch watch = new Watch();
		Input in = new Input();
		
		in.setDefaultTime(watch);
		
		System.out.println(watch);
		
		in.setTheTimeHour(watch);
		in.setTheTimeMinute(watch);
		in.setTheTimeSecond(watch);
		
		System.out.println(watch);
	}

}
