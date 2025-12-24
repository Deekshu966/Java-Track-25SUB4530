package corejava;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1;
				switch (value) {
				    case 1:
				        System.out.println("One");
				        break;
				    case 2:
				        System.out.println("Two");
				        break;
				    default:
				        System.out.println("Invalid");
				}
				//This below version is from jdk12
				int day = 1;
				String result = switch (day) {
				    case 1 -> "Monday"; // multiple statments
				    case 3 -> "Tuesday";
				    case 10 -> "Wednesday";
				    default -> "Invalid day";
				};
				System.out.println(result);
				
				
				// This syntax is from jdk13
				int marks = 80;
				String grade = switch (marks / 10) {
				    case 9, 10 -> "A";
				    case 8 -> {
				        System.out.println("Good performance");
				        yield "B";
				    }
				    default -> "Fail";
				};
                System.out.println("Grade: " + grade);
                
                /*
                Object obj = "Hello";
                String str = new String("Hello");
                Integer i=  new Integer(10);

                String result1 = switch (obj) {
                    case Integer i1 -> "Integer value: " + i1;
                    case String s -> "String value: " + s;
                    default -> "Unknown type";
                };
                System.out.println(result1);
			*/
	}

}
