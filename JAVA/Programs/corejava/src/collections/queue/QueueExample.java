package collections.queue;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(5);
		System.out.println("Priority Queue: " + pq);
		pq.remove();
		System.out.println("Priority Queue: " + pq);
		pq.remove();
		System.out.println("Priority Queue: " + pq);
		pq.add(1);
		System.out.println("Priority Queue: " + pq);
		pq.remove();
		System.out.println("Priority Queue: " + pq);
		//pq.peek();
		System.out.println("Peek Element: " + pq.peek());
		System.out.println("Priority Queue: " + pq);
		System.out.println("Poll Element: " + pq.poll());

	}

}
