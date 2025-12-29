package exeptions;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		super("Age cannot be more than hundred");
	}

}
