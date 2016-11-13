package cs121.practice2;

public class Practice2Prob2 {
    public static void main(String[] args) {
        // compare Strings with .equals() not == (exclamation!!)
        String[] inputNames = { "Jane", "Bob", "Jim", "Sally", "Mary", "Omar" };
        String omittedName = "Bob";
        for (int i = 0; i < inputNames.length; i++) {
            if (!inputNames[i].equals(omittedName)) {
                System.out.print(inputNames[i] + " ");
            }
        }

    }

}
