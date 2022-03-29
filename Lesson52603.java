package packtest;

import java.util.Scanner;

public class Lesson52603 {
    public static void main(String[] args) {
        // ax2 + bx + c = 0
        int numA;
        int numB;
        int numC;
        double numX1;
        double numX2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for A ...");
        numA = scanner.nextInt();
        System.out.println("Input number for B ...");
        numB = scanner.nextInt();
        System.out.println("Input number for C ...");
        numC = scanner.nextInt();
        double numD;
        numD = (Math.pow(numB,2) - 4 * numA * numC);
        System.out.println(numD);
        boolean discD = numD < 0;
        boolean discD1 = numD == 0;
        numX1 = (-numB + Math.sqrt(numD)) / ( 2 * numA);
        numX2 = (-numB - Math.sqrt(numD)) / ( 2 * numA);
        String twoX = "Корените на уравнението са два:";
        String oneX = "Корените на уравнението са еднакви:";
        if (discD) {
            System.out.println("Уравнението няма корени");
        } else if (discD1) {
            System.out.printf("%s%n%.2f%n", oneX, numX1);
        } else {
            System.out.printf("%s%n%.2f%n%.2f%n", twoX,  numX1, numX2);
        }
    }



}
