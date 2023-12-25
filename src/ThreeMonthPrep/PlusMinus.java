package ThreeMonthPrep;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void printRatio(List<Integer> arr) {
        int len = arr.size();
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount ++;
            }
        }
        System.out.printf("%1.4f\n", positiveCount / len);
        System.out.printf("%1.4f\n", negativeCount / len);
        System.out.printf("%1.4f\n", zeroCount / len);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, -1, 5, 6, 0, -3);
        printRatio(arr);
    }
}
