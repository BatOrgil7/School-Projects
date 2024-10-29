import java.util.Scanner ;

public class MyTriangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first side of the triangle: ") ;
	double s1 = input.nextDouble() ;
	System.out.println("Enter second side of the triangle: ") ;
	double s2 = input.nextDouble() ;
	System.out.println("Enter third side of the triangle: ") ;
	double s3 = input.nextDouble() ;
	
	boolean t = isValid(s1, s2, s3);
	if (t){
	double a = area(s1, s2, s3);
	System.out.printf("For a triangle of sides %.2f,%.2f and %.2f",s1,s2,s3);
	System.out.printf("\nArea = %.2f square units",a);
	}
	else 
	System.out.println("Invalid triangle!");
	}

	public static boolean isValid (double side1, double side2, double side3){
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		}
		return false ;
	}
	public static double area (double side1, double side2, double side3) {
	
	double s = (0.5) * (side1 + side2 + side3) ;
	double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))) ;
	return area ;
	}

}

