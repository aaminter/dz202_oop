package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.LinkedList;
import java.util.List;

// Класс поискового движка
public class SearchEngine {

    // Список всех доступных товаров
    private final List<Product> products = new LinkedList<>();

    // Добавление товара в поисковую базу
    public void addProduct(Product product) {
        products.add(product);
    }

    // Поиск товаров по строке (частичное совпадение)
    public List<Product> search(String query) {

        // Список результатов поиска
        List<Product> result = new LinkedList<>();

        // Проходим по всем товарам
        for (Product product : products) {

            // Проверяем, содержит ли название запрос (без учёта регистра)
            if (product.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(product);
            }
        }

        // Возвращаем ВСЕ найденные результаты
        return result;
    }
}