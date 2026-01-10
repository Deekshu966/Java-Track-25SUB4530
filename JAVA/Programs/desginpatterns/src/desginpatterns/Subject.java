package desginpatterns;

public interface Subject {
	
	void subscribe(Observer o);
	void unsubsrcibe(Observer o);
	void notifyObservers();

}
