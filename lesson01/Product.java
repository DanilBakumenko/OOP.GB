package lesson01;

public class Product {

    protected String name;

    protected String brand;

    protected double price;

    public String getName() {
        return name;
    }
    

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        chekName(name);
    }

    public void setBrand(String brand) {
        chekBrand(brand);
    }

    public void setPrise(double price) {
        chekPrice(price);
    }

    public Product() {
        this("Noname");

    }

    public Product(String name) {
        this(name, "Noname");

    }

    public Product(String name, String brand) {
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price) {
        chekName(name);
        chekBrand(brand);
        chekPrice(price);
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", name, brand, price);
    }

    private void chekName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "Noname";
        } else {
            this.name = name;
        }
    }

    private void chekBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "Noname";
        } else {
            this.brand = brand;
        }
    }

    private void chekPrice(double price) {
        if (price < 100) {
            throw new RuntimeException("Некорректная цена");
        }

        this.price = price;
    }
}