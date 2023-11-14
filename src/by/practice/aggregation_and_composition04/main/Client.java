package by.practice.aggregation_and_composition04.main;

public class Client {
	
	private String name;
	private Account[] accounts;
	
	public Client() {
		
	}
	
	public Client(String name, Account[] accounts) {
		this.setName(name);
		this.setAccounts(accounts);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public void showAccounts() {
		for(Account a: accounts)
			System.out.println(a);
	}
	
	@Override
	public String toString() {
		
		return "Клиент: " + getName() + '\n' +
			   "Количество счетов: " + getAccounts().length + '\n';
				
	}
}
