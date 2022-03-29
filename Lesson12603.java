package packtest;

import java.util.Scanner;

public class Lesson12603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float price;
        int size;
        boolean colourIsBlack = true;
        boolean canReturn = true;
        System.out.println("Input price of the shoes...");
        price = scanner.nextFloat();
        System.out.println("Input size of the shoes...");
        size = scanner.nextInt();
   //     System.out.println("Input true/false if the shoe's colour is black...");
   //     colourIsBlack = scanner.hasNextBoolean();
   //     System.out.println("Input true/false if you can return shoes...");
   //     canReturn = scanner.hasNext();
        System.out.println("--------------");
        boolean priceAndSize = (size == 44 || size == 45) && (price < 150 ) && colourIsBlack && canReturn;
                if (priceAndSize) {
                System.out.println("I can afford shoes");

                } else {
                    System.out.println("I cann't afoord shoes");
                }
            }
        }


