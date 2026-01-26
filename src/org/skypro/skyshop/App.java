package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();


        Product bread = new Product("Хлеб", 50);
        basket.add(bread);


        for (int i = 0; i < 4; i++) {
            basket.add(new Product("Товар" + i, 100));
        }


        basket.add(new Product("Новый товар", 200));


        basket.print();


        System.out.println("Стоимость: " + basket.getTotalPrice());


        System.out.println("Есть Хлеб: " + basket.contains("Хлеб"));


        System.out.println("Есть Молоко: " + basket.contains("Молоко"));


        basket.clear();


        basket.print();


        System.out.println("Стоимость: " + basket.getTotalPrice());


        System.out.println("Есть Хлеб: " + basket.contains("Хлеб"));
    }
}



