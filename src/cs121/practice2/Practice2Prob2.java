package cs121.practice2;

public class Practice2Prob2 {
    /**
     * Write the body of the method printAllButOmitted. The method signature is
     * provided. The method is passed an array of names, inputNames, and a name
     * NOT to print, omittedName. Names are represented by String objects. Your
     * code MUST print all of the names contained in the array inputNames except
     * the omittedName.
     * 
     * Example 1: Suppose inputNames and omittedName have the following values:
     * 
     * omittedName was assigned to "Jill" inputNames contained the names
     * "Pinar","Yanjie","Ryan","Francis","Jill","Janet", "Jill"
     * 
     * 
     * Your code should print (without any errors):
     * 
     * Pinar Yanjie Ryan Francis Janet
     * 
     * Note that all occurrences of the omitted name are not printed.
     * 
     * Example 2: Suppose inputNames and omittedName have the following values:
     * 
     * omittedName was assigned to "Jill" inputNames contained the names
     * "Pinar","Yanjie","Ryan","Francis","Jill","Janet", "Jill", "Pinar"
     * 
     * 
     * Your code should print (without any errors):
     * 
     * Pinar Yanjie Ryan Francis Janet Pinar
     * 
     * Note that "Pinar" was printed twice because that name occurred twice in
     * the array.
     * 
     * Important conditions:
     * 
     * The names MUST be printed in one line with a space between them. Assume
     * that the array inputNames has length > 0. Assume that omittedName has
     * been assigned to a name. Do not be concerned with upper or lower case.
     * Assume all names begin with a capital letter. If the omitted name appears
     * more than once all instances are omitted in the output(see examples
     * above). All names in the array that are not the omitted name are printed.
     * If a name occurs more than once it will be printed as many times as it
     * occurs(see example 2 above). Remember, your code must work for any names
     * (possibly zero) that inputNames contains, and for any name omittedName
     * might be assigned to, not just the example given above.
     **/

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
