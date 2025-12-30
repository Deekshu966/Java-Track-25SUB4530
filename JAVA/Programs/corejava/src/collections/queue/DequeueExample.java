package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dq = new ArrayDeque();
		dq.add(10);
		dq.add(20);
		System.out.println("Deque: " + dq);
		dq.addFirst(5);
		System.out.println("After adding 5 at first position");
		System.out.println("Deque: " + dq);
		dq.addLast(30);
		System.out.println("After adding 30 at last position");
		System.out.println("Deque: " + dq);
		dq.removeFirst();
		System.out.println("After removing first element");
		System.out.println("Deque: " + dq);
		dq.removeLast();
		System.out.println("After removing last element");
		System.out.println("Deque: " + dq);
		
	

	}

}
