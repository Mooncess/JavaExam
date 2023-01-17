package ex.t18;

public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList(int[] arr) {
        this.elementData = arr;
        size = arr.length;
    }

    public int longestSortedSequence(){
        int n = 1;
        int maxn = Integer.MIN_VALUE;
        int pre = elementData[0];
        for (int i = 1; i < size; i++) {
            if (pre <= elementData[i]) {
                n++;
                if (n > maxn) {
                    maxn = n;
                }
            }
            else {
                n = 1;
            }
        }
        return maxn;
    }
}
