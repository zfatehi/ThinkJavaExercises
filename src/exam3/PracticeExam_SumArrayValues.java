package exam3;

public class PracticeExam_SumArrayValues {

    public int[] vectorAbs(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = Math.abs(a[i] - b[i]);
        }
        return result;
    }

}
