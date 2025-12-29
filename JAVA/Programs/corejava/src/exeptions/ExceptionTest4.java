package exeptions;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		String str = "Hai";
		try {
			
			System.out.println(str.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bounds Exception caught");
		}
		finally {
			System.out.println("Finally block for String index is always executed");
		}
		try {
			int c = a / b;

			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught");
		}
		finally {
			System.out.println("Finally block for Arithmetic exception is always executed");
		}
		System.out.println("After the result is printed");

	}

}
