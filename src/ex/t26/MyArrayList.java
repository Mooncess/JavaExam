package ex.t26;

public class MyArrayList<G> {
    private class Node {
        public G data;
        public Node next;

        public Node(G data){
            this.data = data;
            this.next = null;
        }
    }
    private Node root;
    private int size;

    public void add(G data) {
        size++;
        Node temp = root;
        if (temp == null) {
            root = new Node(data);
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }

    }

    public G get(int index) {
        int i = 0;
        Node temp = root;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }

    public MyArrayList(){
        Node root = null;
        int size = 0;
    }
}
