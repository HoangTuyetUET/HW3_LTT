package Jewelry;

public class Jewelry {
    private int code;
    private String describe;
    private String material;
    private long wholesale_prices;
    private long retail_price;
    private int percent;

    Jewelry() {
        code = 0;
        describe = "";
        material = "";
        wholesale_prices = 0;
        percent = 0;
        retail_price = wholesale_prices * (percent / 100);
    }

    Jewelry(int code, String describe, String material, long wholesale_prices, int percent) {
        this.code = code;
        this.describe = describe;
        this.material = material;
        this.wholesale_prices = wholesale_prices;
        this.retail_price = wholesale_prices * (percent / 100);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getWholesale_prices() {
        return wholesale_prices;
    }

    public void setWholesale_prices(long wholesale_prices) {
        this.wholesale_prices = wholesale_prices;
    }

    public long getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(long retail_price) {
        this.retail_price = retail_price;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public long saleOff(int sale) {
        long sale_prices = 0;
        sale_prices = this.retail_price * (1 - sale / 100);
        return sale_prices;
    }
}
