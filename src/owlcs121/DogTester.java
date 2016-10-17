package owlcs121;

public class DogTester {
    public static void main(String[] arg) {
        Dog d = null;
        d = new Dog("Hotdog", "poodle", 15.0, true);
        DogOwner jill;
        jill = new DogOwner("Jill", d);
        Dog c = new Dog("Chuckles", "spaniel", 8.0, false);
        jill = new DogOwner("Jill", c);
        c = new Dog("Lancelot", "spaniel", 8.0, false);
        jill = new DogOwner("Darth", c);
        jill.getDog().setWeight(10.0);
        jill.getDog().setShowdog(true);
    }
}
