import java.util.Scanner ;

public class Grades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int count = 0 ;
		double avarage = 0;
		int total = 0;
		while (count < 10) {
			System.out.println("Enter 10 grades") ;
			int grade = input.nextInt();
			total = total + grade;
			avarage = total / 10 ;
			count++;
		}
		System.out.println("Total " + total + "Avarage: " + avarage);
	}
}