package main.camp;

public class Product {

    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product() {
    }

    public Product(int id, String name, double unitPrice, String detail, double discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Product setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public Product setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public double getDiscount() {
        return discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * this.discount / 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", detail='" + detail + '\'' +
                ", discount=" + discount +
                ", unitPriceAfterDiscount=" + unitPriceAfterDiscount +
                '}';
    }
}
