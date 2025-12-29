package interfaces;

public class Order {
	
	Payment payment;
	public Order(){
		payment = new Payment();
  	}
	
	void placeOrder() {
		System.out.println("Placing order...");
		payment.processPayment();
		System.out.println("Order placed successfully.");
	}

}
