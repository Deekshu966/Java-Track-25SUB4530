package exeptions;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10;
			int b = 9;
			int c = a / 0;
			String str = "Hello";
			System.out.println(str.charAt(2));
			String s = "hello";
			int[] a1= {1,3,4};
			System.out.println(s.length());
			System.out.println(a1[5]);
			System.out.println("Result: " + c);
			System.out.println("After the result");
		}
		
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception caught");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bounds Exception caught");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		}
		catch(RuntimeException e) {
			System.out.println("Runtime Exception caught");
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code...");

	}

}
