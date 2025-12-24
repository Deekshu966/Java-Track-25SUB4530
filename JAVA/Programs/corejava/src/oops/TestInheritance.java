package oops;

public class TestInheritance extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Base base = new Base();
		Derived derived = new Derived();
		derived.show();
		//derived.showDerived();
		 Box3D box = new Box3D();
		//Box3D box = new Box3D(100,200,300);
		System.out.println("Volume of Box3D: " + box.volume());
		System.out.println("Area of Box3D: " + box.area());

	}

}
