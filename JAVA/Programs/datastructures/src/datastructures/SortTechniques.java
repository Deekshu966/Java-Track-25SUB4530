package datastructures;

public class SortTechniques {
	
	public int[] bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					// swap a[j] and a[j+1]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
	
	public int[] mergeSort(int[] a) {
		if (a.length < 2) {
			return a;
		}
		int mid = a.length / 2;
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
		for (int i = mid; i < a.length; i++) {
			right[i - mid] = a[i];
		}

		return merge(mergeSort(left), mergeSort(right));
	}
	
	int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}

		while (i < left.length) {
			result[k++] = left[i++];
		}

		while (j < right.length) {
			result[k++] = right[j++];
		}

		return result;
	}

}
