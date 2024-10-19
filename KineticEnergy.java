import java.util.Scanner;

public class KineticEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter object's mass in kg") ;
		double mass = input.nextDouble() ;
		System.out.println("Enter object's velocity in meters per second") ;
		double velocity = input.nextDouble() ;
		
		double KE = KineticEnergy(mass, velocity) ;
	
		System.out.println("Kinetic energy of an object in motions is " + KE);
	}
		public static double KineticEnergy(double m, double v) {	
		double KE = 0.5 * m * v * v ;	
		return KE;
	}
}