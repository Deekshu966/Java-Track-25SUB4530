package corejava;

public class Book {
	
	int isbn;
	String title;
	String author;
	
	Book(int isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public void display() {
		System.out.println("ISBN: " + isbn);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
	
	public void display(int isbn) {
		System.out.println("One parameter display method");
	}
	
	public double display(String title) {
		System.out.println("Two parameter display method");
		return 0;
	}

}
