package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.SearchEngine;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Product apple = new Product("Apple", 50);
        Product banana = new Product("Banana", 30);
        Product milk = new Product("Milk", 120);
        Product milk2 = new Product("Milk", 150);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(milk2);

        basket.printBasket();

        // удаление
        List<Product> removed = basket.removeByName("Milk");

        System.out.println("Удалённые продукты:");
        for (Product p : removed) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }

        basket.printBasket();

        // удаление несуществующего
        List<Product> removedEmpty = basket.removeByName("Tea");

        if (removedEmpty.isEmpty()) {
            System.out.println("Список пуст");
        }

        basket.printBasket();

        // 🔍 поиск
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.addProduct(apple);
        searchEngine.addProduct(banana);
        searchEngine.addProduct(milk);

        Map<String, Product> searchResult = searchEngine.search("a");

        System.out.println("Результаты поиска:");

        // values() → гарантированно отсортировано
        for (Product p : searchResult.values()) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }
    }
}