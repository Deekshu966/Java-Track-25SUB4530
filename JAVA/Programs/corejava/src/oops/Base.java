package oops;

public class Base extends Object{
	
	int x;
	int y;
	Base(){
		x = 10;
		y = 20;
	}
	
	public void show() {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

	
}
