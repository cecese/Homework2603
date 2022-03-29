package packtest;

import java.util.Scanner;

public class Lesson22603 {
    public static void main(String[] args) {
        double numA;
        double numB;
        double equalresult = 0.000001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number A...");
        numA = scanner.nextDouble();
        System.out.println("Input number B...");
        numB = scanner.nextDouble();
        double result1 = Math.abs(numA-numB);
        boolean equalAtoB = (result1 < equalresult);
        boolean isAbiggerThanB = (result1 != equalresult && (numA > numB));
        boolean isAlessThanB = ((result1 != equalresult) && (numA < numB));
        String isAbigB = "Num A is bigger than num B with: ";
        String isAlessB = "Num A is less than num B with: ";
        if (equalAtoB) {
            System.out.println("Equals");
        } else if (isAbiggerThanB) {
            System.out.printf("%s%n%.4f%n", isAbigB, result1);
        } else {
            System.out.printf("%s%n%.4f%n", isAlessB, result1);

        }

    }
}
