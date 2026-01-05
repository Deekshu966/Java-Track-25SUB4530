package trees;

public class HeapCrud {
	int [] heap;
	int size;
	int capacity;
	public HeapCrud(int capacity) {
		this.capacity = capacity;
		heap= new int[capacity];
		this.size = 0;
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	
	private int leftChild(int index) {
		return 2 * index + 1;
	}
	
	private int rightChild(int index) {
		return 2 * index + 2;
	}
	
	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public void insert(int value) {
		if (size == capacity) {
			throw new IllegalStateException("Heap is full");
		}
		heap[size] = value;
		int current = size;
		size++;

		while (current > 0 && heap[current] > heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		
	}
	
	public int peek() {
		if (size == 0) {
			throw new IllegalStateException("Heap is empty");
		}
		return heap[0];	
	}
	
	public int deleteRoot() {
		if (size == 0) {
			throw new IllegalStateException("Heap is empty");
		}
		int rootValue = heap[0];
		heap[0] = heap[size - 1];
		size--;
		heapifyDown(0);
		return rootValue;
	}

	private void heapifyDown(int i) {
		// TODO Auto-generated method stub
		int largest = i;
		int left = leftChild(i);
		int right = rightChild(i);
		if (left < size && heap[left] > heap[largest]) {
			largest = left;
		}
		if (right < size && heap[right] > heap[largest]) {
			largest = right;
		}
	
	if(largest!=i) {
		swap(i, largest);
		heapifyDown(largest);
	}
	
	}
	
	public void heapifyUp(int i) {
		// TODO Auto-generated method stub
		while (i > 0 && heap[i] > heap[parent(i)]) {
			swap(i, parent(i));
			i = parent(i);
		}

	}

	public void display() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
		
		
	}

}
