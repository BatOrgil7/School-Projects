import java.util.Scanner ;
public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle cir = new Circle();
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the radius of the circle: ") ;
		double r = input.nextDouble() ;
		cir.setRadius(r);
		double R = cir.getRadius();
		double A = cir.getArea();
		double D = cir.getDiameter();
		double C = cir.getCircumference();
		
		System.out.printf("The area of the circle is: %.2f", A) ;
		System.out.printf("\nThe diameter of the circle is: %.2f", D) ;
		System.out.printf("\nThe circumference of the circle is: %.2f", C) ;
	}
}
		