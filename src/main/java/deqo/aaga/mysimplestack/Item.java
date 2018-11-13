package deqo.aaga.mysimplestack;

public class Item {
    private int a;
    private int b;
    private String c;

    public Item(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = "";
    }

    public Item(int a, int b, String type) {
        this.a = a;
        this.b = b;
        this.c = type;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }
}
