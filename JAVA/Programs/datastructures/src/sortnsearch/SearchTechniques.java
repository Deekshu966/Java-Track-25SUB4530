package sortnsearch;

public class SearchTechniques {

	public int binarySearch(int[] a,int x){
		int low=0, high = a.length-1;
	    while(low <= high){ 
			int mid = (low+high)/2;
			if( a[mid]==x)
				return mid;
			else if (x < a[mid] )
				high = mid -1;
			else
				low = mid + 1;
	     }
	     return -1;
	}

	public int linearSearch(int[] a,int x) {
	for(int i=0;i<a.length;i++){
		if( x == a[i]){

			return i;
			
		}
	}
	return -1;
	}
	
	public int jumpSearch(int[] a, int x) {
		int n = a.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;

		while (a[Math.min(step, n) - 1] < x) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}

		while (a[prev] < x) {
			prev++;
			if (prev == Math.min(step, n))
				return -1;
		}

		if (a[prev] == x)
			return prev;

		return -1;
	}

}
