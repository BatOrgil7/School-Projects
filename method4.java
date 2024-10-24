import java.util.Scanner;

public class method4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer");
		int x = input.nextInt();
		System.out.print("Enter second integer");
		int y = input.nextInt();
		
		int result = twoInts(x, y);
		