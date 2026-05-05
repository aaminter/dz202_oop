package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product apple = new Product("Apple", 50);
        Product banana = new Product("Banana", 30);
        Product milk = new Product("Milk", 120);
        Product bread = new Product("Bread", 70);
        Product cheese = new Product("Cheese", 200);
        Product coffee = new Product("Coffee", 300);

        ProductBasket basket = new ProductBasket();

        // 1. Добавление продукта
        basket.addProduct(apple);

        // 2. Заполнение корзины + переполнение
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(coffee); // должно быть "Невозможно добавить продукт"

        // 3. Печать
        basket.printBasket();

        // 4. Стоимость
        System.out.println("Стоимость: " + basket.getTotalPrice());

        // 5. Поиск существующего
        System.out.println("Есть Milk? " + basket.containsProduct("Milk"));

        // 6. Поиск отсутствующего
        System.out.println("Есть Tea? " + basket.containsProduct("Tea"));

        // 7. Очистка
        basket.clear();

        // 8. Пустая корзина
        basket.printBasket();

        // 9. Стоимость пустой
        System.out.println("Стоимость: " + basket.getTotalPrice());

        // 10. Поиск в пустой
        System.out.println("Есть Apple? " + basket.containsProduct("Apple"));
    }
}