package corejava;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while( i < 5){
			System.out.println(i);
			i++;
		}
		System.out.println("After loop");
		
		int n = 189;
		int sum = 0;
		while ( n>0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		
		System.out.println("Sum of digits: " + sum);

		int data=0;
		
		do {
				System.out.println("Inside the while loop");
				data++;
		}while(data > 10);


	}

}
