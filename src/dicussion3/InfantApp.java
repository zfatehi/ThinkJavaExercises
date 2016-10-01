package dicussion3;

public class InfantApp {
    public static void main(String[] args) {
        Infant infantOne = new Infant("Lizzie", 4);
        String curName = infantOne.getName();
        int curAge = infantOne.getAge();
        System.out.println("This kid's name is " + curName);
        System.out.println("This kid's age is " + infantOne.getAge());
    }
}
