package ex.t25;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for(int i =0 ; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
