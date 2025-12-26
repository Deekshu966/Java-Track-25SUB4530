package interfaces;

public class TestMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Maths m = new Maths();
		//MathsImpl m = new MathsImpl();
		Maths m = (a,b)->a+b;
		Area a = radius -> 3.14*radius*radius;
		System.out.println("Addition: " + m.add(100, 260));
		System.out.println("Circle Area: " + a.calCircleArea(5));
	}

}
