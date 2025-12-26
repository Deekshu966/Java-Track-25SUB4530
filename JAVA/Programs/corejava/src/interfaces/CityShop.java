package interfaces;

public class CityShop implements Shop {
	
	public void showDiscount() {
		System.out.println("City Shop Discount: " + discount + "%");
	}

	@Override
	public void selectItems() {
		// TODO Auto-generated method stub
		System.out.println("Items selected from City Shop using online / App");

	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done at City Shop using UPI / Debit Card / Credit Card / Cash");

	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("Items shipped via Home Delivery / from City Shop");

	}

	@Override
	public void otp() {
		// TODO Auto-generated method stub
		System.out.println("OTP verified at City Shop");
		
	}

}
