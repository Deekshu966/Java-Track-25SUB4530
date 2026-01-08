package generics;

class Box<T>{
	private T data;
	void set(T data){
		this.data = data;
	}
	T get(){
		return data;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = new Box();  // error
		Box<String> box1 = new Box();
        box.set(100);  // error
        System.out.println(box.get()); // error
        box1.set("Hello");
        System.out.println(box1.get());

	}

}
