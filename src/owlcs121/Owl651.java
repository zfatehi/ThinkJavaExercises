package owlcs121;

public class Owl651 {
    /*Suppose somePhrase is any String, and assume that it has already been 
     * created. Assume also that the String variable newPhrase has already 
     * been declared. Using the StringBuilder class, replace all space characters 
     * in somePhrase with the dollar sign symbol $, and place the result in newPhrase. 
     * Then print newPhrase to the console. For example if somePhrase is the String 
     * "How now - my good friend!", newPhrase should hold this: How$now$-$my$good$
     * friend!and that's what should be printed. Hint: first turn somePhrase into a 
     * StringBuilder object, and then traverse the object, changing each space 
     * character into a '$' as you go. Next, use the toString method in the 
     * StringBuilder class to create newPhrase.
    */
    public static void main(String[] args) {
        /*Make a for loop that traverses through the string. It will check the
        string for its spaces. If there is a space, we will add a $ sign to the 
        String builder object. If not, it will add the original character to the 
        object.
        */
        String newPhrase;
        String somePhrase = "How now - my good friend!";
        StringBuilder newPhraseBuilder = new StringBuilder();
        for (int i = 0; i < somePhrase.length(); i++) {
            char a = somePhrase.charAt(i);
            if (a == ' ') {
                newPhraseBuilder.append('$');
            } else {
                newPhraseBuilder.append(a);
            }
        }
        newPhrase = newPhraseBuilder.toString();
        System.out.print(newPhraseBuilder);
    }

}
