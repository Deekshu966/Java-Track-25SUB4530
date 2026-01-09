package threads;
class Demothread extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			
			  try { 
				  sleep(1000); 
			} catch (InterruptedException e) 
			  {
				System.out.println(e); 
			  }
			 
			System.out.println("Inside demo thread i value: " + i);
		}
	}
}
public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demothread dt = new Demothread();
		dt.start();
		for (int i = 101; i <= 200; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Inside main thread i value: " + i);
		}

	}

}
