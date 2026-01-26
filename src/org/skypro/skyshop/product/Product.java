package org.skypro.skyshop.product;

public class Product {
    private String name;
    private int price;

    public Product(String nameProduct, int priceProduct) {
        this.name = nameProduct;
        this.price = priceProduct;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
