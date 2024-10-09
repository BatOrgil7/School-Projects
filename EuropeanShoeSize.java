import java.util.Scanner;

public class EuropeanShoeSize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenght of your foot in inches: ");
		
		double inch = input.nextInt();
		double cm = inch / 2.54;
		double size = 1.5 * (cm + 1.5 * cm);
		System.out.println("European shoe size is: " + size);
	}
}