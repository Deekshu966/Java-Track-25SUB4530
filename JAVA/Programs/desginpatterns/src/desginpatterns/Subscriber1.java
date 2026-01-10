package desginpatterns;

public class Subscriber1 implements Observer {
	String name;
	public Subscriber1(String name) {
		this.name = name;
	}
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+ " notified with new Video -"+message);
		
	}

}
