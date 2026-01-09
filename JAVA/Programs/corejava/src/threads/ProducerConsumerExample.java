package threads;
// Producer and consumer example for synchronization


class SharedResource {
	private int data;
	private boolean available = false;

	public synchronized int consume() throws InterruptedException {
		while (!available) {
			wait();
		}
		available = false;
		notifyAll();
		return data;
	}

	public synchronized void produce(int value) throws InterruptedException {
		while (available) {
			wait();
		}
		data = value;
		available = true;
		notifyAll();
	}
}
public class ProducerConsumerExample {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SharedResource sharedResource = new SharedResource();
		sharedResource.produce(42);
		int value = sharedResource.consume();
		System.out.println("Consumed value: " + value);
		

	}

}
