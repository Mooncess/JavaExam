package ex.t27;

public class MyArrayList<G> {
    private G[] massive;
    private int maxsize;
    private int cursize;

    public MyArrayList(){
        this.massive = (G[])new Object[3];
        this.maxsize = 3;
        this.cursize = 0;
    }

    public void add(G data) {
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

    public G get() {
        if (cursize != 0) {
            return massive[cursize-1];
        }
        return null;
    }

    public int getCursize() {
        return cursize;
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
