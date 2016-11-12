package scoring;

public class Person implements Scoring {

    private String name;
    private double height;

    public Person(String n, double h) {
        name = n;
        height = h;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getScore() {
        return height;
    }

    @Override
    public void setScore(double newScore) {
        height = newScore;

    }
}