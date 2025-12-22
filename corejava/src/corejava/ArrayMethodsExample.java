package corejava;
import java.util.Arrays;

public class ArrayMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5, 2, 8, 1, 3};
		System.out.println("Original array: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));
		int index = Arrays.binarySearch(a, 10);
		// if index is neagtive means element is not found in the array
		if (index >= 0 )
			System.out.println("The value  found at index: " + index);
		else
			System.out.println("The value not found in the array");
		
		int x1[] = {1,2,3};
		int x2[] = {1,2,3,4,5,6,7,8};
		boolean result = Arrays.equals(x1, x2);
		System.out.println("Are Arrays equal: " + result);
		
		
		int copy[] = Arrays.copyOf(x1, 5);
		System.out.println("Copied Array: " + Arrays.toString(copy));
		
		int copyRange[] = Arrays.copyOfRange(x2, 1, 4);
		System.out.println("Copied Range Array: " + Arrays.toString(copyRange));
		
		System.out.println("The copy array has"+ Arrays.toString(copy));
		System.out.println("Filling array with 10");
		Arrays.fill(copy, 10); // fill all elements with 10
        System.out.println("Filled Array: " + Arrays.toString(copy));	
        
        System.out.println(x1);
        System.out.println(Arrays.toString(x1));
        
        System.out.println("Printing using for loop");
        for (int i =0 ;i<x1.length;i++)
        	System.out.print(x1[i]+" ");
        
        System.out.println("Printing using enchanced for loop");
        for( int i : x1)
        	System.out.print(i+" ");
		float[][] rates ={{2.3f,4.5f,6.7f,8.9f},
							{2.3f,4.5f,6.7f,8.9f} 
							};
	
		System.out.println(rates);

	}

}
