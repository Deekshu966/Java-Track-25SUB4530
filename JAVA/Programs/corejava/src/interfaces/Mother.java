package interfaces;

public interface Mother {
	
	public void habit3();
	public void habit4();

	default void cooking() {
		System.out.println("Cooking food");
	}

}
