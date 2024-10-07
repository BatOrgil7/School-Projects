import java.util.Scanner;
public class Cramer {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = input.nextDouble();
		System.out.println("Enter b: ");
		b = input.nextDouble();
		System.out.println("Enter c: ");
		c = input.nextDouble();
		System.out.println("Enter d: ");
		d = input.nextDouble();
		System.out.println("Enter e: ");
		e = input.nextDouble();
		System.out.println("Enter f: ");
		f = input.nextDouble();
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		if (
		0 == a * d - b * c) 
		System.out.println("The equation has no solution") ;
		else 
			System.out.println("x is " + x + "and y is " + y);
	}
}
