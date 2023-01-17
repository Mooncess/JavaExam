package ex.t7;

public class Main {
    public static void main(String[] args) {
        int[] arrayList1 = new int[]{1,3,5,7};
        int[] arrayList2 = new int[]{1,2,3,4,5};
        LinkedIntList linkedIntList = new LinkedIntList();
        LinkedIntList linkedIntList1 = new LinkedIntList();
        for (int num: arrayList1 ) {
            linkedIntList.addNode(num);
        }
        for (int num: arrayList2 ) {
            linkedIntList1.addNode(num);
        }
        linkedIntList.printList();
        linkedIntList1.printList();
        linkedIntList1.removeAll(linkedIntList);
        linkedIntList.printList();
        linkedIntList1.printList();
    }
}