package by.practice.simple_class09.main;

public class ListBooks {
	private Book[] book;

	protected Initialization init;

	public ListBooks() {

	}

	public ListBooks(Book[] book) {
		this.book = book;
		init = new Initialization(this);
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public void showBooks() {
		for (Book b : book)
			System.out.println(b);
	}
}
