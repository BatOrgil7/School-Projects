import java.util.Scanner;

public class palindrome{
	public static void main(String[] args){
		String word1;
		String word2 = "";
		Scanner input = new Scanner(System.in);
		word1 = input.nextLine();
		
		for (int i = word1.lenght()-1; 1>= 0; i--){
			word2 += word1.charAt(i);
		}
		
		if (word1.equal=(word2))
			System.out.print("THe word is a palindrome", word1);
		else
			System.out.print("THe word is not a palindrome", word2);
	}
}