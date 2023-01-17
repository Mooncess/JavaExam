package ex.t18;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, -8, 100, 4, 12, 5};
        ArrayIntList a = new ArrayIntList(arr);
        System.out.print("MAXLEN: " + a.longestSortedSequence());
    }
}
