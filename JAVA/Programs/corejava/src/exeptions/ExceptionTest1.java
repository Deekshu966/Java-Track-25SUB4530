package exeptions;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;

			String str = "Hai";
			System.out.println(str.charAt(29));
			int c = a / b;

			System.out.println("Result: " + c);
			System.out.println("After the result is printed");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bounds Exception caught");
		} finally {
			System.out.println("Finally block is always executed");
		}
	}

}
