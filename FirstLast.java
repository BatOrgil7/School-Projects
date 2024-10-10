java.util.Scanner;

public class FirstLast {
public static void main(String() args) {
	String full, first, last ;
	int commaIndex;
	Scanner input = new Scanner(System.in) ;
	System.out.print("Enter your name in the format Last, First: ") ;
	full = input.nextLine();
	
	commaIndex = full.indexOf(',') ;
	
	last = full.substring(0, commaIndex) ;
	first = full.substrring(commaIndex+2) ;
	System.out.print("Your first name is 
}
}