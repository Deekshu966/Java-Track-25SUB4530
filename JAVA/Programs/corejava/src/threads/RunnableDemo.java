package threads;
class Demo{
	    
      
        public static void show() {
            System.out.println("Show method in Demo class");
        }
    
}
class Dthread extends Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for (int i = 1; i <= 100; i++) {
				System.out.println("Inside MyThread-1: " + i);
				System.out.println("Is alive" + Thread.currentThread().isAlive());
			}
		
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dthread dt = new Dthread();
		dt.show();
		/*
		 * Runnable dt = () -> { for (int i = 1; i <= 100; i++) {
		 * System.out.println("Inside MyThread-1: " + i); } };
		 */		Thread t1 = new Thread(dt);
		t1.start();
		for (int i = 101; i <= 200; i++) {
			System.out.println("Inside Main Thread: " + i);
		}
		
		System.out.println("Is alive" + t1.isAlive());
		
		
		

	}

}
