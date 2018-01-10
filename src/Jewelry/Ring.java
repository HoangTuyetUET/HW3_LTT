package Jewelry;

public class Ring extends Jewelry {
    private int size;

    public Ring() {
        super();
        size = 0;
    }

    public Ring(int size) {
        this.size = size;
    }

    public Ring(int code, String describe, String material, long wholesale_prices, int percent, int size) {
        super(code, describe, material, wholesale_prices, percent);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
