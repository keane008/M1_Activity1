package ph.com.bpi.hello;
import java.util.Scanner;

public class ACTIVITY5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int sum = 0000;
        for(int num = 1;num <= 50; num++) {
        	sum = sum + num;
        }
        System.out.println("Sum = " + sum);
        scanner.close();
	}
}
