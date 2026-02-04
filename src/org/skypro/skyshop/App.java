package org.skypro.skyshop;

import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();


        basket.add(new SimpleProduct("Хлеб", 50));

        basket.add(new DiscountedProduct("Молоко", 100, 20));
        basket.add(new DiscountedProduct("Сыр", 200, 50));


        basket.add(new FixPriceProduct("Абонемент"));
        basket.add(new FixPriceProduct("Гарантия"));


        System.out.println("=== ИСХОДНОЕ СОСТОЯНИЕ ===");
        basket.print();


        System.out.println("\n=== ПОИСК ===");
        System.out.println("Есть Молоко: " + basket.contains("Молоко"));
        System.out.println("Есть Хлеб: " + basket.contains("Хлеб"));
        System.out.println("Есть Яблоко: " + basket.contains("Яблоко"));


        System.out.println("\n=== ПЕРЕПОЛНЕНИЕ ===");
        basket.add(new SimpleProduct("6-й товар", 100));  // Ошибка!


        System.out.println("\n=== ПОСЛЕ ОЧИСТКИ ===");
        basket.clear();
        basket.print();
        System.out.println("Есть Молоко: " + basket.contains("Молоко"));
    }
}