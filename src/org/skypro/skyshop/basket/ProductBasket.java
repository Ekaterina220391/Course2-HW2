package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products = new Product[5];
    private int count;

    public void add(Product product) {
        boolean added = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Невозможно добавить продукт");
        }
    }
        public int getTotalPrice () {
            int total = 0;
            for (int i = 0; i < count; i++) {
                if (products[i] != null) {
                    total += products[i].getPrice();
                }
            }
            return total;
        }

        public void print () {
            if (count == 0) {
                System.out.println("в корзине пусто");
                return;
            }
            for (int i = 0; i < count; i++) {
                System.out.println(products[i].getName() + ": " + products[i].getPrice());
            }
            System.out.println("Итого: " + getTotalPrice());
        }

        public boolean contains (String name){
            for (int i = 0; i < count; i++) {
                if (products[i].getName().equals(name)) {
                    return true;
                }
            }
            return false;
        }

        public void clear () {
            for (int i = 0; i < count; i++) {
                products[i] = null;
            }
            count = 0;
        }
    }








