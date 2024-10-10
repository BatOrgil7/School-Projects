import java.util.Scanner;

public class Farenhiet {
  public static void main(String[] args) {
	double cel, fah;
	
	Scanner input = new Scanner(System.in);
	cel = input.nextDouble();
	fah = 9.0/5 * cel +32;
	System.out.printf("The farenhiet is: %d", (int)fah);
  }
}