package packtest;

import java.util.Scanner;

public class Lesson32603 {
    public static void main(String[] args) {
        int year1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year... ");
        year1 = scanner.nextInt();
        boolean isDivide4 = year1 % 4 == 0;
        boolean isDidide100 = year1 % 100 == 0;
        boolean isDivide400 = year1 % 400 == 0;
        if ((isDivide4 && isDidide100) && isDivide400) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not leap year");
        }
    }
}
