package interfaces;

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VillageShop v = new VillageShop();
		TownShop t = new TownShop();
		CityShop c = new CityShop();
		Shop.welcomeNote();
		
		v.selectItems();
		v.payment();
		v.shipment();
		v.showDiscount();
	// A Static method in interfaces cannot be called on child classes
	//	v.welcomeNote(); 
		
		
		t.selectItems();
		t.otp();
		t.payment();
		t.shipment();
		t.showDiscount();
	//	t.welcomeNote();
		
	
		
		
		c.selectItems();
		c.otp();
		c.payment();
		c.shipment();
		c.showDiscount();
	//	c.welcomeNote();
		

	}

}
