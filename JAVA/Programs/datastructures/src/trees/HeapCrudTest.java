package trees;

public class HeapCrudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeapCrud heap = new HeapCrud(10);
		heap.insert(20);
		heap.insert(15);
		heap.insert(30);
		heap.insert(40);
		System.out.println("Peek root: " + heap.peek()); // Should print 40
		heap.display();

	}

}
