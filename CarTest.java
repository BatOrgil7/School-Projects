import java.util.*;
public class CarTest{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the make of your car: ");
			String m = input.nextLine();
			
			System.out.print("Enter the year model of your car: ");
			String y = input.nextLine();
			
			Car myCar = new Car();
			myCar.setMake(m);
			myCar.setYearModel(y);
			
			System.out.printf("You got a %s %s", myCar.getYearModel(), myCar.getMake()); 
	}
}