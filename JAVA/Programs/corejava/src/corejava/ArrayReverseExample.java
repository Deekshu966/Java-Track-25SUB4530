package corejava;

public class ArrayReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {10, 20, 30, 40, 50, 12, 19,21};  // 50 40 30 20 10
		int start = 0;
		int end = numbers.length - 1;
		
		while (start <  end) {
			// swap numbers[start] and numbers[end]
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            start++;
            end--;
        }
		
		System.out.println("Reversed array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		}

	}

