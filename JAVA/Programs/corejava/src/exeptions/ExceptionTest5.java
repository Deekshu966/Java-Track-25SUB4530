package exeptions;

public class ExceptionTest5 {
	public static void main(String args[]) {
		int a = 100, b = 2;
		try {
			if (a < b) {
				throw new ArithmeticException("a is less than b");
			} else {
				throw new StringIndexOutOfBoundsException("a is greater than b");
			}
		} catch (ArithmeticException e) {
			System.out.println("Caught Arithmetic Exception: " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught String Index Out Of Bounds Exception: " + e.getMessage());
		}
	}

}
