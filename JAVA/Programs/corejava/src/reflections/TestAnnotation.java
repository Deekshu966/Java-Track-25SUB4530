package reflections;

import java.lang.reflect.Method;

class Demo{
	
	@Myannotation(value="DemoClass",version=2)
	public void process() {
		System.out.println("Process method in Demo class");
	}
}
public class TestAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
		Method m = Demo.class.getMethod("process");
	
		Myannotation myanno = m.getAnnotation(Myannotation.class);
		System.out.println("Value: "+myanno.value());
		System.out.println("Version: "+myanno.version());

	}

}
