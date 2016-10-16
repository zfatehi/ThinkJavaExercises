package dicussion5;

public class tester {
    public static void main(String[] args) {
        String newstring = "";
        String str = "why12345";
        char a;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
            if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5'
                    || a == '6' || a == '7' || a == '8' || a == '9') {

                str = str.replace(a, '#');
            }
        }
        System.out.print(str);
    }

}
