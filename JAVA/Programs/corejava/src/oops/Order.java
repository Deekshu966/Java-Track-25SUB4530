package oops;

public class Order {
	
	Payment payment;
	Order(){
		payment = new Payment();
  	}
	
	void placeOrder() {
		System.out.println("Placing order...");
		payment.processPayment();
		System.out.println("Order placed successfully.");
	}

}
