package org.skypro.skyshop.product;

// Класс, представляющий товар
public class Product {

    // Название товара (неизменяемое после создания)
    private final String name;

    // Цена товара (неизменяемая)
    private final int price;

    // Конструктор задаёт значения один раз при создании объекта
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Геттер для получения названия
    public String getName() {
        return name;
    }

    // Геттер для получения цены
    public int getPrice() {
        return price;
    }
}