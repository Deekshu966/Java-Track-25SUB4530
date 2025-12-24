package oops;

public class Box2D {
	
	int length;
	int width;
	
	Box2D() {
		length = 1;
		width = 2;
	}
	
	Box2D(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

}
// Box2D box = new Box2D(); X 
// Box2D box = new Box2D(10, 20);
//Box2D box = new Box2D(10); X 