package ex.t14;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.add(1); st1.add(2); st1.add(3);
        st2.add(1); st2.add(60); st2.add(3);

        System.out.print("Сравнение: "+ equels(st1,st2));
    }

    public static boolean equels (Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }
        Stack<Integer> temp = new Stack<Integer>();
        while (!(s1.isEmpty())) {
            int a = s1.peek();
            int b = s2.peek();
            if (a != b) {
                return false;
            }
            s1.pop(); s2.pop();
            temp.add(a);
        }

        while (!(temp.isEmpty())) {
            s1.add(temp.peek()); s2.add(temp.peek());
            temp.pop();
        }
        return true;
    }
}
