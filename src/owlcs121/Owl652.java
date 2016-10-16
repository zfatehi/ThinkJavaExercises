package owlcs121;

public class Owl652 {
    /*Suppose somePhrase is any String, and assume that it has already been 
     * created. Also, assume that a second String variable, anotherPhrase, 
     * has already been declared. Using the StringBuilder class, write code 
     * to place in anotherPhrase a palindrome version of somePhrase with a * 
     * character in the middle. For example, if somePhrase initially is "abcd", 
     * then anotherPhrase should ultimately hold "abcd*dcba"; and if somePhrase 
     * holds "Oh dear!", then ultimately anotherPhrase should hold 
     * "Oh dear!*!raed hO". When you've built the final version of 
     * anotherPhrase, then print it to the console. Hint: first make two 
     * distinct StringBuilder versions of somePhrase. Then reverse the second 
     * one and use the append method to assemble and then print your final 
     * answer. The reverse method is tricky. If s and t are StringBuilder 
     * variables, and if s references "xyz", then the statement t = s.reverse();
     * puts the reverse of "xyz", "yzx", in both s and t.
    */
    public static void main(String[] args) {
        String somePhrase = "abcd";
        String anotherPhrase;
        StringBuilder anotherPhraseBuilder = new StringBuilder();
        StringBuilder palindromePhraseBuilder = new StringBuilder();
        anotherPhraseBuilder.append(somePhrase);
        anotherPhraseBuilder.append('*');
        palindromePhraseBuilder.append(somePhrase);
        palindromePhraseBuilder.reverse();
        anotherPhraseBuilder.append(palindromePhraseBuilder);
        anotherPhrase = anotherPhraseBuilder.toString();
        System.out.println(anotherPhrase);

    }
}
