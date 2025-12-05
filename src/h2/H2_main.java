package h2;

import java.util.Arrays;

public class H2_main {
    public static int[] change(int[] a, int[] b, int start, int end) {

        if (end > start && (Arrays.compare(a, b) != 0)) {
            int[] aNew = Arrays.copyOfRange(a, 0, a.length);
            return aNew;
        }
        if (end > start && (Arrays.compare(a, b) == 0)) {
            Arrays.sort(a);
            return Arrays.copyOfRange(a, start, end);
        }
        if (end <= start) {
            int[] aNew = new int[0];
            return aNew;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a     = {2, 7, 1, 4};
        int[] b     = {5, 6, 7};
        int   start = 2;
        int   end   = 4;
        System.out.printf("Rückgabe von change(%s, %s, %d, %d): ist %s%n", Arrays.toString(a), Arrays.toString(b), start, end,
                          Arrays.toString(change(a, b, start, end)));

    }
}