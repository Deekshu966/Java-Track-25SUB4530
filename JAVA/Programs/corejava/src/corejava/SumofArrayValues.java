package corejava;
import java.util.Arrays;// all the classes and interfaces
import java.util.Scanner;
public class SumofArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] evenArray = new int[5];
		int [] oddArray = new int[5];
		int[] numbers = {1,4,19,20,47,32};
		int sum = 0;
		int odd=0, even =0, evenCount=0, oddCount=0;
		for (int num : numbers) {
			sum += num; // sum = sum + num
		}
		System.out.println("Sum of array values: " + sum);
		
		int big = numbers[0]; // big =47
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > big) {
				big = numbers[i];
			}
		}
		System.out.println("Biggest value in the array: " + big);
		
		for (int num : numbers) {
			if (num % 2 == 0) {
				even += num;
				evenArray[evenCount] = num;
				evenCount++;
				
			} else {
				odd += num;
				oddArray[oddCount] = num;
				oddCount++;
			}
		}
		System.out.println("Count of even numbers: " + evenCount);
		System.out.println("Sum of even numbers: " + even);
		System.out.println("Count of odd numbers: " + oddCount);
		System.out.println("Sum of odd numbers: " + odd);
		System.out.print("Even numbers in the array: "+Arrays.toString(evenArray));
		System.out.print("\nOdd numbers in the array: "+Arrays.toString(oddArray));
		
		boolean isFound = false;
		System.out.println("Enter the search value");
		int searchValue = sc.nextInt();
		for (int num : numbers) {
			if (num == searchValue) {
				isFound = true;
				break;
			}
		}
		
		if(isFound)
			System.out.println("Value found in the array");
		else
			System.out.println("Value not found in the array");
		

	}

}
