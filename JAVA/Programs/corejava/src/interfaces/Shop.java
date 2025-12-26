package interfaces;

public interface Shop {
	int discount=10;
	void selectItems();
	public void payment();
	void shipment();
	default void  otp() {
		System.out.println("OTP verified at Shop");
    }

	static void welcomeNote() {
		System.out.println("Welcome to the Shop");
	}
}
// Shop p = new Shop();

// 