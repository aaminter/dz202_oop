package org.skypro.skyshop;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;
import java.util.Set;
public class App {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();
        engine.add(new Product("Milk", 120));
        engine.add(new Product("Milk", 150));
        engine.add(new Product("Apple", 50));
        engine.add(new Article("Milk benefits", "text"));
        engine.add(new Article("Apple guide", "text"));
        Set<Searchable> results = engine.search("m");
        for (Searchable item : results) {
            System.out.println(item.getName());
        }
    }
}