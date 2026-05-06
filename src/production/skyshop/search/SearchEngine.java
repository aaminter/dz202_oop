package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngine {

    // хранилище товаров
    private final Map<String, Product> products = new HashMap<>();

    // добавление (перезапишет по имени, это ок для задания)
    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    // поиск с возвратом отсортированной Map
    public Map<String, Product> search(String query) {

        // TreeMap автоматически сортирует ключи
        Map<String, Product> result = new TreeMap<>();

        for (Product product : products.values()) {

            if (product.getName().toLowerCase().contains(query.toLowerCase())) {
                result.put(product.getName(), product);
            }
        }

        return result;
    }
}