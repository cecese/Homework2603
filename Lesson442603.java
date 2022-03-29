package packtest;

import java.util.Scanner;

  public class Lesson442603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input letter from alphabet");
        String myLetter;
        myLetter = scanner.next().toLowerCase();
        boolean upperCase = myLetter.charAt(0) >= 65 && myLetter.charAt(0) <= 90;
        boolean lowelCase = myLetter.charAt(0) >= 97 && myLetter.charAt(0) <= 122;
        boolean vowels = myLetter.equals("a") || myLetter.equals("e")
                || myLetter.equals("i") || myLetter.equals("o") ||
                myLetter.equals("u");
        if (myLetter.length() > 1 ) {
            System.out.println("Error. Not single character");
        } else if (! (upperCase || lowelCase)) {
            System.out.println("Error. Not a letter");
        } else if (vowels) {
            System.out.println("Input letter is a vowel");
        } else {
            System.out.println( "Input letter is a consonant");
        }


    }
}
