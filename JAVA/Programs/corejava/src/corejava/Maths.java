package corejava;

public class Maths {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;  // intialization
		int b=20;
		a = 10 ; // assignment
		int c = a+b;  // declaration + intialization + assignment
		System.out.println("Maths Class");
		System.out.println("The sum is c");
		
		System.out.println("The sum of "+a+" and "+b+" is "+c);
		System.out.println("The difference is "+(a-b));
		System.out.println("The product is "+(a*b));
		float d = (float)a/b;
		System.out.println("The quotient is "+d);
		System.out.println("The reminder is "+(a%b));
		System.out.println(a+" "+b);
		System.out.println(a == b);
		a = b;
		System.out.println(a+" "+b);
		System.out.println(a == b);
		
		a= 10;
	    b= 20;
	    c = 30;
	    d = 40;
	    System.out.println(a<b && b<c);  // true && true = true
	    System.out.println(a<b && b>c);  // true && false = false
	    System.out.println(a>b && b>c);  // false && false = false
	    System.out.println(a<b || b<c);  // true || true = true
	    System.out.println(a<b || b>c);  // true || false = true
	    System.out.println(a>b || b>c);  // false || false = false
		
		
		
	}
}
