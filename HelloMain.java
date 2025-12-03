/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
import java.lang.*;
/**
 * 
 */
public class HelloMain {
	//variables
    static Scanner   scanner = new Scanner(System.in);
	static String    studentName; //student name
	static String    studentId;   //student id
	static int       numberOfSubjects; //number of subjects
	static double[]  gradesForSub; //grades for subject
	static double    sumOfGrades; //sum of all grades
	static double    averageOfgrades; //average of grades
	static String    status; //pass of failed
	
	//display 
	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        mainMenu();
        scanner.close();

	}
	//THIS METHOD WILL PRINT MAIN MENU AND TAKE THE CHOICE FROM THE USER
	public static void mainMenu(){
        System.out.print("===== STUDENT GRADING SYSTEM =====\n"
        		+ "A - ADD STUDENT INFORMATION\n"
        		+ "B - COMPUTE STUDENT AVERAGE\n"
        		+ "C - DISPLAY STUDENT INFORMATION\n"
        		+ "D - EXIT\n"
        		+ "Enter your Choice: ");   
        enterChoice();
	}// end of main menu method
	public static void enterChoice(){
        char choice = scanner.next().charAt(0);
        char LowerChoice = Character.toLowerCase(choice);
        switch(LowerChoice) {
        	case 'a':
        		addStudentInfo();
        		mainMenu();
        		break;
        	case 'b':
        		computeStudentInfo();
        		mainMenu();
        		break;
        	case 'c':
        		displayStudentInfo();
        		mainMenu();
        		break;
        	case 'd':
        		System.out.println("==== EXIT ====");
        		System.exit(0);
        }
	}
	public static void addStudentInfo() {
		scanner.nextLine();
		
		System.out.print("Enter student name: ");
		studentName = scanner.nextLine();

		System.out.print("Enter student ID: ");
		studentId = scanner.nextLine();
		
		System.out.print("Enter Number of Subjects: ");
		numberOfSubjects = scanner.nextInt();
		
		gradesForSub = new double[numberOfSubjects];
		
		for(int i = 0; i < numberOfSubjects; i++) {
			System.out.print("Enter grade for subject " + (i + 1) + " :");
			gradesForSub[i] = scanner.nextDouble();
		}
		System.out.print("===== STUDENT SAVED ======\n");
		
	}// end of add student info method
	public static void computeStudentInfo() {
		for(int i = 0; i < numberOfSubjects; i++) {
			sumOfGrades += gradesForSub[i];
		}
		averageOfgrades = sumOfGrades / numberOfSubjects;
		if(averageOfgrades >= 75) {
			status = "PASS";
		}
		else {
			status = "FAILED";
		}
		System.out.println("Average: " + averageOfgrades);
		System.out.println("Status: " + status);
	}// end of compute student info method
	public static void displayStudentInfo() {
		System.out.print("===== STUDENT SUMMARY =====\n" +
						"Student Name: " + studentName + "\n" +
				        "Student ID: " + studentId + "\n" +
						"Average: " + averageOfgrades + "\n" +
				        "Status: " + status + "\n============================\n");
	}//end of display student info method

}
