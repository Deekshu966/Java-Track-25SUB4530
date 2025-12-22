package corejava;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[3];
		int[] numbers = {10,20,30,40,50}; // static intialization
		float marks[] = new float[5];
		int[] list;
		
		System.out.println("Length of names array: " + names.length);
		System.out.println("Length of numbers array: " + numbers.length);
		System.out.println("Length of marks array: " + marks.length);
		//System.out.println("ength of list array: " + list.length);
		System.out.println(numbers[2]);
		System.out.println(numbers[4]);
		//System.out.println(numbers[10]);
		System.out.println("Array Example Completed");
		
		// Dynamic Initialization
		marks[0]= 98.5f;
		marks[1]= 88.5f;
		marks[2]= 78.5f;
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks at index " + i + ": " + marks[i]);
		}
		
		for (int num : numbers) {
			System.out.println("Number: " + num);
		}

	}

}
