package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import collections.Book;
import collections.Publisher;

public class BooksMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book(1234,"JavaProgramming", "John");
		Book b2 = new Book(4567,"Python Programming", "Rod");
		Book b3 = new Book(6786,"DevOps Programming", "Alice");
		Book b4 = new Book(3452,"Database Management", "Charlie");
		
		Publisher p1 = new Publisher(1,"TechBooks Publishing");
		Publisher p2 = new Publisher(2,"Jaico Publishing");
		Publisher p3 = new Publisher(3,"Tata McGrawhill Publishing");
		Publisher p4 = new Publisher(4,"Perason Publications");
		
		Map<Publisher,Book> pubBooks = new TreeMap<>();
		pubBooks.put(p1, b1);
		pubBooks.put(p2, b2);
		pubBooks.put(p3, b3);
		pubBooks.put(p4, b4);
		System.out.println("Books and Publishers Map in the sorted order of publisher names");
		for (Map.Entry<Publisher, Book> e : pubBooks.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

		}
		
		//Map<String,Book> books = new HashMap<>();
		Map<String,Book> books = new TreeMap<>();
		books.put("Java", b1);
		books.put("Python", b2);
		books.put("DevOps", b3);
		books.put("DBMS", b4);
		for (Map.Entry<String, Book> e : books.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			
		}
		

	}

}
