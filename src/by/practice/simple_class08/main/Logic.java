package by.practice.simple_class08.main;

public class Logic {
	private ListCustomer customer;

	public Logic() {

	}

	public Logic(ListCustomer customer) {
		this.customer = customer;
	}

	/*
	 * Сортируем пофамильно в алфавитном порядке
	 */
	public void sortInAlphabeticalOrder() {

		Customer temp = new Customer();

		for (int i = 0; i < customer.getCustomer().length - 1; i++) {
			for (int j = i + 1; j < customer.getCustomer().length; j++) {
				if (customer.getCustomer()[i].getSurname().compareTo(customer.getCustomer()[j].getSurname()) > 0) {
					temp = customer.getCustomer()[i];
					customer.getCustomer()[i] = customer.getCustomer()[j];
					customer.getCustomer()[j] = temp;
				}

			}
		}

	}

	/*
	 * Ищем номер кредитной карты в заданном диапазоне
	 */
	public void sortingByInterval(int start, int end) {

		boolean isIt = false;

		System.out.println();
		
		for (int i = 0; i < customer.getCustomer().length; i++) {
			if (customer.getCustomer()[i].getCardNumber() >= start
					&& customer.getCustomer()[i].getCardNumber() <= end) {
				System.out.println(customer.getCustomer()[i]);
				isIt = true;
			}
		}
		if (isIt == false)
			System.out.println("В данном диапазоне кредитных карт, клиентов нет.");
	}
}
