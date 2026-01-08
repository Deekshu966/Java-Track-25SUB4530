package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class JavaReflectionExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		// TODO Auto-generated method stub
		
		Class<?> cls = Student.class;
		Method[] methods1 = cls.getMethods();
		System.out.println("-----All Methods in Class-----");
		for(Method m: methods1) {
			System.out.println("Method Name: "+m.getName());
		}

		System.out.println("-----Declared Methods-----");
		Method[] methods2 = cls.getDeclaredMethods();
		for(Method m: methods2) {
			System.out.println("Method Name: "+m.getName());
			
		}
		
		try {
		Method m = cls.getMethod("testing");
		System.out.println("Method Name: "+m.getName());
	} catch (NoSuchMethodException e) {
		System.out.println(e);
	}
		
		try {
			Method m = cls.getDeclaredMethod("test1");
			System.out.println("Method Name: "+m.getName());
		} catch (NoSuchMethodException e) {
			System.out.println(e);
		}
		
		Method m = cls.getDeclaredMethod("display");
		System.out.println("Method Name: "+m.getName());
		System.out.println("Return Type: "+m.getReturnType());
		System.out.println("Modifiers: "+Modifier.toString(m.getModifiers()));
		
		Method m1 = cls.getDeclaredMethod("setHtno", int.class);
		Parameter[] params = m1.getParameters();
		
		for (Parameter p : params) {
			System.out.println("Parameter Name: " + p.getName());
			System.out.println("Parameter Type: " + p.getType());
		}
		
		Object obj = cls.getDeclaredConstructor().newInstance();
		Method m2 = cls.getDeclaredMethod("display");
		m2.setAccessible(true);
		m2.invoke(obj);

	}

}
