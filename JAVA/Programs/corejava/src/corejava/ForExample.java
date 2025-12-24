package corejava;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello");
		}

		for (var i = 1; i <= 10; i++) {
			System.out.println("Hello");
		}
		System.out.println("Loop using 1,2,3,4,5 array");
		int values1[] = { 1, 2, 3, 4, 5 };
		for (int x : values1) {
			// System.out.println("Hello");
			System.out.println(x);
		}
		System.out.println("Loop using -1,0,31,41,-15 array");
		int values2[] = { -1, 0, 31, 41, -15 };
		for (int x : values2) {
			// System.out.println("Hello");
			System.out.println(x);
		}

	}

}
