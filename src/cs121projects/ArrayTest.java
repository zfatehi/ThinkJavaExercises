package cs121projects;

public class ArrayTest {
    public static void main(String[] args) {
        int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        String[] arr = new String[5];
        String dataStr1 = "salt and vinegar crisp";
        arr[0] = "egg";
        arr[1] = "potato";
        arr[2] = "cream cheese";
        arr[3] = dataStr1;
        arr[4] = "please";

        // make new array larger
        String[] arrNew = new String[15];
        // copy existing data
        for (int j = 0; j < arr.length; j++)
            arrNew[j] = arr[j];
        // add the new datum
        arrNew[arr.length] = "barbeque anything";

        arr = arrNew;
        // remove a value
        String removedStr = arr[2];
        arr[2] = null;
        for (int i = 2; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];

        // while(){
        // }

        System.out.println("here they come");
        /*  
          int len = firstArray.length;
          for(int j = 0; j < len; j++)
        firstArray[j] = j*j;
          System.out.println("here they come");
          for(int j = 0; j < firstArray.length; j++)
        System.out.println(firstArray[j]);
        */
    }
}
