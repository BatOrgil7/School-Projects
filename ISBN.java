import java.util.Scanner;
public class ISBN {
	public static void main(String[] args) {
		int d1, d2, d3, d4, d5, d6, d7, d8, d9 ;
		int checksum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first 9 digits of an ISBN as an integer: ");
		int num = input.nextInt();
		d1 = num / 100000000;
		num = num % 100000000;
		d2 = num / 10000000;
		num = num % 10000000;
		d3 = num / 1000000;
		num = num % 1000000;
		d4 = num / 100000;
		num = num % 100000;
		d5 = num / 10000;
		num = num % 10000;
		d6 = num / 1000;
		num = num % 1000;
		d7 = num / 100;
		num = num % 100;
		d8 = num / 10;
		num = num % 10;
		d9 = num / 1;
		
		checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		 
		if (checksum == 10)
			System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
	else 
		System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
	}
}
	