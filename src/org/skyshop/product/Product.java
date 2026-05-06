package org.skypro.skyshop.product;
import org.skypro.skyshop.search.Searchable;
import java.util.Objects;
public class Product implements Searchable {
    private final String name;
    private final int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}