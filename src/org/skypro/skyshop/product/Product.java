package org.skypro.skyshop.product;

import org.skypro.skyshop.Searchable;

public abstract class Product implements Searchable {
    protected final  String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String getSearchTerm() {
        return getName();  // Термин поиска = имя товара
    }

    @Override
    public String getType() {
        return "PRODUCT";  // Тип = PRODUCT
    }
    public abstract int getPrice();

    public abstract boolean isSpecial();
}
