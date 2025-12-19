package corejava;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b ){
			if(a > c){
				System.out.println("a is Bigger");
			}
			else{
				System.out.println("c is Bigger");
			}
		}
		else {
			if(b > c){
				System.out.println("b is Bigger");
			}
			else{
				System.out.println("c is Bigger");
			}
		}
	}

}
