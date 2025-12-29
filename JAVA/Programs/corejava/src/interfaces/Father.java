package interfaces;

public interface Father {
	
	public void habit1();
	public void habit2();

	default void familyTime() {
		System.out.println("Family time at Father");
	}

}
