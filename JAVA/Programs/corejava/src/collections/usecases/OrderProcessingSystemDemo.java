package collections.usecases;
/*
 * An e commerce order processing system needs to manage customer orders.
 * Requirments:
 * -----------
 * 
 * 2. Order can have duplicate products
 * 3. insertion order must be preserved
 * 4. System should be able to 
 *   a. add new order
 *   b. display all orders
 *   c. update order status
 *   d. cancel an order
 *   e. cal the frequency of product ordered
 */

import java.util.ArrayList;
import java.util.List;

public class OrderProcessingSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> orders = new ArrayList<>();
		orders.add("Laptop");
		orders.add("Smartphone");
		orders.add("Headphones");
		orders.add("Laptop");
		orders.add("Smartwatch");
		orders.add("Headphones");
		System.out.println("Customer Orders:");
		for (String order : orders) {
			System.out.println(order);
		}
		
		// Update order status (for simplicity, just print the update)
		System.out.println("\nUpdating order status for 'Smartphone' to 'Mobile'");
		orders.set(1, "Mobile Phone");
		System.out.println("Updated Orders:");
		for (String order : orders) {
			System.out.println(order);
		}
		// Cancel an order (remove first occurrence of 'Laptop')
		System.out.println("\nCancelling order for 'Laptop'");
		orders.remove("Laptop");
		System.out.println("Orders after cancellation:");
		for (String order : orders) {
			System.out.println(order);
		}
		// Calculate frequency of each product ordered
		System.out.println("\nProduct Order Frequency:");
		for (String product : orders) {
			int frequency = 0;
			for (String item : orders) {
				if (item.equals(product)) {
					frequency++;
				}
			}
			System.out.println(product + ": " + frequency);
		}

	}

}
