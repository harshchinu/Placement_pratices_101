package Pratices.Graph;

public class Pair<T, I extends Number> {
    public T getP1() {
        return p1;
    }

    public void setP1(T p1) {
        this.p1 = p1;
    }

    public T getP2() {
        return p2;
    }

    public void setP2(T p2) {
        this.p2 = p2;
    }

    T p1, p2;

    public Pair(T p1, T p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}