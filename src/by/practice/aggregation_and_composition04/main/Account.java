package by.practice.aggregation_and_composition04.main;

public class Account {
	private int number;
	private double balance;
	private boolean isBlocked;

	public Account() {

	}

	public Account(int number, double balance) {
		this.setNumber(number);
		this.setBalance(balance);
	}

	public String checkBalance(boolean isBlocked) {
		if (getBalance() < 0) {
			setBlocked(true);
			return "Отрицательный баланс.Счет заблокирован!";
		} else {
			setBlocked(false);
			return "Счет актуален.";
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public String toString() {

		return "Номер счета: " + getNumber() + '\n' + 
			   "Баланс: " + getBalance() + "$\n" + 
			   "Состояние счета: " + checkBalance(isBlocked()) + '\n';

	}
}
