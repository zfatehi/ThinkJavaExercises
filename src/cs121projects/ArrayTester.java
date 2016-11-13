package cs121projects;

public class ArrayTester {
    public static void main(String[] args) {
        // double[] dblArray = new double[4];
        // Integer[] numsarray = newInteger[7];
        Employee[] employees = new Employee[5];

        double[] dblArray = { 0.45, 0.78, 0.99, 0.15 };
        Integer[] numsarray = { 55, 67, 22, 15, 78, 99, 900 };
        employees[0] = new Employee("George", "Jetson", 45);
        employees[1] = new Employee("Lucy", "Liu", 33);
        employees[2] = new Employee("Ty", "Burell", 33);

        for (int j = 0; j < employees.length; j++) {
            System.out.println(employees[j].toString());
        }
        CoffeeMug[] myMugs = new CoffeeMug[7];
        for (CoffeeMug mug : myMugs) {
            System.out.print(mug.toString());

        }
        double avg = 0.0;
        for (int a = 0; a < myMugs.length; a++) {
            avg += myMugs[a].getCapacity();
        }
        System.out.println((double) avg / myMugs.length);
    }

    public static int fullCount(CoffeeMug[] m) {
        int sum = 0;
        for (CoffeeMug a : m) {
            if (a.getFullStatus()) {
                sum++;
            }
        }
        return sum;
    }

    public static void allMine(CoffeeMug[] mugs, String newOwner) {
        for (int z = 0; z < mugs.length; z++) {
            mugs[z].setOwner(newOwner);
        }
    }
}