import java.util.Scanner ;

public class CostofFriut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String friut;
		double cost ;
		System.out.println("Entet the friut name") ;
		friut = input.next() ;
		System.out.println("Entet the weight in lbs") ;
		double weight = input.nextDouble();

		switch (friut) {
			case "Oranges": cost = weight / 0.59 ;
			System.out.println("$" + cost) ;
			break;
			case "Apples": cost = weight / 0.48 ;
			System.out.println("$" + cost) ;
			break;
			case "Cherries": cost = weight / 4.19 ;
			System.out.println("$" + cost) ;
			break;
			case "Mangoes": cost = weight / 3.79 ;
			System.out.println("$" + cost) ;
			break;
			case "Papayas": cost = weight / 3.79 ;
			System.out.println("$" + cost) ;
			break;
			default: System.out.println("Enter the name correctly") ;
		}
	}
}
			
		
		