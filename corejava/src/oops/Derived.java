package oops;

public class Derived extends Base{
	
	int a;
	int x;
	int y;
	Derived() {
		a = 30;
		x= 1000;
		y= 2000;
	}
	
	public void showDerived() {
		System.out.println("X: " + super.x);
		System.out.println("Y: " + super.y);
		System.out.println("A: " + a);
	}

	public void show() {
		super.show();
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}

// Derived --> a,x, y , x, y