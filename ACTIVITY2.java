package ph.com.bpi.hello;
import java.util.Scanner;

public class ACTIVITY2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();
        
        int ageInt = Integer.parseInt(age);
        double ageDouble = (double) ageInt;
        System.out.println("Your age in integer: " + ageInt);
        System.out.println("Your age in double: " + ageDouble);

        scanner.close();
	}


}
