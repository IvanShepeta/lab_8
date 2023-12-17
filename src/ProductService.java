import java.util.*;
public class ProductService {
    private Set<OnlineStore> onlineStores;

    public ProductService() {
        this.onlineStores = new HashSet<>();
    }

    public void addOnlineStore(OnlineStore onlineStore) {
        onlineStores.add(onlineStore);
    }

    public double findMinPrice(Product product) {
        double minPrice = Double.MAX_VALUE;

        for (OnlineStore store : onlineStores) {
            double price = store.getProductPrice(product);
            if (price < minPrice) {
                minPrice = price;
            }
        }

        return minPrice;
    }

    public Set<OnlineStore> findStoresWithMinPrice(Product product) {
        double minPrice = findMinPrice(product);
        Set<OnlineStore> storesWithMinPrice = new HashSet<>();

        for (Iterator<OnlineStore> iterator = onlineStores.iterator(); iterator.hasNext();) {
            OnlineStore store = iterator.next();
            if (store.getProductPrice(product) == minPrice) {
                storesWithMinPrice.add(store);
            }
        }

        return storesWithMinPrice;
    }

    public boolean hasStoreWithCheaperPrices(Product product) {
        for (Iterator iterator = onlineStores.iterator(); iterator.hasNext();) {
            OnlineStore store = (OnlineStore) iterator.next();
            if (store.getProductPrice(product) >= product.getManufacturerPrice()) {
                return false;
            }
        }
        return true;
    }
}