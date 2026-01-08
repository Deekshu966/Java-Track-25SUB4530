package interfaces;

class Sample{
	public static int addition(int a, int b) {
		return a+b;
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maths m = (a,b)->a+b;
		Sample s = new Sample();
		
		// creating a object using method reference
		//Maths m = s::addition; This is assigned only when the method is non static
		Maths m = Sample::addition; // This is assigned with class only when the method is static
		System.out.println("Using Lambda Expression: "+m.add(5, 10));

	}

}
