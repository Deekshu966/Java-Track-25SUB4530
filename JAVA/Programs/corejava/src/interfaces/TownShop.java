package interfaces;

public class TownShop implements Shop {
	
	public void showDiscount() {
		System.out.println("Town Shop Discount: " + discount + "%");
	}

	@Override
	public void selectItems() {
		// TODO Auto-generated method stub
		System.out.println("Items selected from Town Shop manually / online");

	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done at Town Shop UPI /  Debit card / cash");

	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("Items shipped via Home Deliver /  from Town Shop");

	}

	

}
