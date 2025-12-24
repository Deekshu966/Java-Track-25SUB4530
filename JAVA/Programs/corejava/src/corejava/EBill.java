package corejava;
import java.util.Scanner;
public class EBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// switch is used to calculate the bill
		System.out.println("Enter the connection type");
		String ctype = sc.nextLine();
		System.out.println("Enter the units consumed");	
		int units = sc.nextInt();
		int billamount = 0;
		int rpu = 0;
		switch(ctype) {
		case "Domestic": if (units > 100)
			                rpu = 5;
                        else if( units >= 50 && units <= 100 )
                            rpu = 3;
                        else
                        	rpu =2;
                        break;
		case "Commercial": if (units > 100)
							rpu = 7;
        				  else if( units >= 50 && units <= 100 )
        					rpu = 5;
        				  else
        					rpu =3;
        				break;
        				
		case "Agriculture": if (units > 100)
            					rpu = 3;
        					else if( units >= 50 && units <= 100 )
        						rpu = 2;
					        else
					        	rpu =1;
							break;
							
		default:
							System.out.println("Invalid connection type");
							break;
		}
		billamount = units * rpu;
		System.out.println("Your electricity bill amount is: " + billamount);
		}

}
