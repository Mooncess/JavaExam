package ex.t1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>();
        ArrayList <Integer> b = new ArrayList<Integer>();
        a.add(1); a.add(2); a.add(3); a.add(4);
        b.add(10); b.add(20); b.add(30); b.add(40); b.add(100); b.add(160);
        ArrayList <Integer> c = alternate(a,b);

        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> alternate(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> array = new ArrayList<Integer>();
        int n;
        if (a.size() > b.size()) {
            n = a.size();
        }
        else {
            n = b.size();
        }
        for (int i = 0; i < n; i++) {
            if (i < a.size()) {
                array.add(a.get(i));
            }
            if (i < b.size()) {
                array.add(b.get(i));
            }
        }
        return array;
    }
}
