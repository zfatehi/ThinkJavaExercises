package owlcs121;

public class Owl779 {
    public static void main(String[] args) {
        Kid[] thoseKids =

                new Kid[] { new Kid("Zoe", 11), new Kid("Luke", 11),
                        new Kid("Elizabeth", 7), new Kid("Mark", 10),
                        new Kid("Claire", 11), new Kid("Frances", 11),
                        new Kid("Catherine", 7), new Kid("Theodore", 8),
                        new Kid("Kelly", 9), new Kid(" Lucy", 13), new Kid("Sandy", 10),
                        new Kid("Luke", 11), new Kid("Catherine", 12), new Kid("Ian", 8),
                        new Kid("William", 9), new Kid("Jean", 12),
                        new Kid("Lawrence", 15), new Kid("William", 9),
                        new Kid("Frances", 12), new Kid("Kelly", 10) };

        int oldest = 0;
        String oldestname = "";
        for (int i = 0; i < thoseKids.length; i++) {
            if (thoseKids[i].getAge() > oldest) {
                oldest = thoseKids[i].getAge();
                oldestname = thoseKids[i].getName();
            }
        }
        System.out.println(oldestname);
    }
}
