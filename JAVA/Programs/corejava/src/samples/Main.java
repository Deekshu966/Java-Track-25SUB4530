package samples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalculator ic = new InterestCalculator();
		double interest1 = ic.calculateInterest(10000, 5);
		System.out.println("Interest for regular account: " + interest1);
		double interest2 = ic.calculateInterest(10000, 5, true);
		System.out.println("Interest for senior citizen account: " + interest2);
		double interest3 = ic.calculateInterest(10000, 5, 1);
		System.out.println("Interest for fixed deposit type 1(Short-Term): " + interest3);
		double interest4 = ic.calculateInterest(10000, 5, 2);
		System.out.println("Interest for fixed deposit type 2(Long-Term): " + interest4);

	}

}
