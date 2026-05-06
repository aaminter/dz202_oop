package org.skypro.skyshop.search;
import org.skypro.skyshop.product.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class SearchEngine {
    private final Map<String, Product> products = new HashMap<>();
    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }
    public Map<String, Product> search(String query) {
        Map<String, Product> result = new TreeMap<>();
        for (Product product : products.values()) {
            if (product.getName().toLowerCase().contains(query.toLowerCase())) {
                result.put(product.getName(), product);
            }
        }
        return result;
    }
}