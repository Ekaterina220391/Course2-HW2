package org.skypro.skyshop.article;

import org.skypro.skyshop.Searchable;

public  class Article implements Searchable {
    private final String nameArticle;
    private final String textArticle;

    public Article(String nameArticle, String textArticle) {
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    @Override
    public String getSearchTerm() {
        return nameArticle + " " + textArticle;
    }

    @Override
    public String getType() {

        return "ARTICLE";
    }

    public String getName() {
        return nameArticle;  // Имя = название статьи
    }

    @Override
    public String toString() {
        return nameArticle + "\n" + textArticle;
    }
}


