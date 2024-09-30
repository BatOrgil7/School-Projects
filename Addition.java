import java.util.Scanner;
import java.util.Random;

public class Addition {
	public static void main(String[] args) {
	int num1, num2, asnwer ;
	
	
	Random rand = new Random();
    num1 = rand.nextint(10);
	num2 = rand.nextint(10);
	
	Scanner input = new Scanner(System.in);
	System.out.printf("What is %d + %d", num1, num2);
	answer = input.nextInt();
	
	while(answer != num1 + num2) {
		System.out.println("Try again") ;
		
		System.out.printf("What is %d + %d", num1, num2);
	    answer = input.nextInt();
	}
	System.out.println("Correct") ;
	
	}
}