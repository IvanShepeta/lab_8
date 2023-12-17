import java.util.*;
public class OnlineStore {
    private String storeName;
    private Set<Product> products;
    private Map<Product, Double> productPrices;

    public OnlineStore(String storeName) {
        this.storeName = storeName;
        this.products = new HashSet<>();
        this.productPrices = new HashMap<>();
    }

    public void addProduct(Product product, double price) {
        products.add(product);
        productPrices.put(product, price);
    }

    public String getStoreName() {
        return storeName;
    }

    public Double getProductPrice(Product product) {
        return productPrices.getOrDefault(product, null);
    }

    public Set<Product> getAvailableProducts() {
        return new HashSet<>(products);
    }
}