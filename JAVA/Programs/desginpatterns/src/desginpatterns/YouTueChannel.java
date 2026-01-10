package desginpatterns;

import java.util.ArrayList;
import java.util.List;

public class YouTueChannel implements Subject {
	
	List<Observer> observers = new ArrayList<>();
	String video;

	@Override
	public void subscribe(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unsubsrcibe(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	public void uploadVideo(String video) {
		this.video=video;
		notifyObservers();
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers)
			o.update(video);
	}

}
