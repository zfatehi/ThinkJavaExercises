package owlcs121;

public class Owl616 {
    public static void main(String[] args) {
        double r = 0.024;
        /*
        Write a chained if-else statement that captures the following 
        scenario: Suppose r is a rate for a mortgage loan. If r is less 
        than 2.5% (.025) then print "great"; if r is at least 2.5% but less 
        than 4%, print "good"; and if r is 4% or higher print "not great".
        */
        if (r < 0.025)
            System.out.println("great");
        else if (r >= 0.025 && r < 0.04)
            System.out.println("good");
        else if (r >= 0.04)
            System.out.println("not great");
        else
            System.out.println("");
    }
}
