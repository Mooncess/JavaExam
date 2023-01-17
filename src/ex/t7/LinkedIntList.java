package ex.t7;

public class LinkedIntList {

    public class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data, ListNode Node) {
            this.data = data;
            this.next = Node;
        }
    }
    private ListNode front = null;
    public LinkedIntList() {
    }
    public void addNode(int number) {
        if (front == null) {
            front = new ListNode(number, null);
        }
        else {
            ListNode temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(number, null);
        }
    }
    public void removeAll(LinkedIntList anotherList) {
        ListNode previosCurrentNode = null;
        ListNode GPointer = front;
        ListNode Pointer = anotherList.front;
        while (GPointer.next != null && Pointer.next != null) {
            if(GPointer.data < Pointer.data) {
                previosCurrentNode = GPointer;
                GPointer = GPointer.next;

            }
            else if(GPointer.data == Pointer.data) {
                if(GPointer == front) {
                    front = GPointer.next;
                    GPointer = front;
                }
                else{
                    previosCurrentNode.next = GPointer.next;
                    GPointer = GPointer.next;
                }
                Pointer = Pointer.next;


            }
            else {
                Pointer = Pointer.next;
            }
        }
    }

    public void printList() {
        ListNode currentNode = front;
        System.out.println("");
        while(currentNode.next != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data);
    }

}
