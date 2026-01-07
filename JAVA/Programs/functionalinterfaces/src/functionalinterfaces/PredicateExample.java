package functionalinterfaces;

import java.util.function.Predicate;

class User{
	String username;
	String password;
	public User() {
		
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = num -> num % 2 == 0;  // true
		Predicate<Integer> p2 = num -> num > 10;     // true
		Predicate<String> p3 = str -> str.length() > 5;
		
		Predicate<User> puser = user -> user.getUsername().equals("admin") 
				&& user.getPassword().equals("password123");
		
		
		System.out.println("Is 10 even? " + p1.test(10));
		System.out.println("Is 7 even? " + p1.test(7));
		System.out.println("Is 15 greater than 10? " + p2.test(15));
		System.out.println("Is 5 greater than 10? " + p2.test(5));
		
		System.out.println("Is 'HelloWorld' length greater than 5? " + p3.test("HelloWorld"));
		System.out.println("Is 'Java' length greater than 5? " + p3.test("Java"));
		
		// Predicates can be comibined using and or 
		
		Predicate<Integer> p4 = p1.and(p2); // even and greater than 10
		System.out.println("Is 12 even and greater than 10? " + p4.test(12));
		System.out.println("Is 8 even and greater than 10? " + p4.test(8));
		
		Predicate<Integer> p5 = p1.or(p2); // even or greater than 10
		System.out.println("Is 9 even or greater than 10? " + p5.test(9));
		System.out.println("Is 19 even or greater than 10? " + p5.test(19));
		
		User user1 = new User("admin","password");
		User user2 = new User("admin","admin");
		
		if(puser.test(user1))
			System.out.println("User1 authenticated successfully.");
		else
			System.out.println("User1 authentication failed.");
	}

}
