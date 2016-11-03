package owlcs121;

public class Owl8612 {
    /**
     * Write a static method named mostBowlsFull, to be added to the Bowl class,
     * which is passed an array of Bowl objects, and returns true if a strict
     * majority of the Bowls in the array are not empty. Thus if the array
     * consists of 11 bowls and 6 are not empty, your method should return true,
     * but if the array consists of 12 bowls and 6 (or fewer) are not empty,
     * your method should return false.
     */
    public static boolean mostBowlsFull(Bowl bowls[]) {
        int count = 0;
        boolean ret = false;
        for (int j = 0; j < bowls.length; j++) {
            if (bowls[j].getEmpty() == false) {
                count++;
            }
        }
        if (count > (bowls.length / 2)) {
            ret = true;
        }
        return ret;
    }
}
