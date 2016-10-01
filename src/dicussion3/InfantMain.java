package dicussion3;

import java.util.Scanner;

public class InfantMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // infant 1:
        System.out.println("Enter a name:");
        String name1 = scan.nextLine();
        System.out.println("Enter a age:");
        int age1 = scan.nextInt();
        Infant infant1 = new Infant(name1, age1);
        // infant 2:
        System.out.println("Enter a name:");
        String name2 = scan.nextLine();
        System.out.println("Enter a age:");
        int age2 = scan.nextInt();
        Infant infant2 = new Infant(name2, age2);
    }

}
