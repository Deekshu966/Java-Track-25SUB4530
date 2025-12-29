package exeptions;

public class Vote {
	
	public void checkAge(int age) throws 
	InvalidAgeException, NegativeAgeException{
		if (age < 0) {
			throw new NegativeAgeException();
		} else if (age > 100) {
			throw new InvalidAgeException();
		} else if (age > 0 && age < 18) 
			System.out.println("Not Eligbile to vote");
			else
				System.out.println("Eligbile to vote");
		}
	}


