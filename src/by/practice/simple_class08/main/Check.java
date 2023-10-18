package by.practice.simple_class08.main;

import java.io.IOException;

/*
 * Тестовый класс для проверки работы наших объектов
 * */
public class Check {
	
	public static void checkingTheWork() throws IOException {
		ListCustomer cust = new ListCustomer(new Customer[5]);
		Write write = new Write(cust); 
		Logic logic = new Logic(cust);
		
		int start = 0;
		int end = 0;
		
		write.writeData();
		cust.showData();
		
		System.out.println("Сортируем список в алфавитном порядке\n");
		logic.sortInAlphabeticalOrder();
		cust.showData();
	
		System.out.println("Поиск нужных клиентов в заданном диапазоне банковских карт\n");
		
		start = Input.start();
		end = Input.end();
	
		logic.sortingByInterval(start,end);
	}
}
