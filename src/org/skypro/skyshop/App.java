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
        Article article = new Article("О молоке", "Молоко полезно...");
        System.out.println(article.toString());
        System.out.println(article.getStringRepresentation());
        Article milkArticle = new Article("О молоке", "Молоко содержит кальций");
        System.out.println("=== Article ===");
        System.out.println(milkArticle);  // Только название + текст!
        SearchEngine engine = new SearchEngine(10);
        engine.add(milkArticle);
        printResults(engine.search("молоко"));
    }
    public static void printResults(Searchable[] results) {
        for (Searchable result : results) {
            if (result != null) {
                System.out.println(result.getStringRepresentation());
            }
        }
    }
}