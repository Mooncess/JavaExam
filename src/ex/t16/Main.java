package ex.t16;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        a.add(1); a.add(2); a.add(3); a.add(4); a.add(455);
        System.out.print("Стек-ор: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        Stack<Integer> c = copyStack(a);
        System.out.print("Стек-копия: ");
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Стек-ор: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static Stack<Integer> copyStack(Stack<Integer> a) {
        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> ans = new Stack<Integer>();
        while (!(a.isEmpty())) {
            temp.add(a.peek());
            a.pop();
        }
        while (!(temp.isEmpty())) {
            ans.add(temp.peek());
            a.add(temp.peek());
            temp.pop();
        }
        return ans;
    }
}
