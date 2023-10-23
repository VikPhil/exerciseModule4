package by.practice.simple_class09.main;

public class Initialization {
	
	private ListBooks books;
	
	public Initialization() {
		
	}
	
	public Initialization(ListBooks books) {
		this.books = books;
	}
	
	public void initBooks() {

		books.getBook()[0] = new Book(1, "Темная башня", "Кинг Стивен", "АСТ МОСКВА", 2008, 810, 82, "Твердая обложка");
		books.getBook()[1] = new Book(2, "Облачный атлас", "Митчелл Дэвид", "Эксмо", 2014, 700, 100, "Твердая обложка");
		books.getBook()[2] = new Book(3, "Старик Хоттабыч", "Лагин Л", "Юнацтва", 1984, 318, 30, "Мягкая обложка");
		books.getBook()[3] = new Book(4, "Возвращение воина", "Коул Аллан", "Эксмо", 2003, 410, 70, "Мягкая обложка");
		books.getBook()[4] = new Book(5, "Колдун и кристалл", "Кинг Стивен", "АСТ МОСКВА", 2003, 698, 87, "Твердая обложка");
	
	}
}
