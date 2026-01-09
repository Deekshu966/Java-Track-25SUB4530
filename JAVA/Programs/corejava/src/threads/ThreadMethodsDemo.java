package threads;

class MThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("State of Child Thread :" +this.getState());
			System.out.println("Child Thread: " + i);
			
		}
	}
}
public class ThreadMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThread t1 = new MThread();
		MThread t2 = new MThread();
		t1.start();
		System.out.println("Name of the thread: " + t1.getName());
		System.out.println("Name of the thread: " + t2.getName());
		t1.setName("MyNewThread");
		System.out.println("Name of the thread: " + t1.getName());
		System.out.println("ID of the thread: " + t1.getId());
		System.out.println("Priority of the thread t1: " + t1.getPriority());
		System.out.println("Priority of the thread t2: " + t2.getPriority());
		t1.setPriority(7);
		System.out.println("Priority of the thread: " + t1.getPriority());
		System.out.println("Is t1 alive? " + t1.isAlive());
		System.out.println("State of the Thread :"+t1.getState() );
		System.out.println("Is interrupted: "+t1.isInterrupted());
			

	}

}
