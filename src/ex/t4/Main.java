package ex.t4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2); set.add(4); set.add(6);
        System.out.println("1) " + hasOdd(set));
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        set.add(3);
        System.out.println("2) " + hasOdd(set));
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static boolean  hasOdd (Set<Integer> set) {
        for (int i : set) {
            if (i%2 != 0) {
                return true;
            }
        }
        return  false;
    }
}
