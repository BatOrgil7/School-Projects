import java.util.Scanner ;

public class MajorAndStatus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String y = "" ;
		System.out.println("Enter two character; your first character indicates your major and your second character indicates your year. M for Mathematics, C for Computer Science, I for Information Technology and your year");
		String s = input.nextLine();
		char major = s.charAt(0);
		char year = s.charAt(1);
		switch (year) {
			case '1': y = "Freshman";
			break;
			case '2': y = "Sophomore";
			break;
			case '3': y = "Junior";
			break;
			case '4': y = "Senior";
			break;
		}
		switch (major) {
			case 'M': System.out.println("Mathematics " + y);
			break;
			case 'C': System.out.println("Computer Science " + y);
			break;
			case 'I': System.out.println("Information Technology" + y);
			break;
			default: System.out.println("Invalid input");
		}
	}
}
		
			
		