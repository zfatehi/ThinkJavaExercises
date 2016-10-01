package dicussion3;

public class InfantTester {
    public static void main(String[] args) {
        Infant myKid = new Infant("Lizzie", 4);
        int lizAge = myKid.getAge();
        System.out.println("My kid's name is " + myKid.getName());
        myKid.anotherMonth();
        System.out.println("My kid is now " + myKid.getAge() + " months");
        Infant ourKid = new Infant("Napolean", 3);
        String tempName = ourKid.getName();
        tempName = "arambi";
        System.out.println("Our kid's name is " + ourKid.getName());
        ourKid = myKid;
        ourKid.setAge(4000);
        System.out.println("Our kid is now " + ourKid.getAge());
        System.out.println("My kid is now " + myKid.getAge());
        System.out.println("Our kid's name is " + ourKid.getName());
    }

}
