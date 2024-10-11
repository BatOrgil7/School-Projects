import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = 0;

        // Convert the sentence to lowercase to make it case-insensitive
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        System.out.println("The number of vowels in the sentence is: " + vowelCount);

        scanner.close();
    }
}