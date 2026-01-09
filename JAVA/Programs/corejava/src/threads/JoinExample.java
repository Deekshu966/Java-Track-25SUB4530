package threads;

class Task extends Thread{
	public void run() {
		for(int i =1 ; i<=50;i++)
			System.out.println("Value of I "+i);
		try {
			//Thread.sleep(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Task t1 = new Task();
		t1.start();
		t1.join(); // main thread will wait until t1 thread completes its execution
		System.out.println("Main Thread will complete only after child finishes");
	}

}
