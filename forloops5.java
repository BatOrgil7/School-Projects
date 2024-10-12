import java.util.Scanner;

public class forloops5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String s = input.nextLine();
		int x = s.lastIndexOf(s);
		int charAt = '0';
		for (s.charAt(0); charAt < x ; charAt++) {
			System.out.println("charAt");
		}
	}
}