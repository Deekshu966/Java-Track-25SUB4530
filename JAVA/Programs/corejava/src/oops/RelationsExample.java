package oops;

public class RelationsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order();
		order.placeOrder();

		Address address = new Address();
		System.out.println(address);

		Person person = new Person(1001, "Kumar", address);
		System.out.println(person);

		Printer printer = new Printer();
		Office office = new Office();
		office.doWork(printer);

	}

}
