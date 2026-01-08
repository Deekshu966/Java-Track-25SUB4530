package samples;

public class InterestCalculator {
	
	public double calculateInterest(double balance, int years) {
		
		return balance * 0.04 * years;
	}
	
	public double calculateInterest(double balance, int years, boolean isSeniorCitizen) {
		return balance * 0.05 * years;
	}
	
	public double calculateInterest(double balance, int years, int depositType) {
		switch(depositType) {
		case 1:
			return balance * 0.06 * years;
			
		case 2:
			return balance * 0.075 * years;
		}
		
		return 0;
	}
}
