package desginpatterns;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor paymentProcessor = new PayPalAdapter(new PayPalService());
		paymentProcessor.pay(100);

	}

}
