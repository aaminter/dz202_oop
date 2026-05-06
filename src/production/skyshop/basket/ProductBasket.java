package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductBasket {

    // ключ — имя товара, значение — список товаров с этим именем
    private final Map<String, List<Product>> products = new HashMap<>();

    // Добавление товара
    public void addProduct(Product product) {

        // если списка по имени нет — создаём
        products.computeIfAbsent(product.getName(), k -> new LinkedList<>())
                .add(product);
    }

    // Общая стоимость
    public int getTotalPrice() {
        int sum = 0;

        // перебор всех списков
        for (List<Product> productList : products.values()) {

            // перебор внутри списка
            for (Product product : productList) {
                sum += product.getPrice();
            }
        }

        return sum;
    }

    // Печать корзины
    public void printBasket() {

        if (products.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }

        // внешний цикл по Map
        for (List<Product> productList : products.values()) {

            // внутренний цикл по List
            for (Product product : productList) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }

        System.out.println("Итого: " + getTotalPrice());
    }

    // Проверка наличия товара
    public boolean containsProduct(String name) {
        return products.containsKey(name);
    }

    // Очистка корзины
    public void clear() {
        products.clear();
    }

    // Удаление всех товаров по имени
    public List<Product> removeByName(String name) {

        // удаляем сразу весь список по ключу
        List<Product> removed = products.remove(name);

        // если ничего не было — вернуть пустой список
        return removed != null ? removed : new LinkedList<>();
    }
}