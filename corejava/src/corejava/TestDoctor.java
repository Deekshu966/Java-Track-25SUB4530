package corejava;

public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Doctor.docid=100; // Non static variable cannot be called on the class directly
		
		Doctor doc1 = new Doctor();
		doc1.docid=101;
		doc1.display();
		
		Doctor.showHospital(); // Static method called using class name
		//Doctor.display(); //Non static method cannot be alled on classname directly
		
		
		

	}

}
