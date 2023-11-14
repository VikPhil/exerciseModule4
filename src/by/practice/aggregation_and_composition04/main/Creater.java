package by.practice.aggregation_and_composition04.main;

public class Creater {
	
	private Client client;
	
	public Creater() {
		
	}
	
	public Creater(Client client) {
		this.client = client;
	}
	
	public void newAccounts() {
		client.getAccounts()[0] = new Account(221, -1100.3);
		client.getAccounts()[1] = new Account(13, 1000);
		client.getAccounts()[2] = new Account(879, -231.7);
		client.getAccounts()[3] = new Account(32, 2100.78);
		client.getAccounts()[4] = new Account(9, 900);
		client.getAccounts()[5] = new Account(100, -99);
	}

	public void display() {
		System.out.println(client);
		client.showAccounts();
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}
}
