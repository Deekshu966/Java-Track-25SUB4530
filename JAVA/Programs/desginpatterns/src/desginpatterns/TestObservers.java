package desginpatterns;

public class TestObservers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subscriber1 s1 = new Subscriber1("Praveen");
		Subscriber1 s2 = new Subscriber1("Kumar");
		YouTueChannel channel = new YouTueChannel();
		channel.subscribe(s1);
		channel.subscribe(s2);
		
		channel.uploadVideo("New Java Video");

	}

}
