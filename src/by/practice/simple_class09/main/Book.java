package by.practice.simple_class09.main;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private int yearPublication;
	private int numberPages;
	private int price;
	private String typeBinding;
	
	public Book() {
		
	}
	
	public Book(int id, String title, String author, String publisher, int yearPublication, 
			int numberPages, int price, String typeBinding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearPublication = yearPublication;
		this.numberPages = numberPages;
		this.price = price;
		this.typeBinding = typeBinding;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}
	
	@Override
	public String toString() {
		return  "ID: " + id + 
				"\nНазвание: " + title + 
				"\nАвтор: " + author + 
				"\nИздательство: " + publisher + 
				"\nГод издания: "+ yearPublication + 
				"\nКоличество страниц: " + numberPages + 
				"\nЦена: " + price + 
				"\nТип переплета: " + typeBinding + 
				'\n';
				
	}
}
