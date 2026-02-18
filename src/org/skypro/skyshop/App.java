package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.article.Article;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Тестирование корзины (как раньше)
        ProductBasket basket = new ProductBasket();
        basket.add(new SimpleProduct("Хлеб", 50));
        basket.add(new DiscountedProduct("Молоко", 100, 20));
        basket.add(new FixPriceProduct("Абонемент"));

        System.out.println("=== КОРЗИНА ===");
        basket.print();
        basket.clear();

        // 1. Создание SearchEngine
        SearchEngine engine = new SearchEngine(10);

        // 2. Добавление всех товаров из корзины
        engine.add(new SimpleProduct("Хлеб", 50));
        engine.add(new DiscountedProduct("Молоко", 100, 20));
        engine.add(new FixPriceProduct("Абонемент"));
        engine.add(new SimpleProduct("Яблоки", 80));
        engine.add(new DiscountedProduct("Сыр", 200, 25));
        engine.add(new FixPriceProduct("Курс Java"));

        // 3. Добавление статей
        engine.add(new Article("О молоке", "Молоко содержит кальций и полезно для костей"));
        engine.add(new Article("О фруктах", "Яблоки богаты витаминами и клетчаткой"));
        engine.add(new Article("О сыре", "Сыр — ценный источник белка и кальция"));

        // 4. Демонстрация поиска
        System.out.println("\n=== ПОИСК 'молок' ===");
        printResults(engine.search("молок"));

        System.out.println("\n=== ПОИСК 'яблок' ===");
        printResults(engine.search("яблок"));

        System.out.println("\n=== ПОИСК 'кальций' ===");
        printResults(engine.search("кальций"));

        System.out.println("\n=== ПОИСК 'хлеб' ===");
        printResults(engine.search("хлеб"));
    }

    // Вспомогательный метод для вывода результатов
    private static void printResults(Searchable[] results) {
        for (Searchable result : results) {
            if (result != null) {
                System.out.println(result.getStringRepresentation());
            }
        }
    }
}


