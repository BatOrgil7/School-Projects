/* Course: CSCI 111, Section 1
 Student Name: Bat-Orgil Erdenebat
 Student ID: 10985687
 Program 3
 Due Date: Monday (Oct. 16) by 5pm
In keeping with the Honor Code of UM, I have neither given nor received
 inappropriate assistance from anyone other than the TA or the instructor.
Program Description: This program is to calculate how many burns does the spacecraft need to reach the jupiter and how many meters have traveled and left after each burns.
*/
// importing the util.
import java.util.Scanner;
//naming the program and main method.
public class JupiterErdenebat {
	public static void main(String[] args) {
		//declaring the variables.
		double burn = 0, traveled, meterstogo ; 
		Scanner input = new Scanner(System.in) ;
		//asking the person to enter the kilometer.
		System.out.print("Enter the distance to be traveled in kilometers: ") ;
		double kilometers = input.nextDouble() ;
		//converting km to meters
		double meters = kilometers * 1000 ;
		//making a while loop to calculate how many burns need to be used.
		while (meters >= 35) {
			//statements.
			burn++ ;
			traveled = meters * 0.6 ;
			meterstogo = meters - traveled ;
			System.out.printf("\n" + "Burn " + (int) burn + ": Traveled %.2f meters", traveled) ;
			System.out.printf("\n" + "\t" + "%.2f meters left ", meterstogo) ;
			meters = meterstogo ;
			traveled = meters * 0.6 ;
			meterstogo = meters - traveled ;
		} 
		//after the spacecraft reached jupiter within km outputting the results.
		System.out.println("\n" + "\n" + "You made it to Jupiter in " + (int)burn + " burns") ;
	}
}