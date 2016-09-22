package cs121;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 decimal numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Sum of" + num1 + " " + num2 + " is ");
        System.out.println(num1 + num2);
    }
}
