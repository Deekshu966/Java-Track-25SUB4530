package threads;


class Mythread1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Inside MyThread-1: " + i);
		}
	}
}

class Mythread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 201; i <= 300; i++) {
			System.out.println("Inside MyThread-2: " + i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread1 t1 = new Mythread1();
		Mythread2 t2 = new Mythread2();
		t1.start();
		for (int i = 101; i <= 200; i++) {
			System.out.println("Inside Main Thread: " + i);
		}
		t2.start();

	}

}
