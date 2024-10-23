/* Course: CSCI 111, Section 1
 Student Name: Bat-Orgil Erdenebat
 Student ID: 10985687
 Program 5
 Due Date: Wednesday (Nov. 15) by 5pm.
In keeping with the Honor Code of UM, I have neither given nor received assistance from
 anyone other than the TA or the instructor.
Program Description: This program is for Driver's License Office to chack the License test and outputs the results (either passed or failed) and correct answers using arrays.
*/
//Importing required utility.
import java.util.Scanner ;

public class LicenseExamErdenebat {
	public static void main(String[] args) {
		//Declaring, initialyzing, creating the array of correctAnswers.
		char[] correctAnswers = {'A', 'D', 'C', 'B', 'A', 'B', 'A', 'D', 'C', 'A'} ;
		int answeredcorrectly = 0 ;	
		//Initializing arrays with input values. 
		Scanner scan = new Scanner(System.in);
		char[] inputAnswers = new char[10] ;
		for(int i = 0; i < inputAnswers.length; i++) {
			System.out.print("Enter your answer: ");
			String s = scan.nextLine();
			inputAnswers[i] = s.charAt(0) ;
			//Counting the correct answers.
			if(correctAnswers[i] == inputAnswers[i]) {
				answeredcorrectly += 1 ;
			}
		}
		//Showing the correct answers using loop.
		System.out.println("\nHere are the correct answers: ") ;
		for(int i = 0; i < correctAnswers.length; i++) {
			int q = i +1; 
			System.out.println("Question " + q + ": " + correctAnswers[i]) ;
		}			
		System.out.println("\nYou answered " + answeredcorrectly + " correctly.") ;
		if(answeredcorrectly < 7) {
			System.out.println("\nSorry, you didn't pass the exam, you have to correctly answer at least 7 questions to pass! \nTake the exam again next time!") ;
		}
	}
}
