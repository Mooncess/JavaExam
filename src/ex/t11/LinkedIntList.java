package ex.t11;

public class LinkedIntList {
    public class ListNode {
        public int data;
        public LinkedIntList.ListNode next;

        public ListNode(int data, LinkedIntList.ListNode Node) {
            this.data = data;
            this.next = Node;
        }
    }
    private ListNode front = null;
    public LinkedIntList() {
    }
    public void addNode(int number) {
        if (front == null) {
            front = new LinkedIntList.ListNode(number, null);
        }
        else {
            LinkedIntList.ListNode temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new LinkedIntList.ListNode(number, null);
        }
    }

    public void firstLast() {
        ListNode temp = front;
        front = front.next;
        temp.next = null;
        ListNode currentNode = front;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
    }

    public void printList() {
        LinkedIntList.ListNode currentNode = front;
        System.out.println("");
        while(currentNode.next != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data);
    }
}
