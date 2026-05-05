package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Класс корзины пользователя
public class ProductBasket {

    // Список товаров (LinkedList выбран, т.к. часто добавляем/удаляем)
    private final List<Product> products = new LinkedList<>();

    // Добавление товара в корзину
    public void addProduct(Product product) {
        products.add(product); // просто добавляем в список
    }

    // Подсчёт общей стоимости корзины
    public int getTotalPrice() {
        int sum = 0;

        // Проходим по всем товарам и суммируем цены
        for (Product product : products) {
            sum += product.getPrice();
        }

        return sum;
    }

    // Печать содержимого корзины
    public void printBasket() {

        // Если корзина пустая — выводим сообщение
        if (products.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }

        // Выводим каждый товар
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }

        // Выводим итоговую сумму
        System.out.println("Итого: " + getTotalPrice());
    }

    // Проверка наличия товара по имени
    public boolean containsProduct(String name) {

        // Проверяем каждый товар
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return true; // нашли совпадение
            }
        }

        return false; // не нашли
    }

    // Очистка корзины
    public void clear() {
        products.clear(); // очищаем список полностью
    }

    // Удаление всех товаров с заданным именем
    public List<Product> removeByName(String name) {

        // Список удалённых товаров (вернём его)
        List<Product> removed = new LinkedList<>();

        // Используем Iterator — это важно для безопасного удаления
        Iterator<Product> iterator = products.iterator();

        // Проходим по списку
        while (iterator.hasNext()) {
            Product product = iterator.next();

            // Если имя совпадает
            if (product.getName().equals(name)) {

                // Сохраняем удалённый товар
                removed.add(product);

                // Удаляем через iterator (иначе будет ошибка)
                iterator.remove();
            }
        }

        // Возвращаем список удалённых товаров (может быть пустым)
        return removed;
    }
}