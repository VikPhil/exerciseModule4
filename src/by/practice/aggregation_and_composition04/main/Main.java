/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы 
 * по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 * */
package by.practice.aggregation_and_composition04.main;

public class Main {

	public static void main(String[] args) {
		 Creater cr = new Creater(new Client("Дмитрий Пупкин", new Account[6]));
		 
		 cr.newAccounts();
		 cr.display();
		 
		 Logic.searchingAccount(cr.getClient());
		 Logic.fullAmount(cr.getClient());
		 Logic.positiveAmount(cr.getClient());
		 Logic.negativeAmount(cr.getClient());
		 Logic.sortAccount(cr.getClient());
		 
		 cr.display();
	}

}
