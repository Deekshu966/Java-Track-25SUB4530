package corejava;

public class ElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int avgr = 44;
		
		if (avgr >= 80)
			System.out.println("Distinction");
		else if ( avgr >=70 && avgr < 80)
			System.out.println("First Class");
		else if (avgr >= 60 && avgr < 70)
			System.out.println("Second Class");
		else if (avgr >= 50 && avgr < 60)
			System.out.println("Third Class");
		else
			System.out.println("Fail");

	}

}
