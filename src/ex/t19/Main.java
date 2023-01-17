package ex.t19;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1); q.add(8); q.add(7);
        q.add(2); q.add(9); q.add(18);
        q.add(12); q.add(0);
        System.out.println("ДО: ");
        for (int e : q) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("ПОСЛЕ: ");
        reverseHalf(q);
        for (int e : q) {
            System.out.print(e + " ");
        }
    }

    public static void reverseHalf(Deque<Integer> q){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int e : q) {
            int temp = q.pollFirst();
            if (i%2 != 0) {
                stack.add(e);
            }
            else {
                q.add(temp);
            }
            i++;
        }
        int n = q.size() + stack.size();
        for (int j = 0; j < n; j++) {
            if (j%2 != 0) {
                q.add(stack.peek());
                stack.pop();
            }
            else {
                int temp = q.pollFirst();
                q.add(temp);
            }
        }
        if (!(stack.isEmpty())){
            q.add(stack.peek());
            stack.pop();
        }
    }
}
