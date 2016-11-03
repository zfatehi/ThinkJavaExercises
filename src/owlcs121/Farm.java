package owlcs121;

public class Farm {
    private String owner;
    private int acres;

    public Farm(String who, int acres) {
        owner = who;
        this.acres = acres;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public int getAcres() {
        return acres;
    }

}