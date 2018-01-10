package Jewelry;

public class Necklace extends Jewelry {
    private String face;

    Necklace() {
        super();
        face = "";
    }

    public Necklace(String face) {
        this.face = face;
    }

    public Necklace(int code, String describe, String material, long wholesale_prices, int percent, String face) {
        super(code, describe, material, wholesale_prices, percent);
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
