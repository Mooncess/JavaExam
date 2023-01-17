package ex.t27;

import ex.t26.MyArrayList;

public class Main {
    public static void main(String[] args) {
        ex.t26.MyArrayList<Integer> array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        int n = array.getSize();
        System.out.println("SIZE = " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + ", ");
        }
    }
}
