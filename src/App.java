//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Product apple = new Product("Apple", 50);
        Product banana = new Product("Banana", 30);
        Product milk = new Product("Milk", 120);
        Product bread = new Product("Bread", 70);
        Product cheese = new Product("Cheese", 200);
        Product coffee = new Product("Coffee", 300);
        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(coffee);
        basket.printBasket();
        System.out.println("Стоимость: " + basket.getTotalPrice());
        System.out.println("Есть Milk? " + basket.containsProduct("Milk"));
        System.out.println("Есть Tea? " + basket.containsProduct("Tea"));
        basket.clear();
        basket.printBasket();
        System.out.println("Стоимость: " + basket.getTotalPrice());
        System.out.println("Есть Apple? " + basket.containsProduct("Apple"));
    }
}
