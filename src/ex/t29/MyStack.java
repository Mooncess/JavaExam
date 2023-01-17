package ex.t29;

import java.util.ArrayList;

public class MyStack<G> {
    //E[] arr = (E[])new Object[INITIAL_ARRAY_LENGTH];
    private G[] massive;
    private int maxsize;
    private int cursize;
    public MyStack(){
        this.massive = (G[])new Object[3];
        this.maxsize = 3;
        this.cursize = 0;
    }

    public void push(G data) {
        if (maxsize != cursize){
            massive[cursize] = data;
            cursize++;
        }
        else {
            copyArr();
            massive[cursize] = data;
            cursize++;
        }
    }

    public G peek() {
        if (cursize != 0) {
            return massive[cursize-1];
        }
        return null;
    }
    public void pop() {
        cursize--;
        massive[cursize] = null;
    }
    public void copyArr() {
        G[] Nmassive = (G[])new Object[maxsize*2];
        for (int i = 0; i < maxsize; i++) {
            Nmassive[i] = massive[i];
        }
        maxsize = maxsize*2;
        massive = Nmassive;
    }
}
