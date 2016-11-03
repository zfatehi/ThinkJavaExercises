package owlcs121;

import java.util.Random;

public class AirSeating {
    private int size;
    private int[] seats; // if seats[7] holds 4, passenger 4 is in seat 7
    Random ran = new Random();

    public AirSeating(int planeSize) {
        size = planeSize;
        seats = new int[size];
    }

    private void emptyPlane() {
        for (int i = 0; i < size; i++)
            seats[i] = -1; // start with all at -1
    }

    private void seatFirstPerson() {
        // places 0th person in an empty plane
        int firstPersonPos = ran.nextInt(size); // pick random seat for person 0
        seats[firstPersonPos] = 0; // put 0 in chosen seat
    }

    private int findKthEmpty(int k) {
        /* array seats holds numbers from 0 to size-1 - actual passengers, or -1
        * which means that the seat is empty. What's index of kth empty seat?
        */
        int ctr = k; // tallies number of empties seen as you walk seats
        int where = 0;
        while (where < size) {
            if (empty(where)) // is location "where" empty, that is, -1?
                if (ctr == 0)
                    return where;
                else
                    ctr--;
            where++;
        }
        System.out.println("error in findKthEmpty");
        return (-1); // return statement required
    }

    /**
     * The method empty, with boolean return type, returns true or false
     * depending on whether a seat on a plane is empty or not.
     */

    private boolean empty(int loc) {
        if (seats[loc] == -1) {
            return true;
        } else {
            return false;
        }

    }

    public void fillSeats() {
        /* places all passengers in their seats
         * Variable leftOver holds number of empty seats left on plane
         * pick empty seat n at random: that's where p will go
         */
        emptyPlane(); // build empty plane
        seatFirstPerson(); // places person 0
        int leftOver = size - 1; // person 0 already placed
        int n; // will be he kth empty seat
        for (int p = 1; p < size; p++) {
            if (empty(p)) {
                seats[p] = p;
                leftOver--;
            } // if p's seat empty: place p
            else {
                n = findKthEmpty(ran.nextInt(leftOver));
                seats[n] = p;
                leftOver--; // in loop, after p placed there's one fewer empty
                            // seat left
            }
        }
    }

    /**
     * The method lastPatronTest, with boolean return type, returns true or
     * false depending on whether the last passenger on the plane gets his or
     * her own seat.
     **/
    public boolean lastPatronTest() {
        if (seats[size - 1] == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The method printSeat, with int return type and int parameter who, returns
     * the seat number (array index) where person who is sitting. The method
     * should return -1 if person who doesn't have a seat.
     **/

    public int printSeat(int who) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == who) {
                return i;
            }
        }
        return -1;
    }

    /**
     * For each trial, the number of people who are actually in their own seat
     * (that is, seats[i] actually equals i) is added into variable count for
     * each trial. When the loop ends, the final total is divided by the number
     * of trials times the size of the plane, giving a decimal fraction for
     * people getting their own seat at this size plane. The key method here is
     * ownSeatCount, with int return type, which, for each trial, returns the
     * number of passengers who are in their original assigned seat.
     */

    public int ownSeatCount() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == i) {
                count++;
            }
        }
        return count;
    }
}
