package Altklausur;

public class Car {
    private String brand;
    private String color;
    private double price;

    public Car (String b, String c, double p) {
        price = p;
        color = c;
        brand = b;
    }

    public Car (String b, String c) {
        brand = b;
        color = c;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPrice (double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
