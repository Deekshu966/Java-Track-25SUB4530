package corejava;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nos[] = {64, 34, 25, 12, 22, 11, 90}; // 11 12 22 25 34 64 90
		 
		
		for (int i = 0; i < nos.length - 1; i++) {
			for (int j = 0; j < nos.length - i - 1; j++) {
				if (nos[j] > nos[j + 1]) {
					// swap nos[j] and nos[j+1]
					int temp = nos[j];
					nos[j] = nos[j + 1];
					nos[j + 1] = temp;
				}
			}
			
		}
		
		System.out.println("Sorted array:");
		for (int i = 0; i < nos.length; i++) {
			System.out.print(nos[i] + " ");
		}
	}

}
