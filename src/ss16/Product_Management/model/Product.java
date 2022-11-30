package ss16.Product_Management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String maker;
    private double price;

    public Product() {
    }

    public Product(String id, String name, String maker, double price) {
        this.id = id;
        this.name = name;
        this.maker = maker;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
