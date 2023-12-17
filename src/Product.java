import java.util.*;
public class Product {
    private String name;
    private double manufacturerPrice;

    public Product(String name, double manufacturerPrice) {
        this.name = name;
        this.manufacturerPrice = manufacturerPrice;
    }

    public String getName() {
        return name;
    }

    public double getManufacturerPrice() {
        return manufacturerPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}