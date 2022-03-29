package packtest;

import java.util.Scanner;

public class Lesson42603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scanner.next();

        boolean vowels = input.equalsIgnoreCase("a")
                || input.equalsIgnoreCase( "e")
                || input.equalsIgnoreCase(  "i")
                || input.equalsIgnoreCase( "o")
                || input.equalsIgnoreCase("u");
        if (input.isEmpty()) {
            System.out.println( "Error. Not a single character.");
        } else if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Error. Not a letter!");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input leteer is Consonant");
        }
    }
}
