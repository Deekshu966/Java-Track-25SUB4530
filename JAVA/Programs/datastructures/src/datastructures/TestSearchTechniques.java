package datastructures;

import java.util.Scanner;

public class TestSearchTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchTechniques st = new SearchTechniques();
		int a[] = {10,20,30,40,50,60,70,80,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element");
		int x = sc.nextInt();
		System.out.println("Enter the sorting technique: 1.Linear Search "
				+ "Binary Search  3.Jump Search");
		int choice = sc.nextInt();
		int k = -1;
		switch (choice) {
		case 1:
			k =st.linearSearch(a, x);
			break;
		case 2:
			k = st.binarySearch(a, x);
			break;
		case 3:
			k = st.jumpSearch(a, x);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		if(k == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+k);
	}

}
