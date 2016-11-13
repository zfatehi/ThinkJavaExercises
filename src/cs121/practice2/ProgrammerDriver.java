package cs121.practice2;

public class ProgrammerDriver {
    public static void main(String[] args) {
        String[] s1 = { "Java", "C++", "SQL", "Python", "R" };
        Programmer p1 = new Programmer("Samantha", "Jones", 10, "High", s1);
        System.out.print(p1.toString());
    }

}
