package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.SearchEngine;

import java.util.List;

// Точка входа в приложение
public class App {
    public static void main(String[] args) {

        // Создаём товары
        Product apple = new Product("Apple", 50);
        Product banana = new Product("Banana", 30);
        Product milk = new Product("Milk", 120);
        Product milk2 = new Product("Milk", 150);

        // Создаём корзину
        ProductBasket basket = new ProductBasket();

        // Добавляем товары в корзину
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(milk2);

        // Печатаем корзину
        basket.printBasket();

        // Удаляем существующий товар (Milk)
        List<Product> removed = basket.removeByName("Milk");

        System.out.println("Удалённые продукты:");

        // Вывод удалённых товаров
        for (Product p : removed) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }

        // Проверяем состояние корзины после удаления
        basket.printBasket();

        // Пытаемся удалить несуществующий товар
        List<Product> removedEmpty = basket.removeByName("Tea");

        // Проверяем, что список пуст
        if (removedEmpty.isEmpty()) {
            System.out.println("Список пуст");
        }

        // Снова печатаем корзину
        basket.printBasket();

        // Создаём поисковый движок
        SearchEngine searchEngine = new SearchEngine();

        // Добавляем товары в поиск
        searchEngine.addProduct(apple);
        searchEngine.addProduct(banana);
        searchEngine.addProduct(milk);
        searchEngine.addProduct(milk2);

        // Выполняем поиск
        List<Product> searchResult = searchEngine.search("Milk");

        System.out.println("Результаты поиска:");

        // Выводим результаты поиска
        for (Product p : searchResult) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }
    }
}