package ph.com.bpi.hello;
import java.util.Scanner;

public class ACTIVITY3 {
    public static int computeDifference(int fInt, int sInt) {
        return fInt - sInt;
    }
    public static int computeProduct(int fInt, int sInt) {
        return fInt * sInt;
    }	
    public static int computeSum(int fInt, int sInt) {
        return fInt + sInt;
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter first integer: ");
        String firstInt = scanner.nextLine();
        
        System.out.print("Enter second integer: ");
        String secondInt = scanner.nextLine();
        
        int fInt = Integer.parseInt(firstInt);
        int sInt = Integer.parseInt(secondInt);
        
        int sum = computeSum(fInt,sInt);
        int diff = computeDifference(fInt,sInt);
        int prod = computeProduct(fInt,sInt);
        

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);

        scanner.close();

	}		
}
