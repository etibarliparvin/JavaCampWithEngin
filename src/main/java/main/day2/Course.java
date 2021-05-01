package main.day2;

public class Course {

    private int id;
    private String name;
    private Double price;

    public Course() {
    }

    public Course(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Course setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Course setPrice(Double price) {
        this.price = price;
        return this;
    }
}
