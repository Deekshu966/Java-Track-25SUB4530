package corejava;

public class Doctor {
	
	int docid;
	String name;
	static String hospital="City Hospital"; // Static Variable"
	Doctor(){
		docid=1;
        name="Dr. Smith";
    
	}
	
	public static void showHospital() {
		System.out.println("Hospital: " + hospital);
		//System.out.println("Doctor ID: " + docid);
		//System.out.println("Doctor Name: " + name);
	}
	
	public void display() {
		System.out.println("Doctor ID: " + docid);
		System.out.println("Doctor Name: " + name);
		System.out.println("Hospital: " + hospital);
	}

}
