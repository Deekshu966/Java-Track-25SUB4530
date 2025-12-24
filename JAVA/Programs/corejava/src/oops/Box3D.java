package oops;

public class Box3D extends Box2D{
	
	
	int height;
	
	Box3D(){
		super(10, 20);
		height = 30;
	}
	

	Box3D(int length, int width, int height){
		//super(length,width);
		this.height=height;
	}

	public int volume() {
		return length * width * height;
	}

}
// Square 

//Box3D box = new Box3D();