package by.practice.simple_class08.main;

public class ListCustomer {

	private Customer[] customer;

	public ListCustomer() {

	}

	public ListCustomer(Customer[] customer) {
		this.customer = customer;
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}

	public void showData() {
		for (Customer cus : customer)
			System.out.println(cus);

	}

}
