package interfaces;

public class VillageShop implements Shop {
	
	public void showDiscount() {
		//discount =10;
		System.out.println("Village Shop Discount: " + discount + "%");
	}
	

	@Override
	public void selectItems() {
		// TODO Auto-generated method stub
		
		System.out.println("Items selected from Village Shop");

	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Cash Payment done at Village Shop");

	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("Items shipped manually from Village Shop");

	}


}
