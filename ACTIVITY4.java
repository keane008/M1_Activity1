package ph.com.bpi.hello;
import java.util.Scanner;

public class ACTIVITY4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter your Age: ");
        String sAge = scanner.nextLine();
        
        int age = Integer.parseInt(sAge);
        
        if(age < 18) {
        	System.out.print("Minor");
        }
        else if(age >= 18 && age <= 59) {
        	System.out.print("Adult");
        }
        else {
        	System.out.print("Senior");
        }

        scanner.close();

	}
}
