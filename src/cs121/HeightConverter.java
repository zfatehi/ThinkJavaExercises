package cs121;

//Zahra Fatehi 29193098

public class HeightConverter {
    public static void main(String[] args) {
        double conversionFactor = 2.54;
        String myName = "Zahra Fatehi";
        int myAge = 19;
        int myHeightInches = 64;
        double myHeightCM = myHeightInches * conversionFactor;
        System.out.println(myName);
        System.out.println("age:" + myAge);
        System.out.println("height:" + myHeightInches + " inches");
        System.out.println("height:" + myHeightCM + " cm");

    }
}
