package generics;

import java.util.List;

class Box2D<T extends Number>{
	private T data1;
    private T data2;
    
    Number getFirst(List<? extends Number> list) {
    	        
    	
    	return list.get(0);
    	        
    }
    void set(T data1, T data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    T getData1(){
        return data1;
    }
    T getData2(){
        return data2;
    }
}


class Box<T>{
	private T data;
	void set(T data){
		this.data = data;
	}
	T get(){
		return data;
	}
}
// for datatype in Generics, were E,T,K,V as placeholders
// for return type in Generics, we will R1,R2 etc


class Container<K,V> {
	private K key;
	private V value;

	void add(K key, V value) {
		this.key = key;
		this.value = value;
	}

	V retrieve(K key) {
		return value;
	}
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = new Box();  // error
		Box<String> box1 = new Box();
       // box.set(100);  // error
       // box.set(100000.234);
        System.out.println(box.get()); // error
        box1.set("Hello");
        System.out.println(box1.get());
        
        Container<Integer,Integer> c1 = new Container<>();
        c1.add(1, 100);
        System.out.println(c1.retrieve(1));

		// c1.add(1, "Hello"); since we have defined both K and V as Integer, we cannot
		// add String value

		Container<String, Integer> c2 = new Container<>();
		c2.add("One", 100);
		System.out.println(c2.retrieve("One"));
		
		
		Box2D<Integer> b1 = new Box2D();
		b1.set(10, 20);
		System.out.println("Data1: " + b1.getData1());
		System.out.println("Data2: " + b1.getData2());
		
		Box2D<Float> b2 = new Box2D<>();
		b2.set(10.234f, 20.3456f);
		System.out.println("Data1: " + b2.getData1());
		System.out.println("Data2: " + b2.getData2());
		
		Box2D<Double> b3 = new Box2D<>();
		b3.set(10000.2345, 20000.3456);
		System.out.println("Data1: " + b3.getData1());
		System.out.println("Data2: " + b3.getData2());
		/*
		Box2D<String> b4 = new Box2D<>();
		b4.set("Hello", "Hai");
		System.out.println("Data1: " + b4.getData1());
		System.out.println("Data2: " + b4.getData2());
		*/
		
		//List<Double> list = List.of(10.00,20.123,30.234,40.234,50.1);
		List<String> list = List.of("Hello","hi","swedan","norway");
		//b1.getFirst(list);
		//System.out.println("First Element from the list: " + n);
		
	}

}
