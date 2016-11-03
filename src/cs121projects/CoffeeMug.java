package cs121projects;

public class CoffeeMug {
    private String owner; // whose mug is it?
    private int capacity; // oz held in mug
    private boolean full; // cup full or not

    public CoffeeMug(String w, int cap, boolean full) {
        owner = w;
        capacity = cap;
        this.full = full;
    }

    public String getOwner() {
        return owner;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getFullStatus() {
        return full;
    }

    public void setOwner(String other) {
        owner = other;
    }

    public void setFullStatus(boolean isFilled) {
        full = isFilled;
    }

    public String toString() {
        return owner + ", capacity: " + capacity + ", is full: " + full;
    }
}
