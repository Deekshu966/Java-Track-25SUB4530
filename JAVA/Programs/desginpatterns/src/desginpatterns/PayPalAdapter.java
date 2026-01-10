package desginpatterns;

public class PayPalAdapter implements PaymentProcessor {
	
	private PayPalService payPal;

	
	public PayPalAdapter(PayPalService payPalService) {
		// TODO Auto-generated constructor stub
		this.payPal=payPalService;
	}

	

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		payPal.makePayment(amount);
	}

}
