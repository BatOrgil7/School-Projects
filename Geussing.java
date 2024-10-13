import java.util.Scanner;
import java.util.Random;

public class Guessing {
	public static void main(String[] args) {
	int randnum, guessNum;
	Random rand = new Random() ;
	ranNum = 1 + rand.nextInt(100) ;
	
	Scanner inpiut = new Scanner(System.in) ;
	System.out.print("Guess the random number 1-100: ");
	guessNum = input.nextInt() ;
	
	while(guessNum != random) {
		if(guessNum < random){
			System.out.println("Your guess was too low, try again!") ;
		}
		else{
			System.out.print("Your guess was too high, try again!") ;
		}
		System.out.print("Guess the random number 1-100") ;
		guessNum = input.nextInt ;
	}
	System.out.println("COngrats!") ;
	}
}