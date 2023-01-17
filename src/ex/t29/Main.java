package ex.t29;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for(int i =0 ; i < 3; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println("--------------");
        for(int i =0 ; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
    }
}
