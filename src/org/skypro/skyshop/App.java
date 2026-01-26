package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        // Добавление продукта
        Product bread = new Product("Хлеб", 50);
        basket.add(bread);

        // Заполняем корзину полностью
        for (int i = 0; i < 4; i++) {
            basket.add(new Product("Товар" + i, 100));
        }

        // Добавление в заполненную корзину
        basket.add(new Product("Новый товар", 200));  // Выведет "Невозможно добавить продукт"

        // Печать с товарами
        basket.print();

        // Получение стоимости
        System.out.println("Стоимость: " + basket.getTotalPrice());

        // Поиск существующего
        System.out.println("Есть Хлеб: " + basket.contains("Хлеб"));

        // Поиск несуществующего
        System.out.println("Есть Молоко: " + basket.contains("Молоко"));

        // Очистка
        basket.clear();

        // Печать пустой
        basket.print();

        // Стоимость пустой
        System.out.println("Стоимость: " + basket.getTotalPrice());

        // Поиск в пустой
        System.out.println("Есть Хлеб: " + basket.contains("Хлеб"));
    }
}



