import java.util.Scanner;
public class Keypad {
	public static void main (String[] args) {
		char ch ;
		Scanner input = new Scanner(System.in);
		System.out.println("\nDo you want to enter a letter (enter yes or no)? ") ;
		String yesorno = input.next();
		
		while (yesorno.equals("yes")) {
			
			System.out.print("Enter a letter: ") ;
			ch = input.next().charAt(0) ;
			ch = Character.toUpperCase(ch);
			switch (ch) {
				case 'A', 'B', 'C':
					System.out.println("The corresponding number is 2") ;
	
				break;
				case 'D', 'E', 'F':  
					System.out.println("The corresponding number is 3") ;
				
				break;
				case 'G', 'H', 'I': 
					System.out.println("The corresponding number is 4") ;
				
				break;
				case 'J', 'K', 'L': 
					System.out.println("The corresponding number is 5") ;
				
				break;
				case 'M', 'N', 'O': 
					System.out.println("The corresponding number is 6") ;
				
				break;
				case 'P', 'Q', 'R', 'S': 
					System.out.println("The corresponding number is 7") ;
				
				break;
				case 'T', 'U', 'V':
					System.out.println("The corresponding number is 8") ;
				
				break;
				case 'W', 'X', 'Y', 'Z': 
					System.out.println("The corresponding number is 9") ;
				
				break;
				default: System.out.println(ch + " is an invalid letter"); 
			}
			System.out.print("Do you want to enter a letter (enter yes or no)? ") ;
		    yesorno = input.next();
		}
		
	}
}
				