package threads;

class Yieldtask extends Thread{
	String name;

	public Yieldtask(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 11; i < 15; i++) {
			System.out.println(name + " : " + i);
			if (i == 2) {
				System.out.println(name + " is yielding");
				Thread.yield();
			}
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Yieldtask t1 = new Yieldtask("Thread-1");
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread : " + i);
			
		}

	}

}
