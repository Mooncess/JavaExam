package ex.t15;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();

        st1.add(1); st1.add(-2); st1.add(3);
        st1.add(156); st1.add(-24); st1.add(-355);

        System.out.print("Исходный стек: ");
        for (int i : st1) {
            System.out.print(i + " ");
        }
        System.out.println();

        splitStack(st1);

        System.out.print("Переработанный стек: ");
        for (int i : st1) {
            System.out.print(i + " ");
        }
    }

    public static void splitStack (Stack<Integer> s) {
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        while (!(s.isEmpty())) {
            int a = s.peek();
            s.pop();
            if (a < 0) {
                q.addFirst(a);
            }
            else {
                q.addLast(a);
            }
        }
        for (int i : q) {
            s.add(i);
        }
    }
}
