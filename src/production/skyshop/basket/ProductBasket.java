//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.skypro.skyshop.basket;

import java.io.PrintStream;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public ProductBasket() {
    }

    public void addProduct(Product product) {
        for(int i = 0; i < this.products.length; ++i) {
            if (this.products[i] == null) {
                this.products[i] = product;
                return;
            }
        }

        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalPrice() {
        int sum = 0;

        for(Product product : this.products) {
            if (product != null) {
                sum += product.getPrice();
            }
        }

        return sum;
    }

    public void printBasket() {
        boolean isEmpty = true;

        for(Product product : this.products) {
            if (product != null) {
                PrintStream var10000 = System.out;
                String var10001 = product.getName();
                var10000.println(var10001 + ": " + product.getPrice());
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + this.getTotalPrice());
        }

    }

    public boolean containsProduct(String name) {
        for(Product product : this.products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void clear() {
        for(int i = 0; i < this.products.length; ++i) {
            this.products[i] = null;
        }

    }
}
