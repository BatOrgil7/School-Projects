import java.util.Scanner;

public class IntReverse {
	public static int reverse(int number) {
		int reversenum = 0;
		int digit;
		while (number != 0){
			digit = number % 10 ;
			reversenum = reversenum * 10 + digit;
			number /= 10;
		}
		return reversenum;
	}
	public static void main(String[] args) {
		int reversenum;
		int number;
		int digit;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ") ;
		number = input.nextInt() ;
		reversenum = reverse(number) ;
		System.out.println("The reversal of the number " + number + " is " + reversenum + ".") ;
	}
}
		
		