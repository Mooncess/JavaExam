package ex.t9;

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
    public LinkedIntList() {}
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

    public void removeDuplicates() {
        ListNode curNode = front;
        ListNode temp = front;
        ListNode checkNode = front.next;

        while(curNode.next != null) {
            while(checkNode.next != null) {
                if(checkNode.data == curNode.data) {
                    temp.next = checkNode.next;
                    checkNode = checkNode.next;
                }
                else {
                    temp = checkNode;
                    checkNode = checkNode.next;
                }
            }
            curNode = curNode.next;
            temp = curNode;
            checkNode = curNode.next;
        }
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
