package collections.usecases;

/*
 * Email Registration
-------------------

1. Website wants to register the email ids

1. No duplicate emails 
2. Order is not impr
3. ability to add, prevent duplicates, display total no of users
4. I want the emails to be printed in sorted order

 */
import java.util.Set;
import java.util.TreeSet;

public class EmailRegistrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> emails = new TreeSet<>();
		emails.add("praveen@gmail.com");
		emails.add("kumar@gmail.com");
		emails.add("john@gmail.com");
		emails.add("praveen@gmail.com");
		emails.add("satish@gmail.com");
		System.out.println("Registered Emails:");
		for (String email : emails) {
			System.out.println(email);
		}
		
		System.out.println("Total Registered Emails: " + emails.size());
		
		
		

	}

}
