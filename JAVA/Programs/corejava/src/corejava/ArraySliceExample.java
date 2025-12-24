package corejava;
import java.util.Scanner;
public class ArraySliceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nos[] = {64, 34, 25, 12, 22, 11, 90,10,19,56,24,16}; 
		int[] sliceArray = new int[15];
		Scanner sc = new Scanner(System.in);
		int counter=0;
		System.out.println("Enter start index  to slice");
		int startIndex = sc.nextInt();
		System.out.println("Enter end index to slice");
		int endIndex = sc.nextInt();
		if (startIndex < 0 || endIndex >= nos.length || startIndex > endIndex) {
			System.out.println("Invalid indices for slicing.");
			return;
		}
		else {
			
			for (int i = startIndex; i <= endIndex; i++) {
				sliceArray[counter]= nos[i];
				counter++;
			}
		}
		
		System.out.println("Sliced array:");
		for (int i = 0; i < counter; i++) {
			System.out.print(sliceArray[i] + " ");
		}
		

	}

}
