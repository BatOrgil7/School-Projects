import java.util.Scanner ;

public class LastNameFirstName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Last name and your First name");
		
		String s = input.nextLine();
		int k = s.indexOf(" ");
		
		String LastName = s.substring(0, k);
		String FirstName = s.substring(k);
		System.out.println("Your first name is " + FirstName + ", and your last name is " + LastName);
	}
}