import java.util.Scanner ;

public class DaysMonth {
	public static void main(String[] args) {
		int year = 0, month = 0 ;
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the month(enter 1 for Jan, 2 for Feb, etc.): ") ;
		month = input.nextInt() ;
		System.out.print("Enter the year: ") ;
		year = input.nextInt() ;
		
		switch (month){
			case 2: 
			if (year % 4 == 0) {
		     System.out.print("February " + year + " has 29 days") ;
			}
			else {System.out.print("February " + year + " has 28 days") ;
			}
			break;
			case 1: 
			System.out.print("January " + year + " has 31 days") ;
			break;
			case 3: 
			System.out.print("March " + year + " has 31 days") ;
			break;
			case 4: 
			System.out.print("April " + year + " has 31 days") ;
			break;
			case 5: 
			System.out.print("May " + year + " has 31 days") ;
			break;
			case 6: 
			System.out.print("June " + year + " has 31 days") ;
			break;
			case 7: 
			System.out.print("July " + year + " has 31 days") ;
			break;
			case 8: 
			System.out.print("August " + year + " has 31 days") ;
			break;
			case 9: 
			System.out.print("September " + year + " has 31 days") ;
			break;
			case 10: 
			System.out.print("October " + year + " has 31 days") ;
			break;
			case 11: 
			System.out.print("November " + year + " has 31 days") ;
			break;
			case 12: 
			System.out.print("December " + year + " has 31 days") ; 
			break;
		}
	}
}
		
		