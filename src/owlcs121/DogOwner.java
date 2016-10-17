package owlcs121;

public class DogOwner {
    String name;
    Dog dog;

    public DogOwner(String n, Dog d) {
        name = n;
        dog = d;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setName(String anotherName) {
        name = anotherName;
    }

    public void setDog(Dog anotherDog) {
        dog = anotherDog;
    }

}
