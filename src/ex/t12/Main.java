package ex.t12;

public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.printList();
        list.insert(0,3);
        list.printList();
    }
}
