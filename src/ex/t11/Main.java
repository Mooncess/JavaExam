package ex.t11;

public class Main {
    public static void main(String[] args) {
        int[] arrayList1 = new int[]{14,8,1};
        LinkedIntList linkedIntList = new LinkedIntList();
        for (int num: arrayList1 ) {
            linkedIntList.addNode(num);
        }

        linkedIntList.printList();
        linkedIntList.firstLast();
        linkedIntList.printList();
    }
}
