package sortnsearch;

public class TestSortingTecniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortTechniques st = new SortTechniques();
		int a[] = {64, 34, 25, 12, 22, 11, 90, 31};
		System.out.println("Unsorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int sortedArray[] = st.quickSort(a, 0, a.length - 1);
		//int sortedArray[] = st.bubbleSort(a);
		//int sortedArray[] = st.mergeSort(a);
		System.out.println("Sorted array");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}

	}

}
