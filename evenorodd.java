import java.util.Scanner ;

public class evenorodd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a number");
		int number = input.nextInt();
		int y;
		while (y != -1) {
			if (number % 2 == 0) {
				System.out.println("Even number");
			}
			else System.out.println("Odd number");
			System.out.println("-1 to exit");
			y = input.nextInt();
		}
	}
}
			