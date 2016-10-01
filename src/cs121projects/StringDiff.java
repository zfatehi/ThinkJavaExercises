package cs121projects;

import java.util.Scanner;

public class StringDiff {
    private static Scanner scan;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string one:");
        String inputStr1 = scan.next();
        System.out.print("Enter string two:");
        String inputStr2 = scan.next();
        System.out.println("String one: " + inputStr1);
        System.out.println("String two: " + inputStr2);

    }
}