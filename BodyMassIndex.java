import java.util.Scanner;
public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double pounds, inches, kilograms, meters, bmi;
		System.out.println("What is your height in inches?");
		inches = input.nextDouble();
		System.out.println("What is your weight in pounds?");
		pounds = input.nextDouble();
		kilograms = pounds / 0.454;
		meters = inches / 0.0254;
		bmi = kilograms / Math.pow(meters, 2);
		if (bmi < 18.5){
			System.out.println("Underweight");
		}
		else if (bmi < 25.0 && bmi >= 18.5) {
			System.out.println("Normal");
		}
		else if (bmi < 30.0 && bmi >= 25.0) {
			System.out.println("Normal");
		}
		else
			System.out.println("Obese") ;
	}
}